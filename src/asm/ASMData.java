package asm;

/**
 * Created by Filip on 08-Dec-16.
 */
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
