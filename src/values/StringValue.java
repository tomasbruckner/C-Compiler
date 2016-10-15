package values;

import util.Constant.Type;

/*************************************************************
 * Filename: StringValue.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 1/10/2016
 *************************************************************/
public class StringValue extends Value {
    private String value;

    public StringValue(){}

    public StringValue(String name, String value){
        this.name = name;
        this.value = value;
    }

    public StringValue(String name, String value, boolean compilationTime){
        this(name, value);
        this.compilationTime = compilationTime;
    }

    @Override
    public Type getType(){
        return Type.STRING;
    }

    public String getValue() {
        return this.value;
    }

    public String setValue(String value){
        this.value = value;
        return this.value;
    }
}
