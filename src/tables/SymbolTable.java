package tables;
import exceptions.SemanticException;
import values.Value;
import util.Constant.Type;

import java.util.HashMap;
import java.util.List;

/*************************************************************
 * Filename: SymbolTable.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 29/9/2016
 *************************************************************/
public class SymbolTable {
    private SymbolTable parent;
    private HashMap<String,Value> variableList = new HashMap<>();

    public SymbolTable(){

    }

    public SymbolTable(List<Value> list) {
        for(Value value : list) {
            variableList.put(value.getName(), value);
        }
    }

    public SymbolTable(SymbolTable parent){
        this.parent = parent;
    }

    public void add(Value value){
        String name = value.getName();
        if(this.getValueByName(name) != null) {
            throw new SemanticException("Variable " + name + " already defined!");
        }
        this.variableList.put(name, value);
    }

    public Value getValueByName(String name){
        if(variableList.containsKey(name)) {
            return variableList.get(name);
        }

        return (parent != null) ? parent.getValueByName(name) : null;
    }

    public Type getVariableType(String name) {
        Value value = this.getValueByName(name);
        if(value == null) {
            throw new SemanticException("Variable " + name + " not defined!");
        }
        return value.getType();
    }
}
