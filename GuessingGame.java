import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a random number between 1 and 100");
        int humanNumber = scanner.nextInt();
        int min = 1, max = 101;
        Random random = new Random();
        int randomNumber = random.nextInt(max - min) + min;
        int incorrectGuess = 0;
        do{
           if (humanNumber == randomNumber){
               System.out.println("Congratulations you are correct!");
               break;
           }
           else{
               if (humanNumber > randomNumber) {
                   System.out.println("Too high guess again");
                   incorrectGuess++;
               }
               else{
                       System.out.println("Too low guess again");
                       incorrectGuess++;
                   }
               }
                humanNumber = scanner.nextInt();
           } while (humanNumber != randomNumber);
        System.out.println("Correct! You guessed wrong " + incorrectGuess + " times.");
        scanner.close();
    }
}