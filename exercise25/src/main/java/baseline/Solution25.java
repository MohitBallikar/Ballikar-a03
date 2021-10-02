/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution25 {

    /*
    prompt for user input
    passwordValidator must be used for the comparison of the password to the requirements
    maybe use a string comparison function or an array of character(s) function for the actual processing
    ensure that a single output statement is used (could be a separate function)
        output is varied between: very weak, weak, strong, very strong, and unknown
    generate test cases for the efficacy of each of the above labels/descriptions

     */

    public static int passwordValidator(String password) {

        int plen = password.length();
        int pstr = 0;

        String regex = "^[a-zA-Z0-9]+$";
        Pattern pattern = Pattern.compile(regex);


        for (int i = 0; i < plen; i++) {

            if ((pstr == 0) && (plen < 8) && (password.charAt(i) >= '!' && password.charAt(i) <= '/' || password.charAt(i) >= ':' && password.charAt(i) <= '@' || password.charAt(i) >= '[' && password.charAt(i) <= '\'' || password.charAt(i) >= '{' && password.charAt(i) <= '~')) {
                pstr = 0;
                return pstr;
            }

            if ((plen <= 7) && (password.charAt(i) >= '0') && (password.charAt(i) <= '9')) {
                pstr = -2;
                return pstr;
            }

            if ((plen <= 7) && (password.matches("[a-zA-Z]+"))) {
                pstr = -1;
                return pstr;
            }

            Matcher matcher = pattern.matcher(password);
            pstr = 1;

            if ((pstr == 1) && (plen >= 8)) {
                pstr = 2;
                return pstr;
            }


            if ((pstr == 1) && (((password.charAt(i) >= '!') && (password.charAt(i) <= '/')) || ((password.charAt(i) >= ':') && (password.charAt(i) <= '@')) || ((password.charAt(i) >= '[') && (password.charAt(i) <= '\'')) || ((password.charAt(i) >= '{') && (password.charAt(i) <= '~')))) {
                pstr = 3;
                return pstr;
            }




            return pstr;
        }


        public static void main(String[]args){
            Scanner pwdscan = new Scanner(System.in);

            System.out.print("Enter a password: ");

            String password = pwdscan.nextLine();


            int score = passwordValidator(password);

            if (score == -2)
                System.out.printf("The password \'%s\' is a very weak password. ", password);

            if (score == -1)
                System.out.printf("The password \'%s\' is a weak password. ", password);

            if (score == 0)
                System.out.printf("The password \'%s\' is of unknown strength. ", password);

            if (score == 2)
                System.out.printf("The password \'%s\' is a strong password. ", password);

            if (score == 3)
                System.out.printf("The password \'%s\' is a very strong password. ", password);
        }
    }
}
