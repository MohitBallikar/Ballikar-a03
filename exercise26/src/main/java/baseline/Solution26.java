package baseline;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution26 {
    public static void main(String[] args) {

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
