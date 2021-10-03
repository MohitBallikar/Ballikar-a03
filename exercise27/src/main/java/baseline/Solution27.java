/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution27 {
    //calls the function
    public static void main(String[] args) throws IOException {
        validateInput();
    }
    //initializes and requests for user input
    static void validateInput() throws IOException
    {
        int errorcount = 0;
        String firstname = "";
        String lastname = "";
        String zipcode = "";
        String employeeID = "";

        //Defines library for inputs
        BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));

        //Prompts the user the questions below
        System.out.print("Enter the first name: ");
        firstname = readInput.readLine();

        System.out.print("Enter the last name: ");
        lastname = readInput.readLine();

        System.out.print("Enter the ZIP code: ");
        zipcode = readInput.readLine();

        System.out.print("Enter the employee ID: ");
        employeeID = readInput.readLine();

        //string builder is made to fulfill the single output constraint
        StringBuilder str = new StringBuilder("");

        //individual methods are called and are conditionally selected for an output
        errorcount += checkfirstname(firstname) ;
        if (errorcount == 1){
        str.append("The first name must be at least 2 characters long.\n");
        }

        errorcount += checklastname(lastname);
        if (errorcount == 2){
            str.append("The last name must be at least 2 characters long.\n");
        }

        if(errorcount == 3){
            str.append("The last name must be at least 2 characters long.\n");
            str.append("The last name must be filled in.\n");
        }
        errorcount += checkemployeeID(employeeID);
        if (errorcount == 4){
            str.append("The employee ID must be in the format of AA-1234.\n");
        }
        errorcount += checkzipcode(zipcode);

        if (errorcount == 5){
            str.append("The zipcode must be a 5 digit number.\n");
        }

        //checks to see if there are no errors
        if (errorcount == 0)
        {
            str.append("There were no errors found.");
        }
        System.out.printf(String.valueOf(str));
    }

    //function checks for errors within the user input
    static int checkfirstname(String fname)
    {
        if (fname.length() < 2)
        {
            return 1;
        }
        else
            return 0;
    }

    //function checks for errors within the user input
    static int checklastname(String lname)
    {
        if (lname.length() == 0 && lname.length() < 2){
        return 2;
        }

        if (lname.length() < 2)
        {
            return 1;
        }


        else
            return 0;
    }

    //function checks for errors within the user input
    static int checkzipcode(String zipcode)
    {
        int integerValue = 0;

        try
        {   //parses the string and ensures that the length is correct
            integerValue = Integer.parseInt(zipcode);
            int integerlength = String.valueOf(integerValue).length();
            if (integerlength < 5 )
            {
                return 1;
            }
        }
        catch (NumberFormatException e)
        {
            return 1;
        }
        return 0;
    }

    //function checks for errors within the user input
    static int checkemployeeID(String employeeID)
    {
        //An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.

        // Checking the character for not being a letter,digit or space

        if (!( (Character.isLetter(employeeID.charAt(0))) &&
                (Character.isLetter(employeeID.charAt(1))) &&
                (employeeID.charAt(2) == '-') &&
                (Character.isDigit(employeeID.charAt(3))) &&
                (Character.isDigit(employeeID.charAt(4))) &&
                (Character.isDigit(employeeID.charAt(5))) &&
                (Character.isDigit(employeeID.charAt(6)))
        )
        )
        {
            return 1;
        }
        return 0;
    }
}


