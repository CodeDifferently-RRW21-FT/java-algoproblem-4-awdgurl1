package com.codedifferently.algorithms;

public class AlgoProblem4 {

    public String encrypt(String message, int shift) {

        String output = "";
        char characterReceived;
        char ascii;
        for (int i = 0; i < message.length(); i++) {
             characterReceived = message.charAt(i);
            if (Character.isLetter(characterReceived)) {
                ascii = (char) (characterReceived + shift);
                output += ascii;

            }
        }return output;
    }
}

