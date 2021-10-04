/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution26 {
    public static void main(String[] args) throws IOException
    {
        //Calculate number of Months for paying off Credit Card.
        calculateMonths();
    }

    static void calculateMonths() throws IOException
    {
        int n = 0;
        String inputString;
        double returnvalue = 0;

        //Define the standard library for inputs
        BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));

        //Initialize the public class.
        PaymentCalculator pc = new PaymentCalculator();

        //Get Inputs
        System.out.print("What is your balance? ");
        inputString = readInput.readLine();
        pc.balance = Float.parseFloat(inputString);

        System.out.print("What is the APR on the card (as a percent)? ");
        inputString = readInput.readLine();
        try
        {
            pc.apr = Integer.parseInt(inputString);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid APR.");
        }

        System.out.print("What is the monthly payment you can make? ");
        inputString = readInput.readLine();
        pc.monthlypayment = Float.parseFloat(inputString);

        //Call the public method to calculate Months.
        returnvalue = pc.calculateMonthsUntilPaidOff();

        if (returnvalue > 0)
        {
            System.out.println("It will take you "+ 365/Math.round(returnvalue)+ " months to pay off this card");
        }

    }

}



/* Need to prompt user balance, APR, and monthly payment
n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i) use this formula for calculation in the final value for the number of months needed to pay off
implement this formula with a calculator which takes the inputs and calculates in the back-end
    Prompt for the card’s APR. Do the division internally.
    Prompt for the APR as a percentage, not a decimal.
    Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff, which takes no parameters and returns the number of months.
    Round fractions of a cent up to the next cent for internal calculations
finally display the data for the user
 */
