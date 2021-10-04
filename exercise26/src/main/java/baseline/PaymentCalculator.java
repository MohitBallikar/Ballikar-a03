/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;

public class PaymentCalculator {
    {
        double balance;
        int apr;
        double monthlypayment;

        public double calculateMonthsUntilPaidOff()
        {
            double noofmonths = 0;
            //Calculate the Paid off here..
            //n is the number of months.
            //i is the daily rate (APR divided by 365).
            //b is the balance.
            //p is the monthly payment.

            double i = (double) apr / 365;
            double b = balance;
            double p = monthlypayment;

            double tempvalue = (double) 1 + i;
            double logvalue = Math.log(tempvalue);
            double powtempvalue = Math.pow(tempvalue,30);
            double tempmathlogvalue = Math.round(1 + (double) b/p * (1 - powtempvalue));
            double mathlogvalue = (double) Math.log(-tempmathlogvalue);
            double divide30 = (double)1/30;
            double t = (double) divide30 * mathlogvalue;

            //noofmonths = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i);
            noofmonths =  t/ (double) logvalue;
            //System.out.println("Value of noofmonths " + Math.round(noofmonths) );

            return noofmonths;

        }
    }
