/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution38 {
    public static void main(String[] args) throws IOException
    {
        //Function filters out Even Numbers from a String.
        processEvenNumbers();
    }

    static void processEvenNumbers() throws IOException
    {
        //initialization
        String inputstring = "";

        String allevennumbers = "";
        String[] evennumbers = new String[10];

        //Define the standard library for inputs
        BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));

        //Read Users Inputs
        System.out.print("Enter a list of numbers, separated by spaces: ");
        inputstring = readInput.readLine();
        //String[] allnumbers = inputstring.split("\\s");
        String[] allnumbers = inputstring.split(" ");

        int[] outputevennumbers = new int[10];
        outputevennumbers = filterEvenNumbers(allnumbers);

        //loop finds value of inputs
        for (int i = 0; i < outputevennumbers.length; i++)
        {
            evennumbers[i] = String.valueOf(outputevennumbers[i]);
            if (!evennumbers[i].equals("0"))
            {
                allevennumbers += evennumbers[i]+ " ";
            }
        }

        System.out.print("The even numbers are "+ allevennumbers);
    }

    //FilterEvenNumbers Method to process the Even Numbers.
    static int[] filterEvenNumbers(	String[] allnumbers) throws IOException
    {
        int[] evennumbers = new int[10];
        int i = 0;
        int storednumber = 0;

        for (int x=0; x<allnumbers.length; x++)
        {
            storednumber = Integer.parseInt(allnumbers[x]);

            //if divisible by 2 then EVEN
            if (storednumber % 2 == 0 )
            {
                //Add only the values with even numbers. do not add 0 or blanks hence "i" needs to be different value then x
                evennumbers[i] = storednumber;
                i++;
            }
        }

        return evennumbers;
    }
}
