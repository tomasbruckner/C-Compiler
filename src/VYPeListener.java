import gen.VYPeParserBaseListener;
import gen.VYPeParserParser;
import tables.Function;
import tables.FunctionTable;

/*************************************************************
 * Filename: VYPeListener.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 1/10/2016
 *************************************************************/
public class VYPeListener extends VYPeParserBaseListener {

    private FunctionTable functionTable;

    public VYPeListener(){
        this.functionTable = new FunctionTable();
    }

    @Override
    public void enterFunction_declaration(VYPeParserParser.Function_declarationContext ctx) {
        String functionName = ctx.Identifier().getText();
        this.functionTable.add(functionName, new Function(functionName, false));
    }

    @Override
    public void enterFunction_definition(VYPeParserParser.Function_definitionContext ctx) {
        String functionName = ctx.Identifier().getText();
        this.functionTable.add(functionName, new Function(functionName, true));
    }
}
