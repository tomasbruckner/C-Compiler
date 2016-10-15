package values;
import util.Constant.Type;
/*************************************************************
 * Filename: CharValue.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 1/10/2016
 *************************************************************/
public class CharValue extends Value {
    private char value;

    public CharValue() {}

    public CharValue(String name, char value){
        this.name = name;
        this.value = value;
    }

    public CharValue(String name, char value, boolean compilationTime){
        this(name, value);
        this.compilationTime = compilationTime;
    }

    @Override
    public Type getType(){
        return Type.CHAR;
    }

    public char getValue() {
        return this.value;
    }

    public char setValue(char value){
        this.value = value;
        return this.value;
    }
}
