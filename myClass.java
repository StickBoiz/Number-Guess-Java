import java.util.*;
public class myClass
{
    public static void main(String[] args)
    {
        NumberGuessingGame player = new NumberGuessingGame();
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number I'm thinking of between 1 and 100.");
        System.out.println("You have 10 attempts to guess the correct number.");
        System.out.println("Good luck!");
        player.startGame();
    }
}
class NumberGuessingGame
{ Scanner input = new Scanner(System.in);
    

    void startGame()
    {
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        while (numberOfTries < 10 && !hasGuessedCorrectly)
        {
            System.out.print("Enter your guess: ");
            int playerGuess = input.nextInt();
            numberOfTries++;

            if (playerGuess == numberToGuess)
            {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the correct number!");
                System.out.println("You took "+numberOfTries+" attempts to guess!");
            }
            else if (playerGuess < numberToGuess)
            {
                System.out.println("Too low! Try again.");
            }
            else
            {
                System.out.println("Too high! Try again.");
            }
        }

        if (!hasGuessedCorrectly)
        {
            System.out.println("Sorry, you've used all your attempts. The correct number was " + numberToGuess + ".");
        }
    }
}