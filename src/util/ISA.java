package util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Filip on 09-Nov-16.
 */
public class ISA {
    public static final int REGCNT = 32;
    public static final int GPRCNT = 25;
    public static final int GPRFIRST = 3;
    public static final int GPRLAST = GPRFIRST + GPRCNT - 1;

    public final class Register {
        public static final int PROGRAM_COUNTER = -1;
        public static final int ZERO = 0;
        public static final int ASM_TEMPORARY = 1;
        // TODO try to use this register as gpr as well
        public static final int RETURN_VALUE = 2;
        public static final int GLOBAL_PTR = GPRLAST + 1;   // 28
        public static final int STACK_PTR = GPRLAST + 2;    // 29
        public static final int FRAME_PTR = GPRLAST + 3;    // 30
        public static final int RETURN_ADDR = GPRLAST + 4;  // 31
    }

    public enum ASMOpCode {
        MOV, MOVSI, MOVZ, LI, MFHI, MFLO,
        ADD, SUB, SUBU, MUL, DIV,
        ADDI,
//        AND, OR,
        SLT,
        BEQ, BNE, J, JR, JAL,
        BREAK,
        SW, LW,

        // special
        PRINT_CHAR, PRINT_INT, PRINT_STRING,
        READ_CHAR, READ_INT, READ_STRING
    }

    public static class ASMOpDetail {
        String text;
        int opCnt;

        public ASMOpDetail(String text, int opCnt) {
            this.text = text;
            this.opCnt = opCnt;
        }

        public String getText() { return this.text; }
        public int getOpCnt() { return this.opCnt; }
    }

    public static final Map<ASMOpCode, ASMOpDetail> ASMOpDetailMap;
    static
    {
        ASMOpDetailMap = new HashMap<>();
        ASMOpDetailMap.put(ASMOpCode.MOV, new ASMOpDetail("move", 2));
        ASMOpDetailMap.put(ASMOpCode.MOVSI, new ASMOpDetail("LI", 2));
        ASMOpDetailMap.put(ASMOpCode.MOVZ, new ASMOpDetail("MOVZ", 3));
        ASMOpDetailMap.put(ASMOpCode.MFHI, new ASMOpDetail("MFHI", 1));
        ASMOpDetailMap.put(ASMOpCode.MFLO, new ASMOpDetail("MFLO", 1));

        ASMOpDetailMap.put(ASMOpCode.ADD, new ASMOpDetail("ADD", 3));
        ASMOpDetailMap.put(ASMOpCode.SUB, new ASMOpDetail("SUB", 3));
        ASMOpDetailMap.put(ASMOpCode.SUBU, new ASMOpDetail("SUBU", 2));
        // TODO maybe replace for MULT
        ASMOpDetailMap.put(ASMOpCode.MUL, new ASMOpDetail("MUL", 3));
        ASMOpDetailMap.put(ASMOpCode.DIV, new ASMOpDetail("DIV", 2));

        ASMOpDetailMap.put(ASMOpCode.ADDI, new ASMOpDetail("ADDI", 3));

//        ASMOpDetailMap.put(ASMOpCode.AND, new ASMOpDetail("AND", 3));
//        ASMOpDetailMap.put(ASMOpCode.OR, new ASMOpDetail("OR", 3));

        ASMOpDetailMap.put(ASMOpCode.SLT, new ASMOpDetail("SLT", 3));

        ASMOpDetailMap.put(ASMOpCode.BEQ, new ASMOpDetail("BEQ", 3));
        ASMOpDetailMap.put(ASMOpCode.BNE, new ASMOpDetail("BNE", 3));
        ASMOpDetailMap.put(ASMOpCode.J, new ASMOpDetail("J", 1));
        ASMOpDetailMap.put(ASMOpCode.JR, new ASMOpDetail("JR", 1));
        ASMOpDetailMap.put(ASMOpCode.JAL, new ASMOpDetail("JAL", 1));

        ASMOpDetailMap.put(ASMOpCode.BREAK, new ASMOpDetail("BREAK", 0));

        ASMOpDetailMap.put(ASMOpCode.SW, new ASMOpDetail("SW", 3));
        ASMOpDetailMap.put(ASMOpCode.LW, new ASMOpDetail("LW", 3));

        ASMOpDetailMap.put(ASMOpCode.PRINT_CHAR, new ASMOpDetail("PRINT_CHAR", 1));
        ASMOpDetailMap.put(ASMOpCode.PRINT_INT, new ASMOpDetail("PRINT_INT", 1));
        ASMOpDetailMap.put(ASMOpCode.PRINT_STRING, new ASMOpDetail("PRINT_STRING", 1));
        ASMOpDetailMap.put(ASMOpCode.READ_CHAR, new ASMOpDetail("READ_CHAR", 1));
        ASMOpDetailMap.put(ASMOpCode.READ_INT, new ASMOpDetail("READ_INT", 1));
        ASMOpDetailMap.put(ASMOpCode.READ_STRING, new ASMOpDetail("READ_STRING", 2));
    }

    public final class Function {
        public static final String READ_CHAR = "read_char";
        public static final String READ_INT = "read_int";
        public static final String READ_STRING = "read_string";

        public static final String GET_AT = "get_at";
        public static final String SET_AT = "set_at";

        public static final String STRCAT = "strcat";

        // custom
        public static final String PRINT_CHAR = "print_char";
        public static final String PRINT_INT = "print_int";
        public static final String PRINT_STRING = "print_string";
    }
}
