/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;

public class Solution30 {

    //calls the function
    public static void main(String[] args) {

        timestable();

    }

    //function prints times table for twelve
    public static void timestable(){
        //loops 12 times
        for (int i = 1; i <= 12 ; i++)
        {
            //multiplies i in the print statement as well as printing the values through this statement
            System.out.printf( "%-3s %3s %3s %3s %3s %3s %3s %3s %3s %3s %3s %3s%n", i, i*2,i*3,i*4, i*5, i*6, i*7, i*8, i*9, i*10, i*11, i*12);
            //formatting is done with the format specifiers
        }
    }
    
}


