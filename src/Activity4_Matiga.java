// importing java utility package for scanner (accept user input) random (generate random numbers)
import java.util.Scanner;
import java.util.Random;

public class Activity4_Matiga {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        // daclaration of variables
        int secretNum = rd.nextInt(11); // random variable bound only to 0-10.
        int userGuess = 0;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 0-10");

        // conditional statement - used to loop the user until meets expected result.
        while (userGuess != secretNum) {
            System.out.print("\nEnter your Guess: ");
            userGuess = sc.nextInt();

            // used post - increment to count the total attempts of the user
            attempts++;

            // else if statement - used to display the progress of the user..
            if (userGuess == secretNum) {
                System.out.println("Congratulations! You have guessed it in " + attempts + " attempts.");
            } else if (userGuess > secretNum) {
                System.out.println("Too High! Try Again.");
            } else {
                System.out.println("Too Low! Try Again.");
            }
        }

        sc.close();
    }
}