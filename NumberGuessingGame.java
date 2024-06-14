import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        try (Scanner sc= new Scanner(System.in)) {
            Random random = new Random();
            boolean playAgain = true;
            int score = 0;
            
            while (playAgain) {
                int numberToGuess = random.nextInt(100) + 1;
                int attempts = 0;
                boolean guessedCorrectly = false;
                
                System.out.println("Guess a number between 1 and 100.");
                
                while (!guessedCorrectly) {
                    System.out.print("Enter your guess: ");
                    int guess = sc.nextInt();
                    attempts++;
                    
                    if (guess == numberToGuess) {
                        System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                        guessedCorrectly = true;
                        score++;
                    } else if (guess < numberToGuess) {
                        System.out.println("Too low! Try again.");
                    } else {
                        System.out.println("Too high! Try again.");
                    }
                }
                
                System.out.print("Do you want to play again? (yes/no): ");
                String playChoice = sc.next().toLowerCase();
                if (!playChoice.equals("yes")) {
                    playAgain = false;
                }
            }
            
            System.out.println("Your final score: " + score);
        }
    }
}
