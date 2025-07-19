package hu.bd;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void gameLogic() {
        Random random = new Random();
        int secretNumber = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);

        int userGuess;
        boolean isGuessedCorrectly = false;
        int attemptCount = 0;

        do {
            attemptCount++;
            try {
                System.out.println("Enter a number between 1-10:");
                userGuess=scanner.nextInt();
                if (userGuess == secretNumber){
                    System.out.println("Correct guess! Number of attempts: "+attemptCount);
                    isGuessedCorrectly=true;
                } else if (userGuess<secretNumber) {
                    System.out.println("The secret number is higher than your guess.");
                }else {
                    System.out.println("The secret number is lower than your guess.");
                }
            }catch (java.util.InputMismatchException e){
                System.out.println("Invalid input! Please enter a number: ");
                scanner.next();
            }
        }while (!isGuessedCorrectly);
        scanner.close();
    }

    public static void main(String[] args) {
        gameLogic();
    }
}