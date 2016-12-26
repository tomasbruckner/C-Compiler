package util;

import exceptions.SemanticException;
import util.Constant.Type;

/*************************************************************
 * Filename: Utility.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 15/10/2016
 *************************************************************/

public final class Utility {

    private Utility(){
        throw new AssertionError();
    }

    public final static Type getType(String type) {
        switch(type) {
            case "void":
                return Type.VOID;
            case "int":
                return Type.INT;
            case "char":
                return Type.CHAR;
            case "string":
                return Type.STRING;
            default:
                throw new SemanticException("Unknown return type!");
        }
    }
}
