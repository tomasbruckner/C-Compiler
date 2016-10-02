package value;

/*************************************************************
 * Filename: StringValue.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 1/10/2016
 *************************************************************/
public class StringValue implements Value {
    private String value;

    public StringValue(String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public String setValue(String value){
        this.value = value;
        return this.value;
    }
}
