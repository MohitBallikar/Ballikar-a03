/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution29 {
    public static void main(String[] args) {
        inputHandler();
    }

    public static void inputHandler() {
    }
}

/*
Write a quick calculator that prompts for the rate of return on an investment
and calculates how many years it will take to double your investment.
    formula = years = 72 / r
        Don’t allow the user to enter 0.
        Don’t allow non-numeric values.
        Use a loop to trap bad input, so you can ensure that the user enters valid values.

Will need to make a function for calculation/collecting user input
Need to ensure bad input is ignored, if statements (regex), exceptions
 */