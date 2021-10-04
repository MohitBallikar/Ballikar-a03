/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution25 {

    public static void main(String[] args) throws IOException
    {
        //initialize variables and strings
        int returnpassword =0;
        String inputpassword;

        //Define the standard library for inputs
        BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));

        //Prompt for user input
        System.out.print("Please enter the password: ");
        inputpassword = readInput.readLine();
        returnpassword = passwordValidator(inputpassword);

        //string builder for the single output statement
        StringBuilder str = new StringBuilder("");

        //unknown strength condition
        if (returnpassword == 1 )
        {
            str.append("Password of unknown Strength");
        }
    }

    //function handling the strength of passwords outside of unkown
    static int passwordValidator(String inputString) throws NumberFormatException
    {
        //same initialization
        int returnvalue = 0;
        int integerValue = 0;
        int j =0;
        StringBuilder str = new StringBuilder("");

        //A very weak password contains only numbers and is fewer than eight characters.

        //exceptions/conditionals used to define each type of password
        try
        {
            integerValue = Integer.parseInt(inputString);
            int integerlength = String.valueOf(integerValue).length();
            if (integerlength < 8 )
            {
                str.append("The password '%s' is a very weak password.");
            }
        }
        catch (NumberFormatException e)
        {
            //regex used to limit the type of input accepted
            //A weak password contains only letters and is fewer than eight characters.
            boolean result = inputString.matches("[a-zA-Z]+");
            if (result)
            {
                if (inputString.length() < 8)
                {
                    str.append("The password '%s' is a weak password.");
                }
            }
            else
            {
                if (inputString.length() < 8)
                {
                    str.append("Password of unknown strength.");
                }
            }
        }

        //A strong password contains letters and at least one number and is at least eight characters.
        //same situation used here
        if (inputString.matches(".*\\d.*")){
            //A very strong password contains letters, numbers, and special characters and is at least eight characters.

            for (int intlength = 0; intlength < inputString.length(); intlength++)
            {
                // Checking the character for not being a letter,digit or space
                if (!Character.isDigit(inputString.charAt(intlength))	&& !Character.isLetter(inputString.charAt(intlength)) && !Character.isWhitespace(inputString.charAt(intlength)))
                {
                    //Add one counter.
                    j++;
                }
            }

            if (j ==0 )
            {
                if (inputString.length() >= 8)
                {
                    str.append("The password '%s' is a strong password.");
                }
            }
            else
            {
                if (inputString.length() >= 8)
                {
                    str.append("The password '%s' is a very strong password.");
                }
            }
        }
        //single output statement as needed
        System.out.printf(String.valueOf(str), inputString);
        return returnvalue;

    }
    }
    
