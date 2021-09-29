/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;
import java.util.Arrays;
import java.util.Scanner;
public class Solution24 {
/*Implement scanners to grab user input and determine if they are anagrams
Prompt for user input
Process the user inputs and compare if they are anagrams or shuffles of each other
Display the result of the processing to the user
 */

    //this function will store the strings inputted by the user and process the comparison
    //essentially acts as a switch case for the separate cases of the function providing unique responses for true/false
    public static boolean isAnagram(char[] str1, char[] str2){

        //define a simple test for if the strings are not the same length to know if they are different
        int in1 = str1.length;
        int in2 = str2.length;

        if(in1 != in2)
            return false;
        //sorts the contents of each array of characters for comparison
        Arrays.sort(str1);
        Arrays.sort(str2);

        //goes through and processes each character between each array
        for(int i = 0; i < in1; i++){
            if(str1[i] != str2[i])
                return false;
        }

    return true;
    }

    //main will contain scanners and will do the printing for the users
    public static void main(String[] args) {
        Scanner scaninp1 = new Scanner(System.in);
        Scanner scaninp2 = new Scanner(System.in);

        //prompts for user input
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n");

        //asks for first string, stores this string to an array characters, and then creates a string from the array
        System.out.print("Enter the first string: ");
        char[] str1 = scaninp1.next().toCharArray();
        String string1 = new String(str1);

        //asks for first string, stores this string to an array characters, and then creates a string from the array
        System.out.print("Enter the second string: ");
        char[] str2 = scaninp2.next().toCharArray();
        String string2 = new String(str2);

        //conditional statement(s) for the appropriate output from the function call
        //the printf statements only function due to the newly created strings seen above

        if (isAnagram(str1, str2))
            System.out.printf("\"%s\"" + " and "
                    + "\"%s\"" + " are anagrams.", string1, string2);
        else
            System.out.printf("\"%s\"" + " and "
                    + "\"%s\"" + " are not anagrams.", string1, string2);
    }

}
