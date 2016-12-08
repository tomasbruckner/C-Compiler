package asm;

import util.Constant;
import util.ISA;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by Filip on 08-Nov-16.
 */
public class ASMProgram {
    private ArrayList<ASMElement> program = new ArrayList<>();
    private ArrayList<ASMData> data = new ArrayList<>();

    private int labelIndex = 0;
    private int stringIndex = 0;
    private ASMRegisterAllocator regAlloc;
    private String file;

    public ASMProgram(String file, ASMRegisterAllocator regAlloc) {
        this.file = file;
        this.regAlloc = regAlloc;
        this.addDirective(".text");
        this.addDirective(".org 0");
        ASMRegister regStackPtr = this.regAlloc.getStackPtrReg();
        ASMRegister regFramePtr = this.regAlloc.getFramePtrReg();
        ASMImmediate imm = new ASMImmediate(0x4000);
        this.addInstruction(ISA.ASMOpCode.MOVSI, regStackPtr, imm);
        this.addInstruction(ISA.ASMOpCode.MOV, regFramePtr, regStackPtr);
        ASMLabel labMain = new ASMLabel("main");
        this.addInstruction(ISA.ASMOpCode.JAL, labMain);
        this.addInstruction(ISA.ASMOpCode.BREAK);
    }


    //  --- LABEL RELATED ---
    private String getTempLabelname() {
        String name = "$ltemp" + this.labelIndex;
        this.labelIndex++;

        return name;
    }

    public ASMLabel getTempLabel() {
        String name = this.getTempLabelname();
        ASMLabel label = new ASMLabel(name);
        return label;
    }

    public ASMLabel getTempLabel(String comment) {
        String name = this.getTempLabelname();
        ASMLabel label = new ASMLabel(name, comment);
        return label;
    }

    public void addLabel(String name) {
        ASMLabel label = new ASMLabel(name);
        this.program.add(label);
    }

    public void addDirective(String name) {
        ASMLabel label = new ASMLabel(name, false);
        this.program.add(label);
    }

    public void addLabel(String name, String comment) {
        ASMLabel label = new ASMLabel(name, comment);
        this.program.add(label);
    }

    public void addLabel(ASMLabel label) {
        this.program.add(label);
    }

    public void addLabel(ASMLabel label, String comment) {
        label.addComment(comment);
        this.program.add(label);
    }


    //  --- INSTRUCTION RELATED ---
    private ASMInstruction makeInstruction(ISA.ASMOpCode opCode) {
        ISA.ASMOpDetail instrDetail = ISA.ASMOpDetailMap.get(opCode);
        if (instrDetail.getOpCnt() != 0) {
            System.err.print("Instruction " + instrDetail.getText() + " does not accept 1 operands\n");
            System.exit(Constant.INTERNAL_ERROR);
        }

        ASMInstruction instr = new ASMInstruction(opCode);

        return instr;
    }

    public void addInstruction(ISA.ASMOpCode opCode) {
        ASMInstruction instr = this.makeInstruction(opCode);
        this.program.add(instr);
    }

    public void addInstruction(ISA.ASMOpCode opCode, String comment) {
        ASMInstruction instr = this.makeInstruction(opCode);
        instr.addComment(comment);
        this.program.add(instr);
    }

    private ASMInstruction makeInstruction(ISA.ASMOpCode opCode, ASMOperand op1) {
        ISA.ASMOpDetail instrDetail = ISA.ASMOpDetailMap.get(opCode);
        if (instrDetail.getOpCnt() != 1) {
            System.err.print("Instruction " + instrDetail.getText() + " does not accept 1 operands\n");
            System.exit(Constant.INTERNAL_ERROR);
        }

        ASMInstruction instr = new ASMInstruction(opCode);
        instr.addOperand(op1);

        return instr;
    }

    public void addInstruction(ISA.ASMOpCode opCode, ASMOperand op1) {
        ASMInstruction instr = this.makeInstruction(opCode, op1);
        this.program.add(instr);
    }

    public void addInstruction(ISA.ASMOpCode opCode, ASMOperand op1, String comment) {
        ASMInstruction instr = this.makeInstruction(opCode, op1);
        instr.addComment(comment);
        this.program.add(instr);
    }

    private ASMInstruction makeInstruction(ISA.ASMOpCode opCode, ASMOperand op1, ASMOperand op2) {
        ISA.ASMOpDetail instrDetail = ISA.ASMOpDetailMap.get(opCode);
        if (instrDetail.getOpCnt() != 2) {
            System.err.print("Instruction " + instrDetail.getText() + " does not accept 2 operands\n");
            System.exit(Constant.INTERNAL_ERROR);
        }

        ASMInstruction instr = new ASMInstruction(opCode);
        instr.addOperand(op1);
        instr.addOperand(op2);

        return instr;
    }

    public void addInstruction(ISA.ASMOpCode opCode, ASMOperand op1, ASMOperand op2) {
        ASMInstruction instr = this.makeInstruction(opCode, op1, op2);
        this.program.add(instr);
    }

    public void addInstruction(ISA.ASMOpCode opCode, ASMOperand op1, ASMOperand op2, String comment) {
        ASMInstruction instr = this.makeInstruction(opCode, op1, op2);
        instr.addComment(comment);
        this.program.add(instr);
    }

    private ASMInstruction makeInstruction(ISA.ASMOpCode opCode, ASMOperand op1, ASMOperand op2,
                                           ASMOperand op3) {
        ISA.ASMOpDetail instrDetail = ISA.ASMOpDetailMap.get(opCode);
        if (instrDetail.getOpCnt() != 3) {
            System.err.print("Instruction " + instrDetail.getText() + " does not accept 3 operands\n");
            System.exit(Constant.INTERNAL_ERROR);
        }

        ASMInstruction instr = new ASMInstruction(opCode);
        instr.addOperand(op1);
        instr.addOperand(op2);
        instr.addOperand(op3);

        return instr;
    }

    public void addInstruction(ISA.ASMOpCode opCode, ASMOperand op1, ASMOperand op2,
                               ASMOperand op3) {
        ASMInstruction instr = this.makeInstruction(opCode, op1, op2, op3);
        this.program.add(instr);
    }

    public void addInstruction(ISA.ASMOpCode opCode, ASMOperand op1, ASMOperand op2,
                               ASMOperand op3, String comment) {
        ASMInstruction instr = this.makeInstruction(opCode, op1, op2, op3);
        instr.addComment(comment);
        this.program.add(instr);
    }


    //  --- DATA RELATED ---
    public void addString(ASMLabel name, String value) {
        ASMString string = new ASMString(name, value);
        this.data.add(string);
    }

    public ASMLabel getStringLabel() {
        String name = "str" + this.stringIndex;
        this.stringIndex++;
        ASMLabel label = new ASMLabel(name);

        return label;
    }


    public void finalize() {
        if (this.data.size() > 0) {
            this.addDirective(".data");
            this.program.addAll(this.data);
        }
    }


    //  --- OUTPUT ---
    public void printToFile() {
        try{
            PrintWriter writer = new PrintWriter(this.file, "UTF-8");
            for(ASMElement e : this.program) {
                writer.println(e.getText());
            }
            writer.close();
        } catch (IOException e) {
            // do something
        }
    }

    public void debugPrint() {
        for(ASMElement e : this.program) {
            System.out.print(e.getText() + "\n");
        }
    }

    // TODO add method to print into file
}
