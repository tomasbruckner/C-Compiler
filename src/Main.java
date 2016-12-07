import asm.ASMProgram;
import asm.ASMRegister;
import asm.ASMRegisterAllocator;
import exceptions.SemanticException;
import grammar.custom.VYPeExpressionVisitor;
import tables.FunctionTable;
import tables.SymbolTable;
import asm.ASMElement;
import grammar.custom.VYPeStartLow;
import util.Constant;
import grammar.gen.*;
import org.antlr.v4.runtime.*;

import java.util.ArrayList;

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
        args = new String[] {"", "tests/asmtests/simple_while.c"};
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

        CommonTokenStream tokenStream = new CommonTokenStream (lexer);

        tokenStream.fill();

        // must be final in lambda
        final int errorTokenType = lexer.getTokenType("Error");
        tokenStream.getTokens().forEach(token -> {
            if(token.getType() == errorTokenType){
                System.exit(Constant.LEXICAL_ERROR);
            }
        });

        VYPeParserParser parser = new VYPeParserParser(tokenStream);
        VYPeParserParser.StartContext parseTree = parser.start();

        if(parser.getNumberOfSyntaxErrors() > 0) {
            System.exit(Constant.SYNTAX_ERROR);
        }

        VYPeExpressionVisitor visitor = new VYPeExpressionVisitor("", new FunctionTable(), new SymbolTable());

        try {
            visitor.doSemanticCheck(parseTree);
        }
        catch(SemanticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(Constant.SEMANTIC_ERROR);
        }

        // ASM generation
        System.out.print("***ASMgen started***\n");
        ASMRegisterAllocator registerAllocator = new ASMRegisterAllocator();
        ASMProgram program = new ASMProgram(outputFilename, registerAllocator);
        registerAllocator.setProgram(program);

        VYPeStartLow lowerer = new VYPeStartLow(program, registerAllocator);
        lowerer.visit(parseTree);

        program.debugPrint();
        program.printToFile();

        //System.out.println(parseTree.toStringTree());
        System.exit(Constant.NO_ERROR);
    }
}
