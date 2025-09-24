public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Print "I am learning language output and getting to know Strings better" to the console.

        // Your code here
        System.out.println("I am learning language output and getting to know Strings better");
        //--------------------------------------------------------------------------------------------------------------
        // 2. Now print "String concatenation works!" to the console, but not in one piece.
        //    You need to use the "+" operator, which you can also use in the output itself.

        // Your code here
        System.out.println("String"+" concatenation"+" works");
        //--------------------------------------------------------------------------------------------------------------
        // 3. Create a variable "firstName" with the appropriate data type and assign your first name to the variable.
        //    Then print this variable to the console.
        String firstName = "Zsombor";
        System.out.println(firstName);
        // Your code here

        //--------------------------------------------------------------------------------------------------------------
        // 4. Now create another variable.
        //    Name of the variable: lastName.
        //    Value of the variable: Your last name.
        //    Study the code below and complete it so, that the following  output is displayed on the console:
        //
        //    My first name is ...
        //    And my last name is ...
        //    (Obviously replace "..." with your first/last name).

        // Your code here
        String lastName = "Magony";

        System.out.println("My first name is " + firstName);
        System.out.println("And my last name is " + lastName);

        //--------------------------------------------------------------------------------------------------------------
        // 5. Complete the code below so, that it prints the following output:
        //   Berufsfachschule Oberwallis


        String school = "Berufsfachschule";      // Complete this line
        String location = "Oberwallis";           // Complete this line

        // Do not change the following lines
        String result = school + " " + location;
        System.out.println(result);

        // What is the purpose of " " ?

        // Your answer here     Man braucht es um eine Text zu beginnen und beenden

        //--------------------------------------------------------------------------------------------------------------
        // 6. Declare a variable language with the value "language" and print "I am learning language!" using the variable.

        // Your code here
        String language = "Java";
        System.out.println("I am learning " + language);

        //--------------------------------------------------------------------------------------------------------------
        // 7. Print the following lines including
        // one single double quotation marks ("...")
        // and newlines using a single System.out.println:

        // I am learning about
        // escape characters.
        // I need to look up
        // "escape characters"
        // to solve this task.

        // Your code here
        System.out.println("I am learning about \nescape characters. \nI need to look up \n\"escape characters\" \nto solve this task.");
    }
}