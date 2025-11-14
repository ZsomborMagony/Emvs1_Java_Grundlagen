//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Solve the following exercises __only__ with for-loops
        // Exercise 01-05 are similar to the while-exercises, just with a for instead of a while-loop.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //      for (int iteratorEx1 = 0; iteratorEx1 < 10; ) {
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is?
                // it will run forever
        //      2. Why does this behavior occur?
                // The "iteratorEx1++" is not there in "for" function and the variable iteratorEx1 will always stay true and the code will run till the programm stops
        //      3. How can you modify the code to achieve the desired output:
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9

                // for (int iteratorEx1 = 0; iteratorEx1 <10; iteratorEx1++;) {
                //      System.out.println("IteratorEx1:" + iteratorEx1);
                // }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using for loops, print each task and its numbers to the console (all numbers inclusive):
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
        for (int numbers = 0; numbers <= 100; numbers++) {
            System.out.println(numbers);
        }
        System.out.println();
        //2.
        for (int numbers2 = 42; numbers2 <= 100; numbers2++) {
            System.out.println(numbers2);
        }
        System.out.println();
        //3.
        for (int numbers3 = 42; numbers3 <= 123; numbers3++) {
            System.out.println(numbers3);
        }
        System.out.println();
        //4.
        for (int evenNumbers = 0; evenNumbers <= 10; evenNumbers++, evenNumbers++) {
            System.out.println(evenNumbers);
        }
        System.out.println();
        //5.
        for (int oddNumbers = 1; oddNumbers <= 10; oddNumbers++, oddNumbers++) {
            System.out.println(oddNumbers);
        }
        System.out.println();
        //6.
        for (int descendingNumbers = 10; descendingNumbers >= -20; descendingNumbers--) {
            System.out.println(descendingNumbers);
        }
        System.out.println();
        //7.
        for (int descendingNumbers2 = 35; descendingNumbers2 >= 0; descendingNumbers2--) {
            System.out.println(descendingNumbers2);
        }
        System.out.println();
        //8.
        for (int descendingNumbers3 = 15; descendingNumbers3 >= -20; descendingNumbers3--) {
            System.out.println(descendingNumbers3);
        }
        System.out.println();
        //9.
        for (int descendingEvenNumbers = 10; descendingEvenNumbers >= -10; descendingEvenNumbers--, descendingEvenNumbers--) {
            System.out.println(descendingEvenNumbers);
        }
        System.out.println();
        //10.
        for (int descendingOddNumbers = 9; descendingOddNumbers >= -10; descendingOddNumbers--, descendingOddNumbers--) {
            System.out.println(descendingOddNumbers);
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_03 = 0;

        // Your code here
        for (int counter = 0; counter <= 100; counter++) {
            forSum_03 = forSum_03 + counter;
        }

        System.out.println(forSum_03); // Should be 5050

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_04 = 0;

        // Your code here
        for (int evenCounter = 0; evenCounter <= 100; evenCounter++,evenCounter++) {
            forSum_04 = evenCounter + forSum_04;
        }

        System.out.println(forSum_04); // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_05 = 0;

        // Your code here
        for (int oddCounter = 1; oddCounter <= 100; oddCounter++,oddCounter++) {
            forSum_05 = forSum_05 + oddCounter;
        }

        System.out.println(forSum_05); // Should be 2500

    }

}