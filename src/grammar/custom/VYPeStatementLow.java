package grammar.custom;

import asm.*;
import grammar.gen.VYPeParserBaseVisitor;
import grammar.gen.VYPeParserParser;
import util.ISA;

/**
 * Created by Filip on 29-Oct-16.
 */
public class VYPeStatementLow extends VYPeParserBaseVisitor<Void> {

    ASMProgram program;
    ASMRegisterAllocator regAlloc;

    public VYPeStatementLow(ASMProgram program, ASMRegisterAllocator regAlloc) {
        this.program = program;
        this.regAlloc = regAlloc;
    }

//    @Override
//    public ArrayList<ASMElement> visitStatement(VYPeParserParser.StatementContext ctx) {
//        System.out.print("statement\n");
//        int childCnt = ctx.getChildCount();
//
//        for(int index = 0; index < childCnt; index++) {
//            VYPeStatementLow statLowerer = new VYPeStatementLow();
//            ArrayList<ASMElement> statElements = statLowerer.visit(ctx.getChild(index));
//            elements.addAll(statElements);
//        }
//        return this.elements;
//    }

    @Override
    public Void visitAssignment_statement(VYPeParserParser.Assignment_statementContext ctx) {
        System.out.print("assignment of " + ctx.Identifier().getText() + "\n");
        VYPeExpressionLow exprLow = new VYPeExpressionLow(this.program, this.regAlloc);
        ASMVariable varRes = exprLow.visit(ctx.expression());

        ASMVariable varNew = this.regAlloc.getVariable(ctx.Identifier().getText());
        ASMRegister regRes = this.regAlloc.getRegister(varRes);
        ASMRegister regNew = this.regAlloc.getRegister(varNew);
        ASMRegister regZero = this.regAlloc.getZeroReg();

        String comment = ctx.Identifier().getText() + "(" + regNew.getText() + ") = " + regRes.getText();
        this.program.addInstruction(ISA.ASMOpCode.MOVZ, regNew, regRes, regZero, comment);
        this.regAlloc.killVariable(varRes);
        return null;
    }

    @Override
    public Void visitReturn_statement(VYPeParserParser.Return_statementContext ctx) {
        System.out.print("return\n");
        VYPeExpressionLow exprLow = new VYPeExpressionLow(this.program, this.regAlloc);
        ASMVariable varRes = exprLow.visit(ctx.expression());

        ASMRegister regReturn = this.regAlloc.getReturnValReg();
        ASMRegister regZero = this.regAlloc.getZeroReg();
        ASMRegister regRes = this.regAlloc.getRegister(varRes);

        this.program.addInstruction(ISA.ASMOpCode.MOVZ, regReturn, regRes, regZero);
        this.regAlloc.killVariable(varRes);

        return null;
    }

    @Override
    public Void visitConditional_statement(VYPeParserParser.Conditional_statementContext ctx) {
        VYPeExpressionLow lowCond = new VYPeExpressionLow(this.program, this.regAlloc);
        ASMVariable varCond = lowCond.visit(ctx.condition_expression().expression());

        ASMRegister regCond = this.regAlloc.getRegister(varCond);
        ASMRegister regZero = this.regAlloc.getZeroReg();

        ASMLabel labFalse = this.program.getTempLabel();
        ASMLabel labTrue = this.program.getTempLabel();

        String comIf = "If statement";
        this.program.addInstruction(ISA.ASMOpCode.BEQ, regCond, regZero, labFalse, comIf);
        this.regAlloc.killVariable(varCond);
        VYPeFunctionLow lowTrue = new VYPeFunctionLow(this.program, this.regAlloc);
        lowTrue.visit(ctx.block_statements(0));
        this.program.addInstruction(ISA.ASMOpCode.J, labTrue);
        String comFalse = "If false";
        this.program.addLabel(labFalse, comFalse);
        VYPeFunctionLow lowFalse = new VYPeFunctionLow(this.program, this.regAlloc);
        lowFalse.visit(ctx.block_statements(1));
        String comTrue = "If true";
        this.program.addLabel(labTrue, comTrue);

        return null;
    }

    @Override
    public Void visitWhile_statement(VYPeParserParser.While_statementContext ctx) {
        VYPeExpressionLow lowCond = new VYPeExpressionLow(this.program, this.regAlloc);

        ASMRegister regZero = this.regAlloc.getZeroReg();

        String comBegin = "While loop";
        String comEnd = "Loop end";
        ASMLabel labBegin = this.program.getTempLabel(comBegin);
        ASMLabel labEnd = this.program.getTempLabel(comEnd);

        this.program.addLabel(labBegin);
        // compute the condition in each loop
        ASMVariable varCond = lowCond.visit(ctx.condition_expression().expression());
        ASMRegister regCond = this.regAlloc.getRegister(varCond);
        // test the condition
        this.program.addInstruction(ISA.ASMOpCode.BEQ, regCond, regZero, labEnd);
        this.regAlloc.killVariable(varCond);
        //compute the body of the loop
        VYPeFunctionLow lowBody = new VYPeFunctionLow(this.program, this.regAlloc);
        lowBody.visit(ctx.block_statements());
        // jump back to the beginning of the loop
        this.program.addInstruction(ISA.ASMOpCode.J, labBegin);
        this.program.addLabel(labEnd);

        return null;
    }
}
