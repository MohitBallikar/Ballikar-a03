/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution34
{
    public static void main(String[] args)  throws IOException
    {
        //Remove an Employee from this list.
        removeemployee();
    }

    static void removeemployee() throws IOException
    {
        String inputstring = "";
        int noofemployees = 5;
        boolean employeeremoved = false;

        // Declaring the ArrayList for the Employees
        ArrayList<String> employeelist  = new ArrayList<String>(noofemployees);
        employeelist.add("John Smith");
        employeelist.add("Jackie Jackson");
        employeelist.add("Chris Jones");
        employeelist.add("Amanda Cullen");
        employeelist.add("Jeremy Goodwin");

        //Display current Employees
        displayemployees(employeelist);

        //Define the standard library for inputs
        BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter an employee name to remove: ");
        inputstring = readInput.readLine();

        //Check for all Employee names.
        for (int i = 0; i < employeelist.size(); i++)
        {
            //Check if that employee is there in the list.
            if (employeelist.get(i).equals(inputstring))
            {
                //Remove the Employee
                employeelist.remove(inputstring);
                employeeremoved = true;
            }
        }

        //if the employee is not found then print out error message.
        if (!employeeremoved)
        {
            System.out.println("Employee '"+inputstring+"' not found.\n");
        }

        //Display the new employee list.
        displayemployees(employeelist);

    }

    //Method to display employees.
    static void displayemployees(ArrayList<String> employeelist)
    {
        System.out.println("There are "+employeelist.size()+" employees:");
        for (int i = 0; i < employeelist.size(); i++)
        {
            // Printing Employee names
            System.out.print(employeelist.get(i) + "\n");
        }
    }
}

/*
Create a small program that contains a list of employee names.
Print out the list of names when the program runs the first time.
Prompt for an employee name and remove that specific name from the list of names.
Display the remaining employees, each on its own line.
Use an array or list to store the names.
    Will need to have a list of employee names
    Print out the list (loop)
    Prompt for an employee name to remove
    Display rest of the untouched list
 */
