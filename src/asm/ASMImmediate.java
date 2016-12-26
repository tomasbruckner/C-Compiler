package asm;

/*************************************************************
 * Filename: ASMImmediate.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 15/10/2016
 *************************************************************/

public class ASMImmediate extends ASMOperand {
    private long value;

    public ASMImmediate(long value) {
        this.value = value;
    }

    @Override
    public String getText() {
        String string = "0x" + Long.toString(this.value, 16);

        return string;
    }

    @Override
    public String getTextOperand() {
        return this.getText();
    }
}
