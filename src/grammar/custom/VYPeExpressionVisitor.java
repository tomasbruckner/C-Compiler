package grammar.custom;

import exceptions.SemanticException;
import grammar.gen.VYPeParserBaseVisitor;
import grammar.gen.VYPeParserParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
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
public class VYPeExpressionVisitor extends VYPeParserBaseVisitor {
    private FunctionTable functionTable;
    private SymbolTable symbolTable;
    private String currentFunctionName;

    public VYPeExpressionVisitor(String functionName, FunctionTable functionTable, SymbolTable symbolTable) {
        this.currentFunctionName = functionName;
        this.functionTable = functionTable;
        this.symbolTable = symbolTable;
    }

    public void doSemanticCheck(ParseTree ctx) throws SemanticException {
        this.visit(ctx);
        this.functionTable.semanticCheck();
    }

    /************************************* FUNCTIONS *******************************************************************/
    // TODO REFACTORING FUNCTION

    @Override
    public Type visitFunction_declaration(VYPeParserParser.Function_declarationContext ctx) {
        Type returnType = Utility.getType(ctx.type().getText());
        String functionName = ctx.Identifier().getText();
        Function function = new Function(returnType, functionName, this.getParameters(ctx.param_type_list()), false);
        this.functionTable.add(functionName, function);

        return Type.VOID;
    }

    private List<Value> getParameters(VYPeParserParser.Param_type_listContext ctx) {
        if(ctx.getChildCount() == 0){
            throw new SemanticException("No parameters in function declaration! Line: " + ctx.start.getLine());
        }
        else if(ctx.Void() != null){
            return new ArrayList<>();
        }
        else {
            VYPeTypeListListener walker = new VYPeTypeListListener();
            ParseTreeWalker.DEFAULT.walk(walker, ctx);

            return walker.getParameterList();
        }
    }

    @Override public Type visitFunction_definition(VYPeParserParser.Function_definitionContext ctx) {
        Type returnType = Utility.getType(ctx.type().getText());
        String functionName = ctx.Identifier().getText();
        this.currentFunctionName = functionName;
        Function function = new Function(returnType, functionName, this.getParameters(ctx.param_list()), ctx.block_statements(), true);
        this.functionTable.add(functionName, function);

        this.visit(ctx.block_statements());
        return Type.VOID;
    }

    private List<Value> getParameters(VYPeParserParser.Param_listContext ctx) {
        if(ctx.getChildCount() == 0){
            throw new SemanticException("No parameters in function definition! Line: " + ctx.start.getLine());
        }
        else if(ctx.Void() != null){
            return new ArrayList<>();
        }
        else {
            VYPeParameterListener walker = new VYPeParameterListener();
            ParseTreeWalker.DEFAULT.walk(walker, ctx);

            return walker.getParameterList();
        }
    }

    /************************************ STATEMENTS *******************************************************************/

    @Override
    public Type visitVariable_definition_statement(VYPeParserParser.Variable_definition_statementContext ctx) {
        Type type = Utility.getType(ctx.getChild(0).getText());
        for(int i = 1, len = ctx.getChildCount() - 1; i < len; i += 2){
            Value value = this.toValue(type);
            value.setName(ctx.getChild(i).getText());
            symbolTable.add(value);
        }
        return Type.VOID;
    }

    @Override
    public Type visitAssignment_statement(VYPeParserParser.Assignment_statementContext ctx) {
        String name = ctx.getChild(0).getText();

        Object type = visit(ctx.getChild(2));

        if(!(type instanceof Type)){
            throw new SemanticException("Invalid assignment to variable: " + name + "! Line: " + ctx.start.getLine());
        }
        else if(symbolTable.getVariableType(name) != type) {
            throw new SemanticException("Assigning invalid type to variable " + name + "! Line: " + ctx.start.getLine());
        }

        return Type.VOID;
    }

    @Override
    public Type visitFunction_call_statement(VYPeParserParser.Function_call_statementContext ctx) {
        return this.visitFunction_call(ctx.function_call());
    }

    @Override
    public Type visitFunction_call(VYPeParserParser.Function_callContext ctx) {
        String name = ctx.getChild(0).getText();
        Function function = this.functionTable.getFunctionByName(name);
        List<Value> parameters = this.getFunctionCallParameters(ctx);

        if(!function.isParameterListValid(parameters)){
            throw new SemanticException("Invalid function call parameters for function: " + name + "! Line: " + ctx.start.getLine());
        }

        return function.getReturnType();
    }

    @Override
    public Type visitConditional_statement(VYPeParserParser.Conditional_statementContext ctx) {
        this.checkConditionExpression(ctx.condition_expression());

        // if true branch
        VYPeExpressionVisitor visitor = this.getNewVisitor();
        visitor.visit(ctx.block_statements(0));

        // else branch
        visitor = this.getNewVisitor();
        visitor.visit(ctx.block_statements(1));

        return Type.VOID;
    }

    private VYPeExpressionVisitor getNewVisitor(){
        SymbolTable table = new SymbolTable(this.symbolTable);
        return new VYPeExpressionVisitor(this.currentFunctionName, this.functionTable, table);
    }

    private void checkConditionExpression(VYPeParserParser.Condition_expressionContext ctx) {
        Type conditionType = (Type)visit(ctx.expression());

        if(conditionType != Type.INT){
            throw new SemanticException("Condition expression is not integer! Line: " + ctx.start.getLine());
        }
    }

