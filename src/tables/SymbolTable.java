package tables;
import java.util.HashMap;
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
    private HashMap<String,Variable> variableList;

    public SymbolTable(){

    }

    public SymbolTable(SymbolTable parent){
        this.parent = parent;
    }

    public Variable getVariableByName(String name){
        if(variableList.containsKey(name)) {
            return variableList.get(name);
        }

        return (parent != null) ? parent.getVariableByName(name) : null;
    }
}
