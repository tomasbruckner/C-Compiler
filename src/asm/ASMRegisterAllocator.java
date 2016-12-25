package asm;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import util.Constant;
import util.ISA;

import java.util.*;

/**
 * Created by Filip on 09-Nov-16.
 */
public class ASMRegisterAllocator {

// LOCATION ///////////////////////////////////////////////////////////////////
    private class Location {
        public static final int L_REGISTER = 0;
        public static final int L_MEMORY = 1;
        public static final int L_UNKNOWN = 2;

        private int type;
        private long address; // stack ptr offset

        private boolean spilled; // has been already spilled

        public Location(int type, long address) {
            this.type = type;
            this.address = address;
            this.spilled = false;
        }

        public Location(int type, long address, boolean spilled) {
            this.type = type;
            this.address = address;
            this.spilled = spilled;
        }

        public void change(int type) {
            this.type = type;
        }

        public void setAddress(long address) { this.address = address; }

        public long getAddress() { return  this.address; }

        public int getType() {
            return this.type;
        }

        public void spilled() { this.spilled = true; }

        public boolean wasSpilled() { return this.spilled; }
    }
///////////////////////////////////////////////////////////////////////////////

// SCOPE //////////////////////////////////////////////////////////////////////
    private class Scope {
        private long offset = 0;
        private int tempVarIndex = 0;
        public int index;

        private Map<ASMVariable, Location> stackMap = new HashMap<>();

        public Scope (int index) { this.index = index; }

        public long getOffset() {
            return this.offset;
        }

        public void addToOffset(long addend) {
            this.offset += addend;
        }


        public ASMVariable getTempVar() {
            // create a new variable
            ASMVariable var = new ASMVariable(this.tempVarIndex);
            this.tempVarIndex++;
            // do not assume location of the variable
            Location loc = new Location(Location.L_UNKNOWN, 0);
            var.setScope(this.index);

            // save the variable in the current scope map
            this.putVar(var, loc);

            return var;
        }

        public ASMVariable addVariable(String name, Constant.Type type) {
            // create a new variable
            ASMVariable var = new ASMVariable(name, type);
            // do not assume location of the variable
            Location loc = new Location(Location.L_UNKNOWN, 0);
            var.setScope(this.index);
            System.out.print("Var: " + name + " added into scope: " + this.index + "\n");

            // save the variable in the current scope map
            this.putVar(var, loc);

            return var;
        }

        // add variable with known memory location (parameters)
        public void addVariable(String name, Constant.Type type, long offset) {
            // create a new variable
            ASMVariable var = new ASMVariable(name, type);
            // variable is already on the stack
            Location loc = new Location(Location.L_MEMORY, offset, true);
            var.setScope(this.index);

            // save the variable in the current scope map
            this.putVar(var, loc);
        }

        public Location getVarLocation(ASMVariable var) {
            Location location = null;
            if(this.stackMap.containsKey(var)) {
                location = this.stackMap.get(var);
            }

            return location;
        }

        public ASMVariable findVar(ASMVariable var) {
            boolean found = false;

            for (Map.Entry<ASMVariable, Location> entry : this.stackMap.entrySet()) {
                ASMVariable curVar = entry.getKey();
                if (curVar.equals(var)) {
                    var = curVar;
                    found = true;
                    break;
                }
            }

            if(!found) {
                var = null;
            }

            return var;
        }

        public void putVar(ASMVariable var, Location loc) {
            this.stackMap.put(var, loc);
        }

        public void removeVar(ASMVariable var) { this.stackMap.remove(var); }

        // TODO should be implemented using iterator
        public Map<ASMVariable, Location> getVarMap() { return this.stackMap; }
    }
///////////////////////////////////////////////////////////////////////////////

// REGISTER FIELD ENTRY ///////////////////////////////////////////////////////
    private class RFEntry {
        public ASMRegister register;
        public ASMVariable variable;

        public RFEntry(ASMRegister register, ASMVariable variable) {
            this.register = register;
            this.variable = variable;
        }

        public boolean isEmpty() {
            boolean empty = (this.variable == null) ? true : this.variable.isEmpty();
            return empty;
        }
    }
///////////////////////////////////////////////////////////////////////////////

    private ASMProgram program;

    private List<Scope> scopes = new ArrayList<>();
    private int scopeIndex;

    private int SPILL_SIZE = ISA.REGISTER_SIZE;

