package com.codedifferently.algorithms;

public class AlgoProblem4 {

    public String encrypt(String message, int shift) {

        String output = "";
        char backToChar;
        char characterReceived;
        for (int i = 0; i < message.length(); i++) {
             characterReceived = message.charAt(i);
            if (Character.isLetter(characterReceived)) {
                int ascii = characterReceived + shift;
                backToChar = (char) ascii;
                output += String.valueOf(backToChar);
            }
        }return output;
    }
}

