package grammar.custom;

import asm.ASMRegisterAllocator;
import exceptions.SemanticException;
import grammar.gen.VYPeParserBaseVisitor;
import grammar.gen.VYPeParserParser;
import util.Constant.Type;
import util.Utility;
import values.CharValue;
import values.IntValue;
import values.StringValue;
import values.Value;
import tables.*;

import java.util.ArrayList;
import java.util.List;

/*************************************************************
 * Filename: grammar.custom.VYPeExpressionVisitor.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 9/10/2016
 *************************************************************/
public class VYPePrintVisitor extends VYPeParserBaseVisitor {
    private FunctionTable functionTable;
    private ASMRegisterAllocator registerAllocator;

    public VYPePrintVisitor(FunctionTable functionTable, ASMRegisterAllocator registerAllocator) {
        this.functionTable = functionTable;
        this.registerAllocator = registerAllocator;
    }

    @Override
    public Type visitFunction_call(VYPeParserParser.Function_callContext ctx) {
        String name = ctx.getChild(0).getText();
        Function function = this.functionTable.getFunctionByName(name);

        return function.getReturnType();
    }

    public List<Value> getFunctionCallParameters(VYPeParserParser.Function_callContext ctx) {
        List<Value> parameterList = new ArrayList<>();

        for(int i = 2, len = ctx.getChildCount() - 1; i < len; i += 2) {
            Object obj = this.visit(ctx.getChild(i));

            Value value = this.toValue((Type)obj);
            parameterList.add(value);
        }
        return parameterList;
    }

    public Type getExpressionType(VYPeParserParser.ExpressionContext ctx) {
        return (Type) this.visit(ctx);
    }

    /****************************************** EXPRESSION *************************************************************/

    @Override
    public Type visitAnyValueLabel(VYPeParserParser.AnyValueLabelContext ctx) {
        return (Type)visit(ctx.any_value());
    }

    @Override
    public Type visitExpressionLabel(VYPeParserParser.ExpressionLabelContext ctx) {
        return (Type)visit(ctx.expression());
    }

    @Override
    public Type visitCastingLabel(VYPeParserParser.CastingLabelContext ctx) {
        Type castType = Utility.getType(ctx.getChild(1).getText());

        return castType;
    }

    @Override
    public Type visitFunctionCallLabel(VYPeParserParser.FunctionCallLabelContext ctx) {
        return this.visitFunction_call(ctx.function_call());
    }

    @Override
    public Type visitNegationLabel(VYPeParserParser.NegationLabelContext ctx) {
        return Type.INT;
    }

    @Override
    public Type visitMulDivModLabel(VYPeParserParser.MulDivModLabelContext ctx) {
        return Type.INT;
    }

    @Override
    public Type visitPlusMinusLabel(VYPeParserParser.PlusMinusLabelContext ctx) {
        return Type.INT;
    }

    @Override
    public Type visitGreaterLowerLabel(VYPeParserParser.GreaterLowerLabelContext ctx) {
        return Type.INT;
    }

    @Override
    public Type visitEqualLabel(VYPeParserParser.EqualLabelContext ctx) {
        return Type.INT;
    }

    @Override
    public Type visitAndLabel(VYPeParserParser.AndLabelContext ctx) {
        return Type.INT;
    }

    @Override
    public Type visitOrLabel(VYPeParserParser.OrLabelContext ctx) {
        return Type.INT;
    }

    /****************************************** VALUES *****************************************************************/

    private Value toValue(Type type){
        switch(type){
            case INT:
                return new IntValue();
            case CHAR:
                return new CharValue();
            case STRING:
                return new StringValue();
            default:
                throw new SemanticException("Invalid function call parameter!");
        }
    }

    @Override
    public Type visitIdentifierLabel(VYPeParserParser.IdentifierLabelContext ctx) {
        return this.registerAllocator.checkVariable(ctx.getText()).getType();
    }

    @Override
    public Type visitIntLiteralLabel(VYPeParserParser.IntLiteralLabelContext ctx) {
        return Type.INT;
    }

    @Override
    public Type visitCharLiteralLabel(VYPeParserParser.CharLiteralLabelContext ctx) {
        return Type.CHAR;
    }

    @Override
    public Type visitStringLiteralLabel(VYPeParserParser.StringLiteralLabelContext ctx) {
        return Type.STRING;
    }
}
