import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int val = generator.nextInt(10) +1;
        int guess = -1;
        System.out.println("Guess a number between 1 and 10 ");

        {
            System.out.print("Enter your guess: ");
            guess = in.nextInt();
            if (guess < val)
            {
                generator = new Random();

                val = generator.nextInt(10) + 1;

                System.out.println("Too low, please try again");
            }
            else if (guess > val)
            {
                generator = new Random();

                val = generator.nextInt(10) + 1;
                System.out.println("Too high, please try again");
            }
            else
            {
               generator = new Random();

                val = generator.nextInt(10) + 1;

                System.out.println("Your guess is correct!");
            }
        }

    }
}