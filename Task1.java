import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;
        System.out.println("This game contains three rounds you need guess the correct number choosen by the computer");
        System.out.println("If you guess the correct number you will get 10 points");
        int score = 0;
            for (int round = 1; round <=5; round++) {
                System.out.println("Round "+ round +" Guess  a number between 1 and 100:");
                int userInput = scanner.nextInt();
                if (userInput == randomNumber) {
                    System.out.println("you guessed correctly");
                    System.out.println("congratulations! you got 10 points");
                    score++;
                    break;
                } else if (userInput < randomNumber) {
                    System.out.println("your guessed number is less than random number selected by system");
                } else {
                    System.out.println("your guessed number is greater than random number selected by system");
                }
            }
            System.out.println("The Random number taken by system" + randomNumber);
        System.out.println("your final score is: "+score*10);

    }

}