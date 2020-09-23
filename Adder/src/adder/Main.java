//package adder;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide valid integers to be added");
        }
    }

    private static int addArguments(String[] args) {
        int var = args.length;
        int total = 0; 
        for(int i = 0; i < var; i++){
            total += Integer.valueOf(args[i]);
        }
        return total; 
    }
}
