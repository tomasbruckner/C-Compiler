package grammar.custom;

import asm.ASMProgram;
import asm.ASMRegister;
import asm.ASMRegisterAllocator;
import grammar.gen.VYPeParserBaseVisitor;
import grammar.gen.VYPeParserParser;
import util.ISA;

import java.util.List;

/*************************************************************
 * Filename: VYPeBlockLow.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 21/12/2016
 *************************************************************/

public class VYPeBlockLow extends VYPeParserBaseVisitor<Void> {
    ASMProgram program;
    ASMRegisterAllocator regAlloc;
    boolean isFunctionBody;

    public VYPeBlockLow(ASMProgram program, ASMRegisterAllocator regAlloc) {
        this.program = program;
        this.regAlloc = regAlloc;
        this.isFunctionBody = false;
    }

    public VYPeBlockLow(ASMProgram program, ASMRegisterAllocator regAlloc, boolean isBody) {
        this.program = program;
        this.regAlloc = regAlloc;
        this.isFunctionBody = isBody;
    }

    @Override
    public Void visitBlock_statements(VYPeParserParser.Block_statementsContext ctx) {
//        System.out.print("block\n");
        List<VYPeParserParser.StatementContext> statements = ctx.statement();

        // if the block is function body, the scope has already been initialized
        if (!this.isFunctionBody) {
            this.regAlloc.newScope();
        }

        for(VYPeParserParser.StatementContext s : statements) {
            VYPeStatementLow statLowerer = new VYPeStatementLow(this.program, this.regAlloc);
            statLowerer.visit(s.getChild(0));
        }

        if (!this.isFunctionBody) {
            this.regAlloc.killScope();
        }

        return null;
    }
}
