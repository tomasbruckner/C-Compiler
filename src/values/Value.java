package values;


import constants.Constant.Type;

/*************************************************************
 * Filename: Value.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 29/9/2016
 *************************************************************/
public abstract class Value {
    private boolean compilationTime;

    abstract Type getType();
}
