package tables;

import exceptions.SemanticException;

import java.util.HashMap;

/*************************************************************
 * Filename: FunctionTable.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 29/9/2016
 *************************************************************/
public class FunctionTable {
    private HashMap<String, Function> functionList;

    public FunctionTable(){
        this.functionList = new HashMap<String, Function>();
        this.loadEmbeddedFunctions();
    }

    private void loadEmbeddedFunctions(){

    }

    public void add(String functionName, Function function){
        Function f = this.functionList.get(functionName);

        if(f != null && function.isDeclaration()){
            throw new SemanticException("Function " + functionName + " already declared!");
        }
        else if(f != null && f.isDefinition()){
            throw new SemanticException("Function " + functionName + " already defined!");
        }
        else{
            this.functionList.put(functionName, function);
        }
    }

    public Function getFunctionByName(String name){
        Function f = this.functionList.get(name);
        if(f == null || f.isDeclaration()){
            throw new SemanticException("Function " + name + " is not defined!");
        }
        return f;
    }
}
