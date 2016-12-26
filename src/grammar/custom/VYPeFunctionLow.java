package grammar.custom;

import asm.*;
import grammar.gen.VYPeParserBaseVisitor;
import grammar.gen.VYPeParserParser;
import util.Constant;
import util.ISA;

import java.util.ArrayList;
import java.util.List;

/*************************************************************
 * Filename: VYPEFunctionLow.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 15/10/2016
 *************************************************************/
public class VYPeFunctionLow extends VYPeParserBaseVisitor<Void> {

    ASMProgram program;

    public VYPeFunctionLow(ASMProgram program) {
        this.program = program;
    }

    @Override
    public Void visitFunction_definition(VYPeParserParser.Function_definitionContext ctx) {
        String functionName = ctx.Identifier().getText();
        this.program.setCurrentFunction(functionName);
        if (functionName.equals("main")) {
            this.program.addLabel(functionName);
        }
        else {
            this.program.addLabel("$" + functionName);
        }

        ASMRegisterAllocator registerAllocator = new ASMRegisterAllocator(this.program);

        // backup stack pointer to the frame pointer
        ASMRegister regFramePtr = registerAllocator.getFramePtrReg();
        ASMRegister regStackPtr = registerAllocator.getStackPtrReg();
        this.program.addInstruction(ISA.ASMOpCode.MOV, regFramePtr, regStackPtr);

        // new scope has to initialized for the parameters
        registerAllocator.newScope();
        List<String> params = this.program.getFunctionParams(functionName);
        int paramsCnt = params.size();

        if (paramsCnt > 0) {
            // this should be positive, but it is stored the other way round
            long offset = -1 * ISA.REGISTER_SIZE * (paramsCnt - 1);
            int paramIndex = 0;
            for (String param : params) {
                Constant.Type type = this.program.getParamType(functionName, paramIndex);
                registerAllocator.addParameter(param, type, offset);
                offset += ISA.REGISTER_SIZE;
                paramIndex++;

                // move all the variables into registers - hack because of loop at the start of the body
                ASMVariable varParam = registerAllocator.checkVariable(param);
                ASMRegister regParam = registerAllocator.getRegister(varParam);
            }
        }

        VYPeParserParser.Block_statementsContext block = ctx.block_statements();

        // true = block id function body, do not set the new scope in the block lowerer
        VYPeBlockLow lowBody = new VYPeBlockLow(this.program, registerAllocator, true);
        lowBody.visit(block);

        ASMRegister regRet = registerAllocator.getReturnAddrReg();
        ASMRegister regRetVal = registerAllocator.getReturnValReg();

        // default return value
        if (! registerAllocator.wasReturn()) {
            Constant.Type type = this.program.getFunctionReturnType(functionName);
            String comment = "default return val";

            if (type == Constant.Type.INT || type == Constant.Type.CHAR) {
                ASMImmediate immZero = new ASMImmediate(0);

                this.program.addInstruction(ISA.ASMOpCode.MOVSI, regRetVal, immZero, comment);
            } else if (type == Constant.Type.STRING) {
                ASMRegister regGlobalPtr = registerAllocator.getGlobalPtrReg();
                ASMRegister regZero = registerAllocator.getZeroReg();
                ASMImmediate immOffset = new ASMImmediate(0);
                ASMImmediate immOne = new ASMImmediate(1);

                this.program.addInstruction(ISA.ASMOpCode.MOV, regRetVal, regGlobalPtr, comment);
                // suppress simulator warning
                this.program.addInstruction(ISA.ASMOpCode.SB, regZero, immOffset, regGlobalPtr);
                this.program.addInstruction(ISA.ASMOpCode.ADDU, regGlobalPtr, immOne);
            }

            this.program.addInstruction(ISA.ASMOpCode.MOV, regStackPtr, regFramePtr);
            this.program.addInstruction(ISA.ASMOpCode.JR, regRet);
        }

        registerAllocator.killScope();

        return null;
    }
}
