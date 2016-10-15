package values;


import util.Constant.Type;

/*************************************************************
 * Filename: Value.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 29/9/2016
 *************************************************************/
public abstract class Value {
    protected String name;
    protected boolean compilationTime = false;

    abstract public Type getType();

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getCompilationTime(){
        return this.compilationTime;
    }

    public boolean setCompilationTime(boolean compilationTime){
        this.compilationTime = compilationTime;
        return this.compilationTime;
    }
}
