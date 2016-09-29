package tables;

/*************************************************************
 * Filename: FunctionTable.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 29/9/2016
 *************************************************************/
public class FunctionTable {
    private Function[] functionDefinitionList;
    private Function[] functionDeclarationList;

    public FunctionTable(){
        this.loadEmbeddedFunctions();
    }

    private void loadEmbeddedFunctions(){

    }

    public boolean isDefined(String id){
        for(Function item : functionDefinitionList) {
            if(item.Identifier.equals(id)){
                return true;
            }
        }
        return false;
    }

    public boolean isDeclared(String id){
        for(Function item : functionDeclarationList) {
            if(item.Identifier.equals(id)){
                return true;
            }
        }
        return false;
    }
}
