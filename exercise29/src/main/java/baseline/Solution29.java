/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution29 {

    //inputhandler is defined for ensuring legitimate input
    public static void inputHandler() throws IOException {
        String inputstring = "";
        int years = 0;

        //Define the standard library for inputs
        BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));

        //While loop forces the user to input valid inputs
        while (true) {
            //prompts and stores inputted value if done correctly
            System.out.print("What is the rate of return? ");
            inputstring = readInput.readLine();
            try {
                int rateofreturn = Integer.parseInt(inputstring);
                if (rateofreturn == 0) {
                    System.out.print("Sorry. That's not a valid input.\n");
                } else {
                    //calls and sets a value from the calculation function
                    years = calc(rateofreturn);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Sorry. That's not a valid input.\n");
            }
        }
        //prints out the final value for the user
        System.out.printf("It will take %d years to double your initial investment.", years);

    }
    //function in charge of calculation
    public static int calc(int rateofreturn) {
        //does and returns calculation
        return 72 / rateofreturn;
    }
    //main just calls the input handling function to do all the work
    public static void main(String[] args) throws IOException {
        inputHandler();
    }
}

