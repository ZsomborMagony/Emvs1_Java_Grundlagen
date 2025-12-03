public class Temperatur {

    public double temperatur;

    public void printCelsius() {

        System.out.println(temperatur + "° Celsius");
    }

    public Temperatur(double temperatur) {

        this.temperatur = temperatur;
    }

    public void printHotOrColdCelsius() {
        if (temperatur <= 24) {
            System.out.println("It's freezing: " + temperatur + "° Celsius");
        } else {
            System.out.println("It's hot: " + temperatur + "° Celsius");
        }
    }

    public void calculateCelsiusToFahrenheit() {
        System.out.println(temperatur * 9/5 +32 + "F");
    }

    public void calculateCelsiusToKelvin() {
        System.out.println(temperatur + 273.15 + "K");
    }

    public void convertCelsiusToFahrenheit(double temperatur) {
        System.out.println(temperatur * 9/5 +32 + "F");
    }


}
