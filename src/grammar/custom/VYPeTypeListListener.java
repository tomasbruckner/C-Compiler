package grammar.custom;

import grammar.gen.VYPeParserBaseListener;
import grammar.gen.VYPeParserParser;
import values.CharValue;
import values.IntValue;
import values.StringValue;
import values.Value;

import java.util.ArrayList;

/*************************************************************
 * Filename: grammar.custom.VYPeTypeListListener.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 15/10/2016
 *************************************************************/

public class VYPeTypeListListener extends VYPeParserBaseListener {
    private ArrayList<Value> parameterList;

    public VYPeTypeListListener() {
        this.parameterList = new ArrayList<>();
    }

    public ArrayList<Value> getParameterList(){
        return this.parameterList;
    }

    public void enterIntLabel(VYPeParserParser.IntLabelContext ctx){
        this.parameterList.add(new IntValue());
    }

    public void enterCharLabel(VYPeParserParser.CharLabelContext ctx) {
        this.parameterList.add(new CharValue());
    }

    public void enterStringLabel(VYPeParserParser.StringLabelContext ctx) {
        this.parameterList.add(new StringValue());
    }
}
