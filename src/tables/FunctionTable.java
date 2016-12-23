package tables;

import util.Constant;
import util.Constant.Type;
import exceptions.SemanticException;
import values.*;

import java.util.ArrayList;
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
    private HashMap<String, Function> functionList = new HashMap<>();

    public FunctionTable(){
        this.loadEmbeddedFunctions();
    }

    private void loadEmbeddedFunctions(){
        ArrayList<Value> parameterList = new ArrayList<>();
        parameterList.add(new VariableValue());
        this.functionList.put("print", new Function(Type.VOID, "print", parameterList, null, true));
        // --- DEBUG ---
        parameterList = new ArrayList<>();
        parameterList.add(new CharValue());
        this.functionList.put("print_char", new Function(Type.VOID, "print_char", parameterList, null, true));
        parameterList = new ArrayList<>();
        parameterList.add(new IntValue());
        this.functionList.put("print_int", new Function(Type.VOID, "print_int", parameterList, null, true));
        parameterList = new ArrayList<>();
        parameterList.add(new StringValue());
        this.functionList.put("print_string", new Function(Type.VOID, "print_string", parameterList, null, true));
        //--------------

        parameterList = new ArrayList<>();
        this.functionList.put("read_char", new Function(Type.CHAR, "read_char", parameterList, null, true));
        this.functionList.put("read_int", new Function(Type.INT, "read_int", parameterList, null, true));
        this.functionList.put("read_string", new Function(Type.STRING, "read_string", parameterList, null, true));

        parameterList = new ArrayList<>();
        parameterList.add(new StringValue());
        parameterList.add(new IntValue());
        this.functionList.put("get_at", new Function(Type.CHAR, "get_at", parameterList, null, true));

        parameterList = new ArrayList<>();
        parameterList.add(new StringValue());
        parameterList.add(new IntValue());
        parameterList.add(new CharValue());
        this.functionList.put("set_at", new Function(Type.STRING, "set_at", parameterList, null, true));

        parameterList = new ArrayList<>();
        parameterList.add(new StringValue());
        parameterList.add(new StringValue());
        this.functionList.put("strcat", new Function(Type.STRING, "strcat", parameterList, null, true));
    }

    public void add(String functionName, Function function){
        Function f = this.functionList.get(functionName);

        if(f != null && function.isDeclaration()){
            throw new SemanticException("Function " + functionName + " already declared!");
        }
        else if(f != null && f.isDefinition()){
            throw new SemanticException("Function " + functionName + " already defined!");
        }
        else if(f != null && f.isDeclaration()) {
            if(!f.isParameterListValid(function.getParameterList())){
                String errorMessage = "Different types of parameters in function declaration: " + functionName;
                throw new SemanticException(errorMessage);
            }
        }

        this.functionList.put(functionName, function);
    }

    public Function getFunctionByName(String name){
        Function f = this.functionList.get(name);
        if(f == null || f.isDeclaration()){
            throw new SemanticException("Function " + name + " is not defined!");
        }
        return f;
    }

    public void semanticCheck() {
        if(!isMainFunction()) {
            throw new SemanticException("Missing main function!");
        }
        else if(!hasAnyDeclaration()){
            throw new SemanticException("Some function declaration are missing definition!");
        }
        else {
            functionList.forEach((k,v) -> {
                if(!isEmbedded(k)){
                    v.invoke(this);
                }
            });
        }
    }

    private boolean isMainFunction(){
        Function f = this.getFunctionByName("main");
        return f != null && f.getReturnType() == Type.INT && f.getParameterList().size() == 0;
    }

    private boolean hasAnyDeclaration(){
        for(Function function : this.functionList.values()){
            if(function.isDeclaration()){
               return false;
            }
        }

        return true;
    }

    public boolean isEmbedded(String name){
        return Constant.EMBEDDED.contains(name);
    }
}
