package tables;

import constants.Constant.Type;

/*************************************************************
 * Filename: Variable.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 29/9/2016
 *************************************************************/
public class Variable {

    public String name;

    private int intValue;
    private char charValue;
    private String stringValue;

    // flag if value of variable is known in compilation time
    private boolean compilationTime;

    public Type type;

    public Variable(int value, boolean... flag){
        this.type = Type.INT;
        this.intValue = value;
        this.compilationTime = (flag.length > 0) ? flag[0] : false;
    }

    public Variable(char value, boolean... flag){
        this.type = Type.CHAR;
        this.charValue = value;
        this.compilationTime = (flag.length > 0) ? flag[0] : false;
    }


    public Variable(String value, boolean... flag){
        this.type = Type.STRING;
        this.stringValue = value;
        this.compilationTime = (flag.length > 0) ? flag[0] : false;
    }

    public int getIntValue(){
        if(!this.isCorrectType(Type.INT)){
            // throw exception?
        }
        return this.intValue;
    }

    public char getCharValue(){
        if(!this.isCorrectType(Type.CHAR)){
            // throw exception?
        }
        return this.charValue;
    }

    public String getStringValue(){
        if(!this.isCorrectType(Type.STRING)){
            // throw exception?
        }
        return this.stringValue;
    }

    private boolean isCorrectType(Type type){
        return this.type == type;
    }
}
