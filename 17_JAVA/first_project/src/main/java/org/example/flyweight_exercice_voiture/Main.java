package org.example.flyweight_exercice_voiture;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Vehicle vehicle = new Vehicle("blue", "3008", "2018", carFactory.getcarWeight("blue", "Tesla", "2021"));
        System.out.println(vehicle);

        Vehicle vehicle2 = new Vehicle("red", "tesla", "2022", carFactory.getcarWeight("blue", "Tesla", "2021"));
        System.out.println(vehicle2);
    }
}
