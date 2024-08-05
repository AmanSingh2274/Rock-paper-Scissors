import java.util.Random;
import java.util.Scanner;

/**
 * NumberGussingGame
 */
public class NumberGussingGame 
{

    public static void main(String[] args) 
    { 
        Scanner reader = new Scanner(System.in);
        String play = "yes";

        // While loop to determine  if we are going to play game again.
        while (play.equals("yes"))
         {
            
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;

            // While loop to check if the game is over.
            while (guess != randNum) 
            {
                System.out.print("Guess a number between 1 and 100: ");
                guess = reader.nextInt();
                tries++;

                if (guess == randNum) 
                {
                    System.out.println("Awesome! You Guessed the Number!!!");
                    System.out.println("It only tooks you " + tries + "Guesses ! ");
                    System.out.println("Would you like to play again ? yes or no ");
                    play = reader.next().toLowerCase();
                }
                else if (guess > randNum) 
                {
                    System.out.println("Your guess is to high ! Try again ");
                }
                else
                {
                    System.out.println("Your guess is to Low ! Try again ");
                }
            }

        }
       reader.close(); 
    }
}