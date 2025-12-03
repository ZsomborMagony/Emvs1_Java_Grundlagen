public class Car {
    public byte doorsAmount = 3;
    public byte seatsAmount = 2;

    public boolean isStreetCar;
    public boolean isSportsCar;
    public boolean isRaceCar;
    public boolean isSpecialCar;

    public String colour = "default-colour";
    public String brand = "default-brand";

    public short maxSpeed = 100;

    public Car(String brand, String colour) {
        this.brand = brand;
        this.colour = colour;
    }


    public short currentSpeed = 0;
    public boolean lightsOn = false;

    public void accelerate() {
        this.currentSpeed += 10;
    }

    public void accelerate(short amount) {
        this.currentSpeed += amount;
    }

    public void brake() {
        this.currentSpeed -= 10;
    }

    public void brake(short amount) {
        this.currentSpeed -= amount;
    }

    public void honk() {
        System.out.println("honk honk");
    }

    public void turnLightsOn() {
        this.lightsOn = true;
    }

    public void turnLightsOff() {
        this.lightsOn = false;
    }


}

