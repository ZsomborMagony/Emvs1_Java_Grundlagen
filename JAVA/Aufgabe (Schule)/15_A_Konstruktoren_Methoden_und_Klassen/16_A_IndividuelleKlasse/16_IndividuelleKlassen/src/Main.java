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
        System.out.println("You can exit the program if you type exit");
        System.out.println("1. Ferrari 296 GT3   2. Lamborghini Huracan GT3 EVO2   3. Porsche 911 GT3");
        String carChoice = userInput.nextLine();
        while (carChoice != "exit") {
            if (carChoice .equals("lamborghini")) {
                lamborghini_Huracan_GT3_EVO2.brand = carChoice;
                System.out.println(lamborghini_Huracan_GT3_EVO2.brand);
                System.out.println(lamborghini_Huracan_GT3_EVO2.topspeed);
                System.out.println(lamborghini_Huracan_GT3_EVO2.torque);
                System.out.println(lamborghini_Huracan_GT3_EVO2.type);
                System.out.println(lamborghini_Huracan_GT3_EVO2.weight);
                System.out.println(lamborghini_Huracan_GT3_EVO2.motorType);
                break;
            } else if (carChoice .equals("ferrari")) {
                ferrari_296_GT3.brand = carChoice;
                System.out.println(ferrari_296_GT3.brand);
                System.out.println(ferrari_296_GT3.topspeed);
                System.out.println(ferrari_296_GT3.torque);
                System.out.println(ferrari_296_GT3.type);
                System.out.println(ferrari_296_GT3.weight);
                System.out.println(ferrari_296_GT3.motorType);
                break;
            } else if (carChoice .equals("porsche")) {
                porsche_911_GT3.brand = carChoice;
                System.out.println(porsche_911_GT3.brand);
                System.out.println(porsche_911_GT3.topspeed);
                System.out.println(porsche_911_GT3.torque);
                System.out.println(porsche_911_GT3.type);
                System.out.println(porsche_911_GT3.weight);
                System.out.println(porsche_911_GT3.motorType);
                break;
            }
        }


    }
}