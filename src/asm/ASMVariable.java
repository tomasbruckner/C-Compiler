package asm;

/**
 * Created by Filip on 09-Nov-16.
 */
public class ASMVariable {
    boolean empty;
    boolean temporary;
    Integer index;
    String name;

    // default initialization of the register field
    public ASMVariable() {
        this.empty = true;
    }

    // constructs temporary variable
    public ASMVariable(int index) {
        this.empty = false;
        this.temporary = true;
        this.index = index;
        this.name = ""; // TODO delete
    }

    // constructs program local variable
    public ASMVariable(String name) {
        this.empty = false;
        this.temporary = false;
        this.index = -1;
        this.name = name;
    }

    public boolean isTemporary() { return this.temporary; }
    public int getIndex() { return  this.index; }
    public String getName() { return  this.name; }
    public boolean isEmpty() { return  this.empty; }

    public boolean equals(ASMVariable var) {
        if(this.empty || var.isEmpty()) {
            return false;
        }

        boolean equal = false;

        if(this.temporary) {
            if(var.isTemporary()) {
                if(this.index == var.getIndex()) {
                    equal = true;
                }
            }
        }
        else {
            if(!var.isTemporary()) {
                if(this.name.equals(var.getName())) {
                    equal = true;
                }
            }
        }

        return equal;
    }

    public String getText() {
        if(this.temporary) {
            return(new String("$t" + this.index));
        }
        else {
            return this.name;
        }
    }
}
