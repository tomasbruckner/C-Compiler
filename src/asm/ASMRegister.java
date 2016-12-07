package asm;

import util.Constant;
import util.ISA;

/*************************************************************
 * Filename: ASMElement.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 15/10/2016
 *************************************************************/
public class ASMRegister extends ASMOperand {
    private Integer index;

    public ASMRegister(Integer index) {
        this.index = index;
    }

    public String getText() {
        String name = "$";

        if (this.index == ISA.Register.PROGRAM_COUNTER) {
            name += "PC";
        }
        else if (this.index == ISA.Register.ASM_TEMPORARY) {
            name += "AT";
        }
        else if (this.index == ISA.Register.GLOBAL_PTR) {
            name += "GP";
        }
        else if (this.index == ISA.Register.STACK_PTR) {
            name += "SP";
        }
        else if (this.index == ISA.Register.FRAME_PTR) {
            name += "FP";
        }
        else if (this.index == ISA.Register.RETURN_ADDR) {
            name += "RA";
        }
        else {
            name += this.index;
        }

        return name;
    }

    @Override
    public String getTextOperand() {
        return this.getText();
    }
}
