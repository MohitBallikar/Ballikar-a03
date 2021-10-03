/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution28 {

    //calls the loop function which does all the heavy-lifting
    public static void main(String[] args) throws IOException {
        loopfunct();
    }

    public static int loopfunct() throws IOException {
        //initialize the variable values
        int sumofallnumbers = 0;
        String inputstring = "";

        //Define inputs
        BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));
        //ensure that illegitimate values will not be accepted
        while (true) {
            try {
            for (int i = 0; i < 5; i++) {
                //loop for storing and adding values for the final sum
                System.out.print("Enter a number: ");
                inputstring = readInput.readLine();

                    sumofallnumbers += Integer.parseInt(inputstring);


            }
            } catch (NumberFormatException e) {
                System.out.print("Sorry. That's not a valid input.\n");
            }
            //print out the final sum
            System.out.printf("The total is %d.", sumofallnumbers);

            return sumofallnumbers;
        }

    }
}


