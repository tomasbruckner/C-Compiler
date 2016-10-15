package values;


import util.Constant.Type;

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

    public IntValue() {}

    public IntValue(String name, int value){
        this.name = name;
        this.value = value;
    }

    public IntValue(String name, int value, boolean compilationTime){
        this(name, value);
        this.compilationTime = compilationTime;
    }

    @Override
    public Type getType(){
        return Type.INT;
    }

    public int getValue() {
        return this.value;
    }

    public int setValue(int value){
        this.value = value;
        return this.value;
    }
}
