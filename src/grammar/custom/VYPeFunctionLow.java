package grammar.custom;

import asm.*;
import grammar.gen.VYPeParserBaseVisitor;
import grammar.gen.VYPeParserParser;
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
        this.program.addLabel(functionName);

        ASMRegisterAllocator registerAllocator = new ASMRegisterAllocator(this.program);
        // new scope has to initialized for the parameters
        registerAllocator.newScope();
        List<String> params = this.program.getFunctionParams(functionName);
        int paramsCnt = params.size();

        if (paramsCnt > 0) {
            // this should be positive, but it is stored the other way round
            long offset = -1 * ISA.REGISTER_SIZE * (paramsCnt - 1);
            for (String param : params) {
                registerAllocator.addParameter(param, offset);
                offset += ISA.REGISTER_SIZE;
            }
        }

        // backup stack pointer to the frame pointer
        ASMRegister regFramePtr = registerAllocator.getFramePtrReg();
        ASMRegister regStackPtr = registerAllocator.getStackPtrReg();
        this.program.addInstruction(ISA.ASMOpCode.MOV, regFramePtr, regStackPtr);

        VYPeParserParser.Block_statementsContext block = ctx.block_statements();

        // true = block id function body, do not set the new scope in the block lowerer
        VYPeBlockLow lowBody = new VYPeBlockLow(this.program, registerAllocator, true);
        lowBody.visit(block);

        ASMRegister regRet = registerAllocator.getReturnAddrReg();
        this.program.addInstruction(ISA.ASMOpCode.MOV, regStackPtr, regFramePtr);
        this.program.addInstruction(ISA.ASMOpCode.JR, regRet);

        return null;
    }
}
