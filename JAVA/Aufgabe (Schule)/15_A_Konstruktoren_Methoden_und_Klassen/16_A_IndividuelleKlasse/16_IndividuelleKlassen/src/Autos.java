public class Autos {

    public double topspeed;
    public String measuring = "km/h";
    public double torque;
    public String type = "default-value";
    public String weight;
    public String motorType = "default_value";

    public Autos() {

    }

    public Autos(String brand) {
        if (brand .equals("lamborghini")) {
            topspeed = 310;
            torque = 8000;
            type = "Racecar";
            weight = "1339.005kg";
            motorType = "V10";
        } else if (brand .equals("ferrari")) {
            topspeed = 330;
            torque = 5500;
            type = "Racecar";
            weight = "1250.101kg";
            motorType = "Turbocharged V6";
        } else if (brand .equals("porsche")) {
            topspeed = 310.537;
            torque = 7.943;
            type = "Racecar";
            weight = "1505.019kg";
            motorType = "4.0 liter flat six Engine";
        } else {
            System.out.println("Invalid Choice");
        }
    }



}
