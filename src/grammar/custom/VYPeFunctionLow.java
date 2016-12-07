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
    ASMRegisterAllocator regAlloc;

    public VYPeFunctionLow(ASMProgram program, ASMRegisterAllocator regAlloc) {
        this.program = program;
        this.regAlloc = regAlloc;
    }

    @Override
    public Void visitFunction_definition(VYPeParserParser.Function_definitionContext ctx) {
        String functionName = ctx.Identifier().getText();
        this.program.addLabel(functionName);

//        TODO only one block per function??? nested blocks?
        VYPeParserParser.Block_statementsContext block = ctx.block_statements();

        VYPeFunctionLow funcLowerer = new VYPeFunctionLow(this.program, this.regAlloc);
        funcLowerer.visit(block);

        ASMRegister regRet = this.regAlloc.getReturnAddrReg();
        this.program.addInstruction(ISA.ASMOpCode.JR, regRet);

        return null;
    }

//    TODO probably move to separate class if blocks can be nested
    @Override
    public Void visitBlock_statements(VYPeParserParser.Block_statementsContext ctx) {
        System.out.print("block\n");
        List<VYPeParserParser.StatementContext> statements = ctx.statement();

        for(VYPeParserParser.StatementContext s : statements) {
            VYPeStatementLow statLowerer = new VYPeStatementLow(this.program, this.regAlloc);
            statLowerer.visit(s.getChild(0));
        }

        return null;
    }
}
