package asm;

/*************************************************************
 * Filename: ASMLabel.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 15/10/2016
 *************************************************************/

public class ASMLabel extends ASMOperand {
    private String name;
    private String comment;
    private boolean hasColon;

    public ASMLabel(String name) {
        this.name = name;
        this.comment = "";
        this.hasColon = true;
    }

    public ASMLabel(String name, Boolean hasColon) {
        this.name = name;
        this.comment = "";
        this.hasColon = hasColon;
    }

    public ASMLabel(String name, String comment) {
        this.name = name;
        this.comment = comment;
        this.hasColon = true;
    }

    public void addComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String getText() {
        String text = this.name;
        if (this.hasColon) {
            text += ":";
        }

        if(!this.comment.equals("")) {
            text += "\t\t//" + this.comment;
        }

        return text;
    }

    @Override
    public String getTextOperand() {
        return (this.name);
    }
}
