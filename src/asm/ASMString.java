package asm;

/*************************************************************
 * Filename: ASMString.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 8/12/2016
 *************************************************************/

public class ASMString extends ASMData {
    private String value;

    public ASMString(ASMLabel name, String value) {
        super(name, "asciz");
        this.value = value;
    }

    @Override
    public String getText() {
        String string = super.getName().getText() + " ";
        string += "." + super.getDirective() + " ";
        string += this.value;

        return string;
    }
}
