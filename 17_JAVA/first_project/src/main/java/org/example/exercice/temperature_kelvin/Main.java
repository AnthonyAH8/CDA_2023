package org.example.exercice.temperature_kelvin;
import java.util.Scanner;

enum Level {
    CELSIUS,
    FAHRENHEIT,
    KELVIN
}

public class Main {
    public static void main(String[] args) {
//        Level temperatureCelsius = Level.CELSIUS;
//        System.out.println(temperatureCelsius);
//        Level temperatureFahrenheit = Level.FAHRENHEIT;
//        System.out.println(temperatureFahrenheit);
//        Level temperatureKelvin = Level.KELVIN;
//        System.out.println(temperatureKelvin);

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 pour Celcius au Fahrenheit\\n2 pour Celcius au Kelvin\\n\"\n" +
                "        + \"3 pour Fahrenheit au Celcius\\n4 pour Fahrenheit au Kelvin\\n\"\n" +
                "        + \"5 for Kelvin au Celcius\\n6 pour Kelvin au Fahrenheit\\n7.");
        do {
            System.out.println("Entrez une température");
            int convert = scanner.nextInt();
            int numberCase = 0;
            switch (convert){
                case 1:
                    numberCase = "Celsius";

            }
        }while(true);



    }
}
