import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the game 'Crack the Code'");
        System.out.println("You will be given a randomly generated four digit code and you will have to guess it in 5 attempts. If you can guess it till the end than you will loose the game, but if you can guess it correctly you have won.");

        Random random = new Random();
        int randomnumber = 0 + random.nextInt(9);
        int randomnumber1 = 0 + random.nextInt(9);
        int randomnumber2 = 0 + random.nextInt(9);
        int randomnumber3 = 0 + random.nextInt(9);

        System.out.println(randomnumber);
        System.out.println(randomnumber1);
        System.out.println(randomnumber2);
        System.out.println(randomnumber3);

        byte points = 0;
        byte score = 1;
        points += score;
        for (int i = 0; i < 6; i++) {
                points = 0;
                System.out.println("You now have five attempts to guess the random code from 0-9");

                int guess = userInput.nextInt();

                if (guess == randomnumber) {
                    System.out.println("You guessed a number correct");
                    points += score;
                } else {
                    System.out.println("you guessed wrongly");
                }

                int guess1 = userInput.nextInt();

                if (guess1 == randomnumber1) {
                    System.out.println("You guessed a number correct");
                    points += score;
                } else {
                    System.out.println("you guessed wrongly");
                }

                int guess2 = userInput.nextInt();

                if (guess2 == randomnumber2) {
                    System.out.println("You guessed a number correct");
                    points += score;
                } else {
                    System.out.println("you guessed wrongly");
                }

                int guess3 = userInput.nextInt();

                if (guess3 == randomnumber3) {
                    System.out.println("You guessed a number correct");
                    points += score;
                } else {
                    System.out.println("you guessed wrongly");
                }
                System.out.println("You have " + points + " points");
                if (points == 4) {
                    System.out.println("congratulations on guessing the 4 digit code correctly");
                    break;
                } else {
                    System.out.println("Try again next time");
                }
            }

        }
    }
