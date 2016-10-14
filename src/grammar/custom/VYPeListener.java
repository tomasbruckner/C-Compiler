package grammar.custom;

import constants.Constant.Type;
import exceptions.SemanticException;
import grammar.gen.VYPeParserBaseListener;
import grammar.gen.VYPeParserParser;
import tables.Function;
import tables.FunctionTable;

import java.util.ArrayList;

/*************************************************************
 * Filename: grammar.custom.VYPeListener.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 1/10/2016
 *************************************************************/
public class VYPeListener extends VYPeParserBaseListener {

    private FunctionTable functionTable;

    public VYPeListener() {
        this.functionTable = new FunctionTable();
    }

    @Override
    public void enterFunction_declaration(VYPeParserParser.Function_declarationContext ctx) {
        String functionName = ctx.Identifier().getText();
        this.functionTable.add(functionName, new Function(functionName, this.getParameters(ctx.param_type_list()), false));
    }

    @Override
    public void enterFunction_definition(VYPeParserParser.Function_definitionContext ctx) {
        String functionName = ctx.Identifier().getText();
        this.functionTable.add(functionName, new Function(functionName, this.getParameters(ctx.param_list()), ctx.block_statements(), true));
    }

    public ArrayList<Type> getParameters(VYPeParserParser.Param_type_listContext ctx) {
        if(ctx.getChildCount() == 0){
            throw new SemanticException("No parameters in function definition!");
        }
        else if(ctx.getChildCount() > 1 && ctx.Void() != null){
            throw new SemanticException("Void can only be sole parameter in function definition");
        }

        ArrayList<Type> parametersList = new ArrayList<Type>();

        for(int i = 0, len = ctx.getChildCount(); i < len; i++){
//            switch(ctx.getChild(i)){
//
//            }
        }
        return parametersList;
    }

    public ArrayList<Type> getParameters(VYPeParserParser.Param_listContext ctx) {
        ArrayList<Type> parametersList = new ArrayList<Type>();

        return parametersList;
    }
}
