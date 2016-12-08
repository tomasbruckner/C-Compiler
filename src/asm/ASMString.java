package asm;

/**
 * Created by Filip on 08-Dec-16.
 */
public class ASMString extends ASMData {
    private String value;

    public ASMString(ASMLabel name, String value) {
        super(name, "asciiz");
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
