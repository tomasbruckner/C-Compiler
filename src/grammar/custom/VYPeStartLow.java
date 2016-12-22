package grammar.custom;

import asm.ASMElement;
import asm.ASMProgram;
import asm.ASMRegisterAllocator;
import grammar.gen.VYPeParserBaseVisitor;
import grammar.gen.VYPeParserParser;

import java.util.ArrayList;
import java.util.List;

/*************************************************************
 * Filename: Main.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 28/9/2016
 *************************************************************/
public class VYPeStartLow extends VYPeParserBaseVisitor<Void> {

    ASMProgram program;

    public VYPeStartLow(ASMProgram program) {
        this.program = program;
    }

    @Override
    public Void visitStart(VYPeParserParser.StartContext ctx) {
        List<VYPeParserParser.Function_definitionContext> functions = ctx.function_definition();

        for(VYPeParserParser.Function_definitionContext f : functions) {
            VYPeFunctionLow funcLowerer = new VYPeFunctionLow(this.program);
            funcLowerer.visit(f);
        }

        return null;
    }
}
