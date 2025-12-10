public class Autos {

    public String topspeed = "default_value";
    public String measuring = "km/h";
    public String torque = "default_value";
    public String type = "default-value";
    public String weight;
    public String motorType = "default_value";
    public String brand = "default_value";

    public Autos(String brand) {
        if (brand .equals("lamborghini")) {
            topspeed = "310_km/h";
            torque = "8000_RPM";
            type = "Racecar";
            weight = "1339.005kg";
            motorType = "V10";
        } else if (brand .equals("ferrari")) {
            topspeed = "330_km/h";
            torque = "5500_RPM";
            type = "Racecar";
            weight = "1250.101kg";
            motorType = "Turbocharged V6";
        } else if (brand .equals("porsche")) {
            topspeed = "310.537_km/h";
            torque = "7.943_RPM";
            type = "Racecar";
            weight = "1505.019kg";
            motorType = "4.0 liter flat six Engine";
        } else {
            System.out.println("Invalid Choice");
        }
    }
}