    @Override
    public Type visitWhile_statement(VYPeParserParser.While_statementContext ctx) {
        this.checkConditionExpression(ctx.condition_expression());

        VYPeExpressionVisitor visitor = this.getNewVisitor();
        visitor.visit(ctx.block_statements());

        return Type.VOID;
    }

    @Override
    public Type visitReturn_statement(VYPeParserParser.Return_statementContext ctx) {
        Type functionReturnType = this.functionTable.getFunctionByName(this.currentFunctionName).getReturnType();
        if(functionReturnType == Type.VOID && ctx.expression() != null) {
            throw new SemanticException("Non-void return type! Line: " + ctx.start.getLine());
        }
        else if(functionReturnType == Type.VOID) {
            return Type.VOID;
        }
        else {
            Object type = this.visit(ctx.expression());
            if (type != functionReturnType) {
                throw new SemanticException("Invalid return type! Line: " + ctx.start.getLine());
            }
        }
        return Type.VOID;
    }

    private List<Value> getFunctionCallParameters(VYPeParserParser.Function_callContext ctx) {
        List<Value> parameterList = new ArrayList<>();

        for(int i = 2, len = ctx.getChildCount() - 1; i < len; i += 2) {
            Object obj = this.visit(ctx.getChild(i));
            if(!(obj instanceof Type)){
                throw new SemanticException("Invalid expression value! Line: " + ctx.start.getLine());
            }

            Value value = this.toValue((Type)obj);
            parameterList.add(value);
        }
        return parameterList;
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
        Type expressionType = (Type) visit(ctx.expression());

        if(!isValidCasting(castType, expressionType)){
            throw new SemanticException("Invalid casting! Line: " + ctx.start.getLine());
        }

        return castType;
    }

    private boolean isValidCasting(Type typeFrom, Type typeTo) {
        // TODO check response https://wis.fit.vutbr.cz/FIT/st/phorum-msg-show.php?id=45216&mode=single
        switch(typeFrom) {
            case CHAR:
                return typeTo == Type.INT || typeTo == Type.STRING || typeTo == Type.CHAR;
            case INT:
                return typeTo == Type.CHAR || typeTo == Type.INT;
            case STRING:
                return typeTo == Type.STRING;
            default:
                return false;
        }
    }

    @Override
    public Type visitFunctionCallLabel(VYPeParserParser.FunctionCallLabelContext ctx) {
        return this.visitFunction_call(ctx.function_call());
    }

    @Override
    public Type visitNegationLabel(VYPeParserParser.NegationLabelContext ctx) {
        Type expressionType = (Type)visit(ctx.expression());

        if(expressionType != Type.INT) {
            throw new SemanticException("Invalid negation type! Line: " + ctx.start.getLine());
        }

        return Type.INT;
    }

    @Override
    public Type visitMulDivModLabel(VYPeParserParser.MulDivModLabelContext ctx) {
        if(!areNumberTypes(ctx.expression(0), ctx.expression(1))){
            throw new SemanticException("Invalid operand types for mul/div/mod! Line: " + ctx.start.getLine());
        }

        return Type.INT;
    }

    @Override
    public Type visitPlusMinusLabel(VYPeParserParser.PlusMinusLabelContext ctx) {
        if(!areNumberTypes(ctx.expression(0), ctx.expression(1))){
            throw new SemanticException("Invalid operand types for plus/minus! Line: " + ctx.start.getLine());
        }

        return Type.INT;
    }

    @Override
    public Type visitGreaterLowerLabel(VYPeParserParser.GreaterLowerLabelContext ctx) {
        if(!areSameTypes(ctx.expression(0), ctx.expression(1))){
            throw new SemanticException("Invalid operand types for greater/lower! Line: " + ctx.start.getLine());
        }

        return Type.INT;
    }

    @Override
    public Type visitEqualLabel(VYPeParserParser.EqualLabelContext ctx) {
        if(!areSameTypes(ctx.expression(0), ctx.expression(1))){
            throw new SemanticException("Invalid operand types for equal/not equal! Line: " + ctx.start.getLine());
        }

        return Type.INT;
    }

    @Override
    public Type visitAndLabel(VYPeParserParser.AndLabelContext ctx) {
        if(!areNumberTypes(ctx.expression(0), ctx.expression(1))){
            throw new SemanticException("Invalid operand types for and! Line: " + ctx.start.getLine());
        }

        return Type.INT;
    }

    @Override
    public Type visitOrLabel(VYPeParserParser.OrLabelContext ctx) {
        if(!areNumberTypes(ctx.expression(0), ctx.expression(1))){
            throw new SemanticException("Invalid operand types for and! Line: " + ctx.start.getLine());
        }

        return Type.INT;
    }

    private boolean areSameTypes(VYPeParserParser.ExpressionContext leftExpression, VYPeParserParser.ExpressionContext rightExpression){
        Type leftOperandType = (Type) visit(leftExpression);
        Type rightOperandType = (Type) visit(rightExpression);

        return leftOperandType == rightOperandType;
    }

    private boolean areNumberTypes(VYPeParserParser.ExpressionContext leftExpression, VYPeParserParser.ExpressionContext rightExpression) {
        Type leftOperandType = (Type) visit(leftExpression);
        Type rightOperandType = (Type) visit(rightExpression);

        return leftOperandType == Type.INT && rightOperandType == Type.INT;
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
        return this.symbolTable.getVariableType(ctx.getText());
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
