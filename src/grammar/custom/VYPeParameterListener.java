package grammar.custom;

import grammar.gen.VYPeParserBaseListener;
import grammar.gen.VYPeParserParser;
import org.antlr.v4.runtime.ParserRuleContext;
import values.CharValue;
import values.IntValue;
import values.StringValue;
import values.Value;

import java.util.ArrayList;

/*************************************************************
 * Filename: grammar.custom.VYPeParameterListener.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 15/10/2016
 *************************************************************/
public class VYPeParameterListener extends VYPeParserBaseListener {
    private ArrayList<Value> parameterList;

    public VYPeParameterListener() {
        this.parameterList = new ArrayList<>();
    }

    public ArrayList<Value> getParameterList(){
        return this.parameterList;
    }

    public void enterIntLabel(VYPeParserParser.IntLabelContext ctx){
        String name = this.getParameterName(ctx);
        this.parameterList.add(new IntValue(name, 0));
    }

    public void enterCharLabel(VYPeParserParser.CharLabelContext ctx) {
        String name = this.getParameterName(ctx);
        this.parameterList.add(new CharValue(name, '\0'));
    }

    public void enterStringLabel(VYPeParserParser.StringLabelContext ctx) {
        String name = this.getParameterName(ctx);
        this.parameterList.add(new StringValue(name, ""));
    }

    private String getParameterName(ParserRuleContext ctx) {
        int index = parameterList.size() * 3 + 1;
        return ctx.getParent().getChild(index).getText();
    }
}
