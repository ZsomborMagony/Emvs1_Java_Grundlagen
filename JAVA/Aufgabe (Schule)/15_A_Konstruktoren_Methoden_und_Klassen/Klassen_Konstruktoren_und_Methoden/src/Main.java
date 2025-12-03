public class Main {
    public static void main(String[] args) {
        Car honda = new Car("Honda", "white");
        Car lamborghini = new Car("Lamborghini", "red and blue");
        Car koenigsegg = new Car("Koenigsegg", "black");

        System.out.println(honda.brand);
        System.out.println(lamborghini.brand);
        System.out.println(koenigsegg.brand);

        lamborghini.accelerate();
        lamborghini.accelerate();
        lamborghini.accelerate();
        lamborghini.brake();
        lamborghini.accelerate((short) 300);

        System.out.println(lamborghini.currentSpeed);
    }
}