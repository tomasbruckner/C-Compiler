package tables;

import constants.Constant.Type;
import grammar.gen.VYPeParserParser;
import values.Value;

import java.util.ArrayList;

/*************************************************************
 * Filename: Function.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 29/9/2016
 *************************************************************/
public class Function {
    private Type returnType;
    private String name;
    private ArrayList<Value> parameterList;
    private VYPeParserParser.Block_statementsContext block;
    private boolean defined;

    public Function(Type returnType, String name, ArrayList<Value> parameterList, boolean defined){
        this.returnType = returnType;
        this.name = name;
        this.parameterList = parameterList;
        this.defined = defined;
    }

    public Function(Type returnType, String name, ArrayList<Value> parameterList, VYPeParserParser.Block_statementsContext block, boolean defined){
        this(returnType, name, parameterList, defined);
        this.block = block;
    }

    public ArrayList<Value> getParameterList(){
        return this.parameterList;
    }

    public boolean isParameterListEqual(ArrayList<Value> parameterList) {
        if(this.parameterList.size() != parameterList.size()){
            return false;
        }

        for(int i = 0, len = parameterList.size(); i < len; i++) {
            if(this.parameterList.get(i).getType() != parameterList.get(i).getType()){
                return false;
            }
        }

        return true;
    }

    public boolean isDeclaration(){
        return !this.defined;
    }

    public boolean isDefinition(){
        return this.defined;
    }
}
