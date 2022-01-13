//Location of file
package com.codedifferently.algorithms;
//Import all files in java.util
import java.util.*;
//Publicly accessible instructions to create objects of 'AlgoProblem4'
public class AlgoProblem4 {

    //public String encrypt(String message, int shift) {
    public static void main(String[] args) {


        //pseudocode
        //Prompting the user for input using Scanner
        //Store input as a string variable
        //Iterate through each character in the string variable using charAt
        //Get the ascii of each character in the string variable
        //Add 3 to the value of the ascii (*x-z)
        //Convert the new ascii back to a character
        //Create a string variable that will hold the new characters
        //Print the string variable

        System.out.println("Please enter your message");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output = null;
        for (int i = 0; i < input.length(); i++) {
            char characterReceived = input.charAt(i);
            if(characterReceived >= 'a' && characterReceived <= 'z'){
             int ascii = (int) characterReceived;
             ascii = ascii + 3;
             char conversion = (char)ascii;
             conversion++;
                System.out.print(conversion);
            }
        }// return output;
    }
}

