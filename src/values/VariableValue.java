package values;
import util.Constant.Type;
/*************************************************************
 * Filename: VariableValue.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 15/10/2016
 *************************************************************/
public class VariableValue extends Value {

    public VariableValue(){
        this.compilationTime = true;
    }

    public Type getType(){
        return Type.VARIABLE;
    }
}
