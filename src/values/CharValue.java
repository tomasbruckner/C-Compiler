package values;
import constants.Constant.Type;
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

    public Type getType(){
        return Type.CHAR;
    }

    public CharValue(char value){
        this.value = value;
    }

    public char getValue() {
        return this.value;
    }

    public char setValue(char value){
        this.value = value;
        return this.value;
    }
}