    // unique instances of all architecture registers
    private RFEntry[] registerField = new RFEntry[ISA.REGCNT];
    private List<RFEntry> registerStack = new ArrayList<RFEntry>();
//    private int RS_LAST = ISA.GPRCNT - 1;

    public ASMRegisterAllocator(ASMProgram program) {
        this.program = program;

        // initialize the instances representing the registers
        for (int index = 0; index < ISA.REGCNT; index++) {
            ASMRegister register = new ASMRegister(index);
            ASMVariable variable = new ASMVariable();
            RFEntry newEntry = new RFEntry(register, variable);
            this.registerField[index] = newEntry;
        }

        // fill the register stack with GPRs
        for (int index = ISA.GPRFIRST; index < (ISA.GPRFIRST + ISA.GPRCNT); index++) {
            this.registerStack.add(this.registerField[index]);
        }

        this.scopeIndex = 0;
    }

    //  --- VARIABLE RELATED ---
    private Scope getCurScope() { return this.scopes.get(0); }

    private Scope getVariableScope(ASMVariable var) {
        Scope found = null;

        for (Scope scope : this.scopes) {
            System.out.print("Searching scope: " + scope.index + "\n");
            if (scope.findVar(var) != null) {
                found = scope;
                System.out.print("Var: " + var.getName() + " found in scope: " + scope.index + "\n");
                break;
            }
        }

        return found;
    }

    public void newScope() {
        this.scopes.add(0, new Scope(this.scopeIndex));
        System.out.print("Scope: " + this.scopeIndex + " added\n");
        this.scopeIndex++;
    }

    public void killScope() {
        Scope scope = this.getCurScope();
        Map<ASMVariable, Location> varMap = scope.getVarMap();
        List<ASMVariable> vars = new ArrayList<>();

        // variables are not valid after end of the scope
        for (Map.Entry<ASMVariable, Location> entry : varMap.entrySet()) {
            ASMVariable curVar = entry.getKey();
            vars.add(curVar);
        }

        for (ASMVariable var : vars) {
            this.killVariable(var, true);
        }

        // destroy the current scope
        this.scopes.remove(0);
    }

    public ASMVariable getTempVar() {
        Scope scope = getCurScope();
        return scope.getTempVar();
    }

    // should not be called from inside of the register allocator
    public ASMVariable checkVariable(String name) {
        ASMVariable var = null;

        // try to find if the variable exists in the topmost scope
        for (Scope scope : this.scopes) {
            ASMVariable varTest = new ASMVariable(name);
            varTest.setScope(scope.index);
            var = scope.findVar(varTest);
            if (var != null) {
                System.out.print("Variable '" + name + "' found in scope " + scope.index + "\n");
                break;
            }
        }

        return var;
    }

    private Location getVariableLocation(ASMVariable var) {
        Location location = null;
        Scope scope = this.getVariableScope(var);

        if (scope != null) {
            location = scope.getVarLocation(var);
        }

        return location;
    }

    public Constant.Type getVariableDataType(ASMVariable var) {
        Constant.Type type = null;
        ASMVariable varTemp = null;
        Scope scope = this.getVariableScope(var);

        if (scope != null) {
            varTemp = scope.findVar(var);
            type = varTemp.getType();
        }

        return type;
    }

    public void declareVariable(String name, Constant.Type type) {
        Scope scope = getCurScope();
        scope.addVariable(name, type);
    }

    public void addParameter(String name, Constant.Type type, long offset) {
        Scope scope = getCurScope();
        scope.addVariable(name, type, offset);
    }

    public void killVariable(ASMVariable var) {
        this.killVariable(var, false);
    }

    public void killVariable(ASMVariable var, boolean force) {
        // program variables can not be safely killed
        // after end of a block, even user variables are forced to be deleted
        if (var.isTemporary() || force) {
            System.out.print("Kill var: " + var.getName());

            Scope scope = this.getVariableScope(var);
            if (scope == null) {
                System.err.print("Variable '" + var.getText() + "' not found!\n");
                System.exit(Constant.INTERNAL_ERROR);
            }

            var = scope.findVar(var);
            Location location = scope.getVarLocation(var);

            // set the register free
            if (location.getType() == Location.L_REGISTER) {
                RFEntry entry = this.findRFEntry(var);
                System.out.print(" from register: " + entry.register.getText() + "\n");
                entry.variable = null;
                // move the empty register to the top of the stack
                this.registerStack.remove(entry);
                this.registerStack.add(0, entry);
            }

            scope.removeVar(var);
        }
    }

