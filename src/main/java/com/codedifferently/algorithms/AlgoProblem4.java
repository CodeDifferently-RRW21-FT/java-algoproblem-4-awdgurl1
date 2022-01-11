package com.codedifferently.algorithms;
import java.util.*;

public class AlgoProblem4 {

    public String encrypt(String message, int shift){


        System.out.println("Please enter your message");
        Scanner sc = new Scanner (System.in);
        String input = sc.next();
        for (int i = 0; i < input.length; i++) {
            int numericValue = Character.getNumericValue(i);
            numericValue = i + 3;
            char  ch = (char)numericValue;
            String output = String.valueOf(ch);
            System.out.println(output);
            return output;
        }
    } 
}

