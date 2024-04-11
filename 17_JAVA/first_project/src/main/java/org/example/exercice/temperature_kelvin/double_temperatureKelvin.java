package org.example.exercice.temperature_kelvin;

public class double_temperatureKelvin {

    private double celsius;
    private double kelvin;
    private double fahrenheit;

    public double_temperatureKelvin (double celsius, double kelvin, double fahrenheit) {
        this.celsius = celsius;
        this.kelvin = kelvin;
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getKelvin() {
        return kelvin;
    }

    public double getFahrenheit() {

        return fahrenheit;
    }

    public void setCelsius(double celsius) {

        this.celsius = celsius;
    }

    public void setKelvin(double kelvin) {

        this.kelvin = kelvin;
    }

    public void setFahrenheit(double fahrenheit) {

        this.fahrenheit = fahrenheit;
    }
}
