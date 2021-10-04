/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Mohit Ballikar
 */
package baseline;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class Solution32 {

    public static void main(String[] args) {

            guessthenumber();
    }

    static void guessthenumber(){

    }






}


/*
The first level of difficulty would be a number between 1 and 10.
The second difficulty set would be between 1 and 100.
The third difficulty set would be between 1 and 1000.

Prompt for the difficulty level, and then start the game.
The computer picks a random number in that range and prompts the player to guess that number.
Each time the player guesses,
the computer should give the player a hint whether the number is too high or too low.
The computer should also keep track of the number of guesses.
Once the player guesses the correct number,
the computer should present the number of guesses and ask if the player would like to play again.

    Prompt for input, and then call a function which will house the game
    Player guesses for a number that the computer/program defines
    Player guess must be compared to the computer value
    Each guess must be counted
    Once guess == computer number, computer prints the number of guesses and asks if the player wants to play again

Don’t allow any non-numeric data entry.
During the game, count non-numeric entries as wrong guesses.

 */