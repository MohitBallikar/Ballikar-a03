/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Solution33 {
    //calls the function
    public static void main(String[] args) throws IOException {
        playmagicball();
    }
    //predefine strings
    static void playmagicball() throws IOException {
        String inputstring = "";
        String magicballresponse = "";

        //Store the possible choices in a list and select one at random.
        ArrayList<String> magicball = new ArrayList<String>(4);
        magicball.add("Yes.");
        magicball.add("No.");
        magicball.add("Maybe.");
        magicball.add("Ask again later.");

        //Read the user input.
        BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What's your question? ");
        inputstring = readInput.readLine();

        //Generate Random number which will be used to select an answer
        int index = (int) (Math.random() * magicball.size());
        magicballresponse = magicball.get(index);
        System.out.println(magicballresponse + "\n");

    }
}



/*
Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again later."
The value should be chosen randomly using a pseudo random number generator.
Store the possible choices in a list and select one at random.

Prompt user input for a question to ask the program
Call for a function that randomly pulls a response from an array

 */