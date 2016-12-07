package asm;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import util.Constant;
import util.ISA;

import java.util.ArrayList;

/**
 * Created by Filip on 29-Oct-16.
 */
public class ASMInstruction extends ASMElement  {

    ISA.ASMOpCode opCode;
    ArrayList<ASMOperand> operands = new ArrayList<>();
    String comment = "";

    public ASMInstruction(ISA.ASMOpCode opCode) { this.opCode = opCode; }

    public void addOperand(ASMOperand operand) { this.operands.add(operand); }

    public void addComment(String comment) { this.comment = comment; }

    @Override
    public String getText() {
        ISA.ASMOpDetail detail = ISA.ASMOpDetailMap.get(this.opCode);

        String text = "  " +  detail.getText();

        if (this.opCode == ISA.ASMOpCode.SW || this.opCode == ISA.ASMOpCode.LW) {
            text += " " + this.operands.get(0).getTextOperand() + ",";
            text += " " + this.operands.get(1).getTextOperand();
            text += "(" + this.operands.get(2).getTextOperand() + ")";
        }
        else {
            boolean first = true;
            for (ASMOperand op : this.operands) {
                if (!first) {
                    text += ",";
                }
                text += " " + op.getTextOperand();
                first = false;
            }
        }

        if(!this.comment.equals("")) {
            text += "\t\t//" + this.comment;
        }

        return text;
    }
}
