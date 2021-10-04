/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution31 {
    public static void main(String[] args) throws IOException {
        //initialize the values for the variables/strings
        int age = 0;
        int restingHR = 0;
        int TargetHeartRate = 0;
        int n = 5; //Add 5 counters.

        String inputstring = "";

        //Define the standard library for inputs
        BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));
        //loop ensures only legitimate inputs are accepted
        while (true) {
            System.out.print("Enter your Age: ");
            inputstring = readInput.readLine();
            try {
                age = Integer.parseInt(inputstring);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Sorry. That's not a valid input.\n");
            }
        }
            while (true){
            System.out.print("Enter your Resting Heart Rate: ");
            inputstring = readInput.readLine();
            try {
                restingHR = Integer.parseInt(inputstring);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Sorry. That's not a valid input.\n");
            }
        }

            //calls calculation functions
        int agedifference = diffcalc1(age);
        int tempvalue = diffcalc2(agedifference, restingHR);

        //tabular formatting
        System.out.println("Intensity    | Rate   ");
        System.out.println("-------------|--------");

        //loop calls last calculation function for TargetHeartRate
        for (int intensity = 55; intensity <= 95; intensity += n) {
            TargetHeartRate = thrcalc(tempvalue,intensity,restingHR);
            Math.round(TargetHeartRate);
            //prints out the data with proper formatting
            System.out.printf("%d%%\t\t\t |%d bpm\n", intensity, TargetHeartRate);
        }
    }

    //calculates age difference from 220
    public static int diffcalc1(int age) {
        return 220 - age;
    }

    //calculates final difference between agedifference and inputted resting heart rate
    public static int diffcalc2(int agedifference, int restingHR){
        return agedifference - restingHR;

    }

    //performs final calculation
    public static int thrcalc(int finaldiff, int intensity, int restingHR){
        return ((finaldiff * intensity) / 100) + restingHR;
    }
}



