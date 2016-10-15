import exceptions.SemanticException;
import util.Constant;
import grammar.custom.VYPeMainListener;
import grammar.gen.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/*************************************************************
 * Filename: Main.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 28/9/2016
 *************************************************************/

public class Main {

    public static void main(String[] args) {
        args = new String[] {"", "tests/valid/testcase03.c"};
        if(args.length < 2 || args.length > 3){
            System.exit(Constant.INTERNAL_ERROR);
        }

        String outputFilename = (args.length == 3) ? args[2] : "out.asm";
        VYPeLexer lexer = null;
        try{
            lexer = new VYPeLexer(new ANTLRFileStream(args[1]));
        }catch(java.io.IOException e){
            System.exit(Constant.INTERNAL_ERROR);
        }

        VYPeParserParser parser = new VYPeParserParser(new CommonTokenStream (lexer));
        VYPeParserParser.StartContext parseTree = parser.start();

        // TODO add lexical error detection
        if(parser.getNumberOfSyntaxErrors() > 0) {
            System.exit(Constant.SYNTAX_ERROR);
        }

        VYPeMainListener walker = new VYPeMainListener();

        try {
            ParseTreeWalker.DEFAULT.walk(walker, parseTree);
            walker.getFunctionTable().semanticCheckAll();
        }
        catch(SemanticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(Constant.SEMANTIC_ERROR);
        }

        System.exit(Constant.NO_ERROR);
    }
}
