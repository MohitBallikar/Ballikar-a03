/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Solution36 {
    public static void main(String[] args) throws IOException
    {
        //Call function to calculate statistics
        computestats();
    }

    static void computestats() throws IOException
    {   //intialize numbers and strings
        String inputstring = "";
        int numbers = 10;
        float sum = 0;

        // Declaring the ArrayList for the Numbers
        ArrayList<Integer> numberlist  = new ArrayList<Integer>(numbers);
        BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));

        //loop ensures user input is legitimate and collected
        for (int i = 0; i < numbers; i++)
        {

            try
            {
                System.out.print("Enter a number: ");
                inputstring = readInput.readLine();
                //If done then break out of FOR loop.
                if (inputstring.equals("done"))
                {
                    break;
                }


                //Convert to add it to the Array.
                numberlist.add(Integer.parseInt(inputstring));
                sum += Integer.parseInt(inputstring);
            }
            catch (NumberFormatException e)
            {
                //Do nothing
            }

        }

        //Process the inputs
        processinputs(numberlist,sum);

    }

    //Output function to display the output
    static void output(String allnumbers,float averageoutput,float minoutput,float maxoutput ,double stdoutput)
    {
        //Define Decimal Format.
        DecimalFormat df = new DecimalFormat("###.##");

        //print out the output
        System.out.println("Numbers: "+ allnumbers);
        System.out.println("The average is "+ averageoutput);
        System.out.println("The minimum is "+ minoutput);
        System.out.println("The maximum is "+ maxoutput);
        System.out.println("The standard deviation is " + df.format(stdoutput));
        //System.out.printf("The standard deviation is %.3f ", Math.round(stdoutput));

    }

    //gets the inputs from the list
    static void processinputs(ArrayList<Integer> numberlist, float sum)
    {
        float averageoutput = 0;
        float minoutput = 0;
        float maxoutput = 0;
        double stdoutput = 0;

        //Read the Array for all the numbers.

        String allnumbers = "";
        for (int i = 0; i < numberlist.size(); i++)
        {
            allnumbers += numberlist.get(i) + ", ";
        }


        allnumbers = allnumbers.substring(0, allnumbers.length() - 2);

        //Call each function for Avg, min, max and std
        averageoutput = average(sum,numberlist.size());
        minoutput = min(numberlist);
        maxoutput = max(numberlist);
        stdoutput = std(numberlist, sum);

        //Then call the output.
        output(allnumbers,averageoutput,minoutput,maxoutput ,stdoutput);

    }

    //Method to call Average of a Sum.
    static float average(float sum, int noofitems)
    {
        float averagevalue = (sum / noofitems);
        return averagevalue;
    }

    //function to call Minimum of a Sum.
    static float min(ArrayList<Integer> numberlist)
    {
        //Save the first value.
        float minvalue = numberlist.get(0);
        for(int i=1;i<numberlist.size();i++){
            if(numberlist.get(i) < minvalue){
                minvalue = numberlist.get(i) ;
            }
        }

        return minvalue;
    }

    //function to call Maximum of a Sum.
    static float max(ArrayList<Integer> numberlist)
    {
        //Save the first value.

        float maxvalue = numberlist.get(0);
        for(int i=1;i < numberlist.size();i++)
        {
            if(numberlist.get(i) > maxvalue){
                maxvalue = numberlist.get(i);
            }
        }
        return maxvalue;
    }

    //function to call Standard Deviation of a Sum.
    static double std(ArrayList<Integer> numberlist, float sum)
    {
        double standardDeviation = 0.0;
        int length = numberlist.size();
        double mean = sum/length;

        for(int i=0;i < numberlist.size();i++)
        {
            standardDeviation += Math.pow(numberlist.get(i) - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
}


