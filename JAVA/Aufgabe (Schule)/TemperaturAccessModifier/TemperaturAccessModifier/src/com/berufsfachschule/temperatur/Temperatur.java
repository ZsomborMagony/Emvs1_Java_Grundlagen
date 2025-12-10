package com.berufsfachschule.temperatur;

public class Temperatur {
        private float tempInCelsius;

        public Temperatur(float tempInCelsius) {
            this.tempInCelsius = tempInCelsius;
        }

        public String printCelsius() {
            return (tempInCelsius + "°C");
        }

        public String getCelsiusToFahrenheit() {
            return (tempInCelsius *9/5 + 32 + "F");
        }
        public String getCelsiusToKelvin() {
            return (tempInCelsius + 273.15 + "K");
        }

        public float getCelsius() {
            return (tempInCelsius);
        }

        public float setCelsius() {
            return (this.tempInCelsius = tempInCelsius);
        }
}
