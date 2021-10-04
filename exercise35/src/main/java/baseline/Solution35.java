/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution35 {
    public static void main(String[] args) throws IOException {
        //Pick a winner from a list randomly (calls the function)
        pickawinner();

    }

    static void pickawinner() throws IOException {
        //initializes the strings/variables
        String inputstring = "";
        int noofusers = 10;

        // Declaring the ArrayList for the Employees
        ArrayList<String> userlist = new ArrayList<String>(noofusers);

        //Define the standard library for inputs
        BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));

        //Add Users to the list. Asks for user input as well
        for (int i = 0; i < noofusers; i++) {
            System.out.print("Enter a name: ");
            inputstring = readInput.readLine();
            if (inputstring.equals("")) {
                break;
            } else {
                userlist.add(inputstring);
            }
        }

        //Pick a random person for winner.
        //System.out.println("userlist.size() "+ userlist.size());
        int index = (int) (Math.random() * userlist.size());
        //System.out.println("index = "+ index);

        //Read the Indexed name (again decided by random).
        System.out.println("The winner is ... " + userlist.get(index));
    }
}


