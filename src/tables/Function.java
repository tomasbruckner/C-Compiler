package tables;

/*************************************************************
 * Filename: Function.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 29/9/2016
 *************************************************************/
public class Function {
    public String id;
    private boolean defined;

    public Function(String id, boolean defined){
        this.id = id;
        this.defined = defined;
    }

    public boolean isDeclaration(){
        return !this.defined;
    }

    public boolean isDefinition(){
        return this.defined;
    }
}
