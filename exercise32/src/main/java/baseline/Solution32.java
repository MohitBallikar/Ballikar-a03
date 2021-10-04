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
    //main calls the game function
    public static void main(String[] args) throws IOException
    {

        guessthenumber();

    }
    //does the randomization and the background of the game
    static void guessthenumber() throws IOException
    {
        //initialize the values for each variable
        int difficultylevel = 0;
        int yourguess = 0;
        int min = 0;
        int max = 0;
        int randomvalue = 0;
        String inputstring = "";
        System.out.println("Let's play Guess the Number!");

        //int i=2 Add one for first call.

        //Define the standard library for inputs
        BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));

        //loop ensures that the correct value is entered
        while (true)
        {
            //new random number is made before each round/game
            Random random = new Random();

            //user selects difficulty
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            inputstring = readInput.readLine();

            try
            {
                difficultylevel = Integer.parseInt(inputstring);

                //hard codes the bounds for the min and max for each difficulty
                //the random value will be in between these bounds

                if (difficultylevel == 1 )
                {
                    min = 1;
                    max = 10;
                    randomvalue = random.nextInt(max + min) + min;
                }

                //difficultylevel = 2
                if (difficultylevel == 2 )
                {
                    min = 1;
                    max = 100;
                    randomvalue = random.nextInt(max + min) + min;
                }

                // difficultylevel = 3
                if (difficultylevel == 3 )
                {
                    min = 1;
                    max = 1000;
                    randomvalue = random.nextInt(max + min) + min;
                }

                //begins reading user guesses
                System.out.print("I have my number. What's your guess?: ");
                inputstring = readInput.readLine();
                yourguess = Integer.parseInt(inputstring);
                int i=1; // Add one for first call.


                while (true)
                {

                    //System.out.println("i " + i);
                    //ends loop if guessed correctly
                    if ( randomvalue == yourguess )
                    {
                        break;
                    }
                    //custom prompts to lead the user to the correct answers
                    else if ( yourguess < randomvalue)
                    {
                        System.out.println("Too low. Guess again: ");
                        inputstring = readInput.readLine();
                        yourguess = Integer.parseInt(inputstring);
                    }
                    else if ( yourguess > randomvalue)
                    {
                        System.out.println("Too High. Guess again: ");
                        inputstring = readInput.readLine();
                        yourguess = Integer.parseInt(inputstring);
                    }

                    //increment the counter after each guess
                    i++;
                }

                //print out result and ask to play again
                System.out.printf("You got it in %d guesses!\n",i);

                System.out.println("Do you wish to play again (Y/N)? ");
                inputstring = readInput.readLine();

                if ( inputstring.equals("n") || inputstring.equals("N"))
                {
                    System.exit(0);
                }


            }
            catch (Exception e) {
                System.out.println("Inputs are not valid.");
            }
        }
    }
    }



