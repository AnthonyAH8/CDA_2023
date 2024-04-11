package org.example.exercice.temperature_kelvin;
import java.util.Scanner;

enum uniteTemperature{
    CELSIUS,
    FAHRENHEIT,
    KELVIN,
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une température en Kelvin:");
        double temperatureKelvin = scanner.nextDouble();

        if (temperatureKelvin < 0){
            System.out.println("Impossible d'aller en dessous du 0 absolu");
            return;
        }

        System.out.println("Choisissez une unité de mesure");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        int choice = scanner.nextInt();

        uniteTemperature unite;
        switch (choice) {
            case 1:
                unite = uniteTemperature.CELSIUS;
                break;
            case 2:
                unite = uniteTemperature.FAHRENHEIT;
                break;
            case 3:
                unite = uniteTemperature.KELVIN;
                break;
            default:
                System.out.println("Choix invalide.");
                return;
        }

        double convertedTemperature;
        switch (unite) {
            case CELSIUS:
                convertedTemperature = temperatureKelvin - 273.15;
                System.out.println("La température en Celsius est de " + convertedTemperature + " °C");
                break;
            case FAHRENHEIT:
                convertedTemperature = (temperatureKelvin - 273.15) * 9/5 + 32;
                System.out.println("La température en Fahrenheit est de " + convertedTemperature + " F");
                break;
            case KELVIN:
                convertedTemperature = temperatureKelvin;
                System.out.println("La température en Kelvin est de " + convertedTemperature + " K");
                break;
            default:
                break;
        }
    }
}
