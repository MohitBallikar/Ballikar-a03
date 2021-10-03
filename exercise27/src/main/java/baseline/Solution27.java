/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution27 {
    //calls the functions
    public static void main(String[] args) {
        validateInput();
        String employeeID;
        checkemployeeID(employeeID);
    }
    //does the input validation
    static void validateInput(){

    }
    //checks the employee ID separately
    static int checkemployeeID(String employeeID){
        
    }
}

/*
Write a program that prompts for a first name, last name, employee ID, and ZIP code.
    The first name must be filled in.
    The last name must be filled in.
    The first and last names must be at least two characters long.
    An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
    The ZIP code must be a number.
    Create a validateInput function that takes in all the input data and invokes the specific validation functions.
    Use a single output statement to display the outputs.(String builder?)
        Essentially using if statements to check if certain parameters are correct and then appending/deleting parts of the string
 */
