import constants.Constant;
import gen.*;
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
        args = new String[] {"", "tests/testcase03/input.c"};
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
        VYPeListener walker = new VYPeListener();

        // needs to catch exceptions
        ParseTreeWalker.DEFAULT.walk(walker, parseTree);

        //System.out.println(parseTree.toStringTree());
        System.exit(Constant.NO_ERROR);
    }
}
