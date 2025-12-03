import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        Autos ferrari_296_GT3 = new Autos("ferrari");
        Autos lamborghini_Huracan_GT3_EVO2 = new Autos("lamborghini");
        Autos porsche_911_GT3 = new Autos("porsche");

        System.out.println("Welcome to the Racing Archive.");
        System.out.println("Sadly we don't have to much data about the cars, but I hope we can satisfy your curiosity");
        System.out.println("We have 3 cars in our database. Which one of them do you want to be informed about");
        System.out.println("1. Ferrari 296 GT3   2. Lamborghini Huracan GT3 EVO2   3. Porsche 911 GT3");
        int carChoice = userInput.nextInt();
        if (carChoice == 1) {
            System.out.println(ferrari_296_GT3);
        }

    }
}