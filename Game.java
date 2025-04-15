import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int guess;
        int numberOfTries = 0;
        boolean hasWon = false;

        System.out.println("Welcome to the game");
        System.out.println("I have a number between 1 and 100, can you guess it correct?");

        while (!hasWon) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low! try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! try again.");
            } else {
                hasWon = true;
                System.out.println("congratulations! you guessed the number in " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}
