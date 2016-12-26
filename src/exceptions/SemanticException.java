package exceptions;

/*************************************************************
 * Filename: SemanticException.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 28/9/2016
 *************************************************************/

public class SemanticException extends RuntimeException {
    public SemanticException(String msg){
        super(msg);
    }
}
