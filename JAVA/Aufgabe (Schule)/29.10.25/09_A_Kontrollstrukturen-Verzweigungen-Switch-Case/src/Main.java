import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a number between 1 and 7.
        //     If the number is a 1, then print out Monday.  2 = Tuesday, 3 = Wednesday and so on until 7 = Sunday.
        //     Print "Not a weekday!" if it's not a number between 1-7.

        System.out.println("Write down a number between 1-7");
        byte day = userInput.nextByte();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Its not a weekday");
        }

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

            default -> System.out.println("Its not a weekday");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a Month (String). Based on the provided month, print out the corresponding season.
        //     Months: January, February, March, April, May, June, July, August, September, October, November, December
        //     Seasons: Winter, Spring, Summer, Autumn
        //     Example:  "January" -> "Winter"
        //     Example: "EMVs" -> "Not a month!";
        //     Write the old switch-statement so, that it only contains 4 breaks.

        userInput.nextLine();
        System.out.println("Write down a Month. Don't forget the uppercase letters");
        String month = userInput.nextLine();

        switch (month) {
            case "December":
            case "January":
            case "February":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Not a Month");
        }

        switch (month) {
            case "December", "January", "February" -> System.out.println("Winter");
            case "March", "April", "May" -> System.out.println("Spring");
            case "June", "July", "August" -> System.out.println("Summer");
            case "September", "October", "November" -> System.out.println("Autumn");
            default -> System.out.println("Not a Month");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Create a program that takes a month number (1-12) and prints the number of days in that month.
        //     Assume it's not a leap year.

        System.out.println("Write down a month you choose in numbers");
        byte monthNumber = userInput.nextByte();

        switch (monthNumber) {
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                System.out.println("This month only has 30 Days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("This month has 31 Days");
                break;
        }

        switch (monthNumber) {
            case 2, 4, 6, 8, 10, 12 -> System.out.println("This month only has 30 Days");
            case 1, 3, 5, 7, 9, 11 -> System.out.println("This month has 31 Days");

        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Create a basic role-playing game character class selector.
        //      Based on a number input, assign strength, agility, and intelligence values to a character.
        //      Example: "Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): "
        //      User Input: 2
        //      Output: "Mage (Strength: 3, Agility: 4, Intelligence: 9)"


        System.out.println("Choose a class");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Rouge");
        System.out.println("4. Cleric");

        userInput.nextLine();
        String classes = userInput.nextLine();

        switch (classes) {
            case "Warrior" -> System.out.println("Strength: 8, Agility: 3, Intelligence: 3");
            case "Mage" -> System.out.println("Strength: 3, Agility: 4, Intelligence: 9");
            case "Rouge" -> System.out.println("Strength: 4, Agility: 7, Intelligence: 5");
            case "Cleric" -> System.out.println("Strength: 3, Agility: 5; intelligence: 5");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Solve this exercise with whatever switch you feel more comfortable (new or old).
        //      You can use all you know so far to solve this.
        //      Ask the user to translate a digit (0-9) (userInput 1)
        //      in another language (1-german, 2-english, 3-japanese) (user input 2).

        //      Example:
        //      "Which digit do you want to translate?" -> 7
        //      "In which language do you want to translate your digit?" -> 3
        //      Output: nana

        //      Help for japanese Numbers:
        //      0: zero
        //      1: ichi
        //      2: ni
        //      3: san
        //      4: shi
        //      5: go
        //      6: roku
        //      7: nana
        //      8: hachi
        //      9: kyuu
        //      default: Mukō na sūchi

        System.out.println("Which digit do you want to translate? 0-9");
        byte translateDigit = userInput.nextByte();
        System.out.println("In which language do you want to translate it? 1-german, 2-english, 3-japanese");
        userInput.nextLine();
        String translateLanguage = userInput.nextLine();

        switch (translateLanguage) {
            case "german" -> {

                switch (translateDigit) {
                    case 0 -> System.out.println("0: null ");
                    case 1 -> System.out.println("1: ein");
                    case 2 -> System.out.println("2: zwei");
                    case 3 -> System.out.println("3: drei");
                    case 4 -> System.out.println("4: vier");
                    case 5 -> System.out.println("5: fünf");
                    case 6 -> System.out.println("6: sechs");
                    case 7 -> System.out.println("7: sieben");
                    case 8 -> System.out.println("8: acht");
                    case 9 -> System.out.println("9: neun");
                }
            }


        }

        switch (translateLanguage) {
            case "english" -> {

                switch (translateDigit) {
                    case 0 -> System.out.println("0: zero");
                    case 1 -> System.out.println("1: one");
                    case 2 -> System.out.println("2: two");
                    case 3 -> System.out.println("3: three");
                    case 4 -> System.out.println("4: four");
                    case 5 -> System.out.println("5: five");
                    case 6 -> System.out.println("6: six");
                    case 7 -> System.out.println("7: seven");
                    case 8 -> System.out.println("8: eight");
                    case 9 -> System.out.println("9: nine");
                }
            }
        }

        switch (translateLanguage) {
            case "japanese" -> {

                switch (translateDigit) {
                    case 0 -> System.out.println("0: zero");
                    case 1 -> System.out.println("1: ichi");
                    case 2 -> System.out.println("2: ni");
                    case 3 -> System.out.println("3: san");
                    case 4 -> System.out.println("4: shi");
                    case 5 -> System.out.println("5: go");
                    case 6 -> System.out.println("6: roku");
                    case 7 -> System.out.println("7: nana");
                    case 8 -> System.out.println("8: hachi");
                    case 9 -> System.out.println("9: kyuu");
                }
            }
        }




        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.   Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Write a small calculator. A user types in two numbers and an operation ('addition', 'subtraction', 'division', 'multiplication').
        //      Calculate the correct answer and print it out.
        //      Print a warning when the user tries to divide by 0 (Example: 2/0 -> number two must not be 0!

        System.out.println("Whit which two numbers do you want to calculate? Please note that you won't be able to divide by 0");
        float calcNumber1 = userInput.nextFloat();
        float calcNumber2 = userInput.nextFloat();
        System.out.println("Do you want to do 1-addition 2-subtraction 3-division 4-multiplication");
        userInput.nextLine();
        String operation = userInput.nextLine();

        switch (operation) {
            case "addition" -> System.out.println(calcNumber1 + calcNumber2);
            case "subtraction" -> System.out.println(calcNumber1 - calcNumber2);
            case "division" -> {
                if (calcNumber2 == 0) {
                    System.out.println("Can't divide by 0");
                } else {
                    System.out.println(calcNumber1 / calcNumber2);
                }
            }
            case "multiplication" -> System.out.println(calcNumber1 * calcNumber2);
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Optional exercises");
        // 01.  Try to come up with a program on your own and the tools you
        //    know so far. Try to implement user input.
    }
}