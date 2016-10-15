package grammar.custom;

import util.Constant.Type;
import exceptions.SemanticException;
import grammar.gen.VYPeParserBaseListener;
import grammar.gen.VYPeParserParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import tables.Function;
import tables.FunctionTable;
import util.Utility;
import values.Value;

import java.util.ArrayList;

/*************************************************************
 * Filename: grammar.custom.VYPeMainListener.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 1/10/2016
 *************************************************************/
public class VYPeMainListener extends VYPeParserBaseListener {

    private FunctionTable functionTable;

    public VYPeMainListener() {
        this.functionTable = new FunctionTable();
    }

    @Override
    public void enterFunction_declaration(VYPeParserParser.Function_declarationContext ctx) {
        Type returnType = Utility.getType(ctx.type().getText());
        String functionName = ctx.Identifier().getText();
        this.functionTable.add(functionName, new Function(returnType, functionName, this.getParameters(ctx.param_type_list()), false));
    }

    @Override
    public void enterFunction_definition(VYPeParserParser.Function_definitionContext ctx) {
        Type returnType = Utility.getType(ctx.type().getText());
        String functionName = ctx.Identifier().getText();
        this.functionTable.add(functionName, new Function(returnType, functionName, this.getParameters(ctx.param_list()), ctx.block_statements(), true));
    }

    public FunctionTable getFunctionTable(){
        return this.functionTable;
    }



    public ArrayList<Value> getParameters(VYPeParserParser.Param_type_listContext ctx) {
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

    public ArrayList<Value> getParameters(VYPeParserParser.Param_listContext ctx) {
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
}
