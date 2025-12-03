import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Temperatur temp1 = new Temperatur(16);

        temp1.printCelsius();

        Temperatur temp2 = new Temperatur(18.23);

        temp2.printCelsius();

        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the current Temperatur?");
        double tempUser = userInput.nextInt();
        Temperatur temp3 = new Temperatur(tempUser);
        temp3.printCelsius();
        temp3.printHotOrColdCelsius();
        System.out.println("Do you want to convert it to Fahrenheit?");
        System.out.println("If you want to convert it to fahrenheit than type in yes if not than no");
        userInput.nextLine();
        String fahrenheitChoice = userInput.nextLine();
        if (fahrenheitChoice .equals("yes")) {
            temp3.calculateCelsiusToFahrenheit();
        }else{
            System.out.println("Continuing the program");
        }
        System.out.println("Do you want to also convert it to Kelvin?");
        System.out.println("If you want to convert it to Kelvin than type yes if not than no");
        String kelvinChoice = userInput.nextLine();
        if (kelvinChoice .equals("yes")) {
            temp3.calculateCelsiusToKelvin();
        }else {
            System.out.println("The Program has reached it's end. Closing the Program.......");
        }

        temp3.convertCelsiusToFahrenheit(12.5);
        temp3.convertCelsiusToFahrenheit(46);
        temp3.convertCelsiusToFahrenheit(0);
        temp3.convertCelsiusToFahrenheit(128);
        temp3.convertCelsiusToFahrenheit(47);

    }
}