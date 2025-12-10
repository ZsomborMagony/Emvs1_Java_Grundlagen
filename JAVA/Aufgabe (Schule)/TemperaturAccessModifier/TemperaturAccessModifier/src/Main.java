import com.berufsfachschule.temperatur.Temperatur;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Temperatur temp1 = new Temperatur((float) -5.37);
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the Temperature today?");
        System.out.println(temp1.printCelsius());
        System.out.println(temp1.getCelsiusToFahrenheit());
        System.out.println(temp1.getCelsiusToKelvin());
        System.out.println(temp1.getCelsius());
    }
}