    public boolean varIsDefined(ASMVariable var) {
        boolean hasVal = true;

        if (this.getVariableLocation(var).getType() == Location.L_UNKNOWN) {
            hasVal = false;
        }

        return hasVal;
    }


    //  --- REGISTER RELATED ---
    private ASMRegister assignRegister(ASMVariable var) {
        // get the LRU register and remove it from the register stack
        RFEntry rfEntry = this.registerStack.get(0);
        this.registerStack.remove(0);
        // if register is used spill it
        if (!rfEntry.isEmpty()) {
            this.spill(rfEntry);
        }

        rfEntry.variable = var;
        this.registerStack.add(rfEntry);

        return rfEntry.register;
    }

    private ASMRegister findRegister(ASMVariable var) {
        ASMRegister register = null;
        RFEntry entry = this.findRFEntry(var);

        if (entry != null) {
            register = entry.register;
        }

        return register;
    }

    private RFEntry findRFEntry(ASMVariable var) {
        RFEntry found = null;

        for (RFEntry entry : this.registerStack) {
            if (!entry.isEmpty() && entry.variable.equals(var)) {
                found = entry;
                break;
            }
        }

        return found;
    }

    private void spill(RFEntry rfEntry) {
        Scope scope = this.getCurScope();
        ASMVariable varVictim = rfEntry.variable;
        ASMRegister regVictim = rfEntry.register;

        // try to spill the variable to its previous position on the stack
        Location location = scope.getVarLocation(varVictim);
        long offset = 0;

        if(location == null) {
            System.err.print("Variable '" + varVictim.getText() + "' not found in the scope!\n");
            System.exit(Constant.INTERNAL_ERROR);
        }

        // current location has to be set to register
        if(location.getType() != Location.L_REGISTER) {
            System.err.print("Variable '" + varVictim.getText() + "' location should have been set to register!\n");
            System.exit(Constant.INTERNAL_ERROR);
        }

        // variable has been spilled before
        if(location.wasSpilled()) {
            offset = location.getAddress();

            ASMRegister regFramePtr = this.getFramePtrReg();
            ASMImmediate immOffset = new ASMImmediate(offset);
            String comment = "spill2 " + varVictim.getText();
            this.program.addInstruction(ISA.ASMOpCode.SW, regVictim, immOffset, regFramePtr, comment);
        }
        // variable spilled for the first time
        else {
            // update the offset from the frame pointer
            scope.addToOffset(this.SPILL_SIZE);
            offset = scope.getOffset();
            location.setAddress(offset);
            location.spilled();

            ASMRegister regStackPtr = this.getStackPtrReg();
            ASMImmediate immOffset = new ASMImmediate(this.SPILL_SIZE);
            ASMImmediate immZero = new ASMImmediate(0);
            this.program.addInstruction(ISA.ASMOpCode.SUBU, regStackPtr, immOffset);
            String comment = "spill1 " + varVictim.getText();
            this.program.addInstruction(ISA.ASMOpCode.SW, regVictim, immZero, regStackPtr, comment);
        }

        location.change(Location.L_MEMORY);
    }

    public ASMRegister getRegister(ASMVariable var) {
        Location location = this.getVariableLocation(var);
        ASMRegister register = null;

        // variable already in register
        if (location.getType() == Location.L_REGISTER) {
            RFEntry entry = this.findRFEntry(var);
            if (entry == null) {
                System.err.print("Variable '" + var.getText() + "' should have been in register but not found!\n");
                System.exit(Constant.INTERNAL_ERROR);
            }

            // register was used, move it to the bottom of the stack
            this.registerStack.remove(entry);
            this.registerStack.add(entry);

            register = entry.register;
        }
        // reload from memory
        else if (location.getType() == Location.L_MEMORY) {
            register = this.assignRegister(var);
            long offset = -location.getAddress();

            ASMImmediate immOffset = new ASMImmediate(offset);
            ASMRegister regFramePtr = this.getFramePtrReg();
            String comment = "reload " + var.getText();
            this.program.addInstruction(ISA.ASMOpCode.LW, register, immOffset, regFramePtr, comment);
        }
        // first use of the variable
        else if (location.getType() == Location.L_UNKNOWN) {
            register = this.assignRegister(var);
        }
        else {
            System.err.print("Unreachable\n");
            System.exit(Constant.INTERNAL_ERROR);
        }

        location.change(Location.L_REGISTER);

        return register;
    }

    // used when spilling can not happen, asm temporary reg used if needed
    public ASMRegister getRegisterNoSpill(ASMVariable var) {
        Scope scope = this.getCurScope();
        Location location = scope.getVarLocation(var);
        ASMRegister register = null;

        if (location.getType() == Location.L_REGISTER) {
            register = this.findRegister(var);
            if (register == null) {
                System.err.print("Variable '" + var.getText() + "' should have been in register but not found!\n");
                System.exit(Constant.INTERNAL_ERROR);
            }
        }
        // reload from memory to asm temporary => this does not cause spill
        else if (location.getType() == Location.L_MEMORY) {
            register = this.getAsmTempReg();
            long offset = -location.getAddress();

            ASMImmediate immOffset = new ASMImmediate(offset);
            ASMRegister regFramePtr = this.getFramePtrReg();
            String comment = "reload to asm temp " + var.getText();
            this.program.addInstruction(ISA.ASMOpCode.LW, register, immOffset, regFramePtr, comment);
        }
        else {
            System.err.print("Unreachable\n");
            System.exit(Constant.INTERNAL_ERROR);
        }

        return register;
    }

    public List<ASMRegister> saveRegisters() {
        List<ASMRegister> regs = new ArrayList<ASMRegister>();
        // save the reserved registers
        regs.add(this.getFramePtrReg());
        regs.add(this.getReturnAddrReg());

        // save used gprs
        for (RFEntry entry : this.registerStack) {
            if (! entry.isEmpty()) {
                regs.add(entry.register);
            }
        }

        int regCnt = regs.size();

        if (regCnt > 0) {
            ASMRegister regStackPtr = this.getStackPtrReg();
            ASMImmediate immSize = new ASMImmediate(this.SPILL_SIZE * regCnt);

            // allocate space on the stack
            this.program.addInstruction(ISA.ASMOpCode.SUBU, regStackPtr, immSize);

            int offset = this.SPILL_SIZE * (regs.size() - 1);
            for (ASMRegister reg : regs) {
                ASMImmediate immOffset = new ASMImmediate(offset);
                this.program.addInstruction(ISA.ASMOpCode.SW, reg, immOffset, regStackPtr);
                offset -= this.SPILL_SIZE;
            }
        }

        return regs;
    }

    public void restoreRegisters(List<ASMRegister> regs) {
        int regCnt = regs.size();

        if (regCnt > 0) {
            // restoring has to be done in the reverse order
            List<ASMRegister> regsReverse = regs.subList(0, regCnt);
            Collections.reverse(regsReverse);

            ASMRegister regStackPtr = this.getStackPtrReg();

            int offset = 0;
            // all the saved registers can be found in regs
            for (ASMRegister reg : regsReverse) {
                ASMImmediate immOffset = new ASMImmediate(offset);
                this.program.addInstruction(ISA.ASMOpCode.LW, reg, immOffset, regStackPtr);
                offset += this.SPILL_SIZE;
            }

            // free the space on the stack
            ASMImmediate immSize = new ASMImmediate(this.SPILL_SIZE * regCnt);
            this.program.addInstruction(ISA.ASMOpCode.ADDU, regStackPtr, immSize);
        }
    }

    public ASMRegister getZeroReg() {
        RFEntry entry = this.registerField[ISA.Register.ZERO];
        return entry.register;
    }

    public ASMRegister getAsmTempReg() {
        RFEntry entry = this.registerField[ISA.Register.ASM_TEMPORARY];
        return entry.register;
    }

    public ASMRegister getGlobalPtrReg() {
        RFEntry entry = this.registerField[ISA.Register.GLOBAL_PTR];
        return entry.register;
    }

    public ASMRegister getStackPtrReg() {
        RFEntry entry = this.registerField[ISA.Register.STACK_PTR];
        return entry.register;
    }

    public ASMRegister getFramePtrReg() {
        RFEntry entry = this.registerField[ISA.Register.FRAME_PTR];
        return entry.register;
    }

    public ASMRegister getReturnAddrReg() {
        RFEntry entry = this.registerField[ISA.Register.RETURN_ADDR];
        return entry.register;
    }

    public ASMRegister getReturnValReg() {
        RFEntry entry = this.registerField[ISA.Register.RETURN_VALUE];
        return entry.register;
    }
}
