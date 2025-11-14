import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Do this exercises __only__ with while-loops
        // Separate exercises for 'do-while' and 'for' will follow.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //      int iteratorEx1 = 0;
        //      while (iteratorEx1 < 10) {
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is?
                //it would run forever because 0+0=0
        //      2. Why does this behavior occur?
                // iteratorEx1 is always smaller than 10 and thats why the code will run till somebody stops the programm.
        //      3. How can you modify the code to achieve the desired output:
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9
                // System.out.println(iteratorEx1);
                // iteratorEx1++
                // }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using while loops, print each task and its numbers to the console (all numbers inclusive):
        //      02-01. 0 to 100
        //      02-02. 42 to 100
        //      02-03. 42 to 123
        //      02-04. Even numbers (0, 2, 4, ...) from 0 to 10
        //      02-05. Odd numbers (1, 3, 5, ...) from 0 to 10
        //      02-06. -10 to 20
        //      02-07. 35 to 0 (descending)
        //      02-08. 15 to -20 (descending)
        //      02-09. Even numbers from 10 to -10 (descending)
        //      02-10. Odd numbers from 10 to -10 (descending)


        //1.
        int numbers = 0;
        while (numbers <= 100) {
            System.out.println(numbers);
            numbers++;
        }
        System.out.println();
        //2.
        int numbers1 = 42;
        while (numbers1 <= 100) {
            System.out.println(numbers1);
            numbers1++;
        }
        System.out.println();
        //3.
        int numbers3 = 42;
        while (numbers3 <= 123) {
            System.out.println(numbers3);
            numbers3++;
        }
        System.out.println();
        //4.
        int evenNumbers= 0;
        while (evenNumbers <=10) {
            System.out.println(evenNumbers);
            evenNumbers++;
            evenNumbers++;
        }
        System.out.println();
        //5.
        int oddNumbers = 1;
        while (oddNumbers <= 10) {
            System.out.println(oddNumbers);
            oddNumbers++;
            oddNumbers++;
        }
        System.out.println();
        //6.
        int negativeNumbers = -10;
        while (negativeNumbers <= 20) {
            System.out.println(negativeNumbers);
            negativeNumbers++;
        }
        System.out.println();
        //7.
        int descendingNumbers = 35;
        while (descendingNumbers >= 0) {
            System.out.println(descendingNumbers);
            descendingNumbers--;
        }
        System.out.println();
        //8.
        int descendingNumbers1 = 15;
        while (descendingNumbers1 >= -20) {
            System.out.println(descendingNumbers1);
            descendingNumbers1--;
        }
        System.out.println();
        //9.
        int descendingEvenNumbers = 10;
        while (descendingEvenNumbers >= -10) {
            System.out.println(descendingEvenNumbers);
            descendingEvenNumbers--;
            descendingEvenNumbers--;
        }
        System.out.println();
        //10.
        int descendingOddNumbers = 9;
        while (descendingOddNumbers >= -10) {
            System.out.println(descendingOddNumbers);
            descendingOddNumbers--;
            descendingOddNumbers--;
        }
        System.out.println();




        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_03 = 0;

        // Your code here
        int counter = 0;
        while (counter<=100) {
            whileSum_03 = whileSum_03+counter;
            counter++;
        }

        System.out.println(whileSum_03); // Should be 5050

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_04 = 0;

        // Your code here
        int evenCounter = 0;
        while (evenCounter <= 100) {
            whileSum_04 = evenCounter + whileSum_04;
            evenCounter++;
            evenCounter++;
        }

        System.out.println(whileSum_04); // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_05 = 0;

        // Your code here
        int oddCounter = 1;
        while (oddCounter <= 100) {
            whileSum_05 = whileSum_05 + oddCounter;
            oddCounter++;
            oddCounter++;
        }

        System.out.println(whileSum_05); // Should be 2500

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.  Generate random numbers between 0 and 100 (inclusive) until you get 22.
        //      Count and report how many attempts it took to generate 22.

        // Creating an object of type Random, calling it randomGenerator.
        // Check the import at the very beginning of this file. This import is needed to make this work
        Random randomGenerator = new Random();

        // Declaring an integer
        int randomNumber;

        // Setting the value of the integer to a random number between 0 (inclusive) and 101 (exclusive)
        randomNumber = randomGenerator.nextInt(101);
        long iterationSteps = 0;

        // Implement a while loop that:
        // 1. Generates a random number
        // 2. Increments the iteration count
        // 3. Stops when 22 is generated

        // Your code here

        while (randomNumber!=22) {
            randomNumber = randomGenerator.nextInt(101);
            iterationSteps++;
        }

        System.out.println("The program ran " + iterationSteps + " times until the number was found!");
    }
}