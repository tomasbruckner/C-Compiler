package values;


import constants.Constant.Type;

/*************************************************************
 * Filename: IntValue.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 1/10/2016
 *************************************************************/
public class IntValue extends Value {
    private int value;

    public Type getType(){
        return Type.STRING;
    }

    public IntValue(int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public int setValue(int value){
        this.value = value;
        return this.value;
    }
}
