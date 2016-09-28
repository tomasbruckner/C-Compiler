import Constants.Constant;

/*************************************************************
 * Filename: Main.java
 * Project: Compiler Implementation for VYPe16 Programming Language
 * Compiler Team: 04
 * Authors: Filip Benna, xbenna01
 *          Tomas Bruckner, xbruck02
 * Date: 28/9/2016
 *************************************************************/

public class Main {

    public static int main(String[] args) {
        if(args.length < 2 || args.length > 3){
            return Constant.INTERNAL_ERROR;
        }

        String inputFilename = args[1];
        String outputFilename = (args.length == 3) ? args[2] : "out.asm";

        return Constant.NO_ERROR;
    }
}
