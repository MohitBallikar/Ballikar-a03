/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution37 {
    public static void main(String[] args) throws IOException
    {
        //function called to generate Password
        generatepassword();
    }

    static void generatepassword() throws IOException
    {
        //strings are intialized
        String inputstring = "";
        String charstring = "";
        String specialstring = "";
        String numberstring = "";
        String passwordstring = "";
        int passwordlength = 0;
        int specialcharslength = 0;
        int numberslength = 0;

        // Declaring the ArrayList for the Numbers
        ArrayList<String> numberlist  = new ArrayList<String>(10);
        numberlist.add("1");
        numberlist.add("2");
        numberlist.add("3");
        numberlist.add("4");
        numberlist.add("5");
        numberlist.add("6");
        numberlist.add("7");
        numberlist.add("8");
        numberlist.add("9");

        // Declaring the ArrayList for the special chars
        ArrayList<String> specialcharslist  = new ArrayList<String>(5);
        specialcharslist.add("!");
        specialcharslist.add("#");
        specialcharslist.add("^");
        specialcharslist.add("~");
        specialcharslist.add("%");

        // Declaring the ArrayList for the uppercase letters
        ArrayList<String> charslist  = new ArrayList<String>(10);
        charslist.add("W");
        charslist.add("B");
        charslist.add("a");
        charslist.add("b");
        charslist.add("d");
        charslist.add("Z");
        charslist.add("X");
        charslist.add("T");
        charslist.add("U");

        // Read the  user inputs.
        BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What's the minimum length?: ");
        inputstring = readInput.readLine();
        passwordlength = Integer.parseInt(inputstring);

        System.out.print("How many special characters?: ");
        inputstring = readInput.readLine();
        specialcharslength = Integer.parseInt(inputstring);

        System.out.print("How many numbers?: ");
        inputstring = readInput.readLine();
        numberslength = Integer.parseInt(inputstring);


        //Requirement of characters
        for (int i = 1; i <= passwordlength; i++)
        {
            int index = (int)(Math.random() * passwordlength);
            //Only 4 Chars (from 8 chars)
            charstring += charslist.get(index).charAt(0);
        }

        //Section off first four characters.
        charstring = charstring.substring(0,4);

        //Generate 2 Special chars from the list to be used for the password
        for (int i = 1; i <= 2; i++)
        {
            int index = (int)(Math.random() * 2);
            //Only 2 Chars (from 8 chars)
            specialstring += specialcharslist.get(index).charAt(0);
        }

        //Generate 2 Numbers chars from the list to be used for the password
        for (int i = 1; i <= 2; i++)
        {
            int index = (int)(Math.random() * 2);
            //Only 2 Chars (from 8 chars)
            numberstring += numberlist.get(index).charAt(0);
        }

        //Complete Password with a combination of all three
        //print the output finally
        passwordstring = charstring+specialstring+numberstring;
        System.out.println("Your password is "+ passwordstring);

    }
}

