/*************************************************************
 * Filename: Main.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 28/9/2016
 *************************************************************/

package util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Constant {

    public static final int NO_ERROR = 0;

    public static final int LEXICAL_ERROR = 1;

    public static final int SYNTAX_ERROR = 2;

    public static final int SEMANTIC_ERROR = 3;

    public static final int MEMORY_ERROR = 4;

    public static final int INTERNAL_ERROR = 5;

    public static final int ERROR_TYPE = 42;

    public enum Type {
        CHAR, INT, STRING, VOID, VARIABLE, UNKNOWN
    }

    public static final List<String> EMBEDDED = Arrays.asList("print", "read_char", "read_int", "read_string", "get_at", "set_at", "strcat", "print_int", "print_char", "print_string");

    private Constant(){
        throw new AssertionError();
    }
}
