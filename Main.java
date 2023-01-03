import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Can you guess what number the computer is thinking of?\nEnter a num from 0 - 100.");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();


        Random rand = new Random();
        int compNum = rand.nextInt(0, 101);
        if (compNum == guess )
        {
            System.out.println("Awesome! You've guessed the number!");
        }

        else {
            if (compNum >= 75)
            {
                System.out.println("Hint 1 : The number is > or = to 75. Guess again!");
            }
            else if (compNum >= 50)
            {
                System.out.println("Hint 1 : The number is > or = to 50 but < 75. Guess again!");
            }
            else if (compNum >= 25)
            {
                System.out.println("Hint 1 : The number is > or = to 25 but < 50. Guess again!");
            }
            else if (compNum >= 0)
            {
                System.out.println("Hint 1 : The number is > or = to 0 but < 25. Guess again!");
            }

            int guess2 = scan.nextInt();

            if (guess2 == compNum)
            {
                System.out.println("Awesome! You guessed it!");
            }
            if (compNum >= 90)
            {
                System.out.println("Hint 2 : The number is > or = to 90. Guess again!");
            }
            else if (compNum >= 80 && compNum < 90)
            {
                System.out.println("Hint 2 : The number is > or = to 80 but < 90. Guess again!");
            }
            else if (compNum >= 70 && compNum < 80)
            {
                System.out.println("Hint 2 : The number is > or = to 70 but < 80. Guess again!");
            }
            else if (compNum >= 60 && compNum < 70)
            {
                System.out.println("Hint 2 : The number is > or = to 60 but < 70. Guess again!");
            }
            if (compNum >= 50 && compNum < 60)
            {
                System.out.println("Hint 2 : The number is > or = to 50 but < 60. Guess again!");
            }
            else if (compNum >= 40 && compNum < 50)
            {
                System.out.println("Hint 2 : The number is > or = 40 but < 50. Guess again!");
            }
            else if (compNum >= 30 && compNum < 40)
            {
                System.out.println("Hint 2 : The number is > or = to 30 but < 40. Guess again!");
            }
            else if (compNum >= 20 && compNum < 30)
            {
                System.out.println("Hint 2 : The number is > or = to 20 but < 30. Guess again!");
            }
            if (compNum >= 10 && compNum < 20)
            {
                System.out.println("Hint 2 : The number is > or = to 10 but < 20. Guess again!");
            }
            if (compNum >= 0 && compNum < 10)
            {
                System.out.println("Hint 2 : The number is > or = to 0 but < 10. Guess again!");
            }
            int guess3 = scan.nextInt();
            if (guess3 == compNum)
            {
                System.out.println("Awesome! You guessed it!");
            }
            else {
                if (compNum % 2 == 0)
                {
                    System.out.println("Hint 3 : The number is even. Guess one more time!");
                }
                else
                {
                    System.out.println("Hint 3 : The number is odd. Guess one more time! ");
                }

                int guess4 = scan.nextInt();

                if (guess4 == compNum)
                {
                    System.out.println("Awesome! You guessed it!");
                }
                else
                {
                    System.out.println("The number was " + compNum + ". Better luck next time!");
                }

            }
        }
    }
}



