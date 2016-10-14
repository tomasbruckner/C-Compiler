package tables;

import constants.Constant.Type;
import grammar.gen.VYPeParserParser;

import java.util.ArrayList;

/*************************************************************
 * Filename: Function.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 29/9/2016
 *************************************************************/
public class Function {
    private String name;
    private ArrayList<Type> parameters;
    private VYPeParserParser.Block_statementsContext block;
    private boolean defined;

    public Function(String name, ArrayList<Type> parameters, boolean defined){
        this.name = name;
        this.parameters = parameters;
        this.defined = defined;
    }

    public Function(String name, ArrayList<Type> parameters, VYPeParserParser.Block_statementsContext block, boolean defined){
        this(name, parameters, defined);
        this.block = block;
    }


    public boolean isDeclaration(){
        return !this.defined;
    }

    public boolean isDefinition(){
        return this.defined;
    }
}
