package asm;

/*************************************************************
 * Filename: ASMData.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 8/12/2016
 *************************************************************/

public abstract class ASMData extends ASMElement {
    private ASMLabel name;
    private String directive;

    public ASMData(ASMLabel name, String directive) {
        this.name = name;
        this.directive = directive;
    }

    protected ASMLabel getName() { return this.name; }
    protected String getDirective() { return this.directive; }
}
