package org.example.tp_global_1;

public class Main {
    public static void main(String[] args) {

        CarFactory electricCarFactory = new ElectricCarFactory();
        CarFactory thermicCarFactory = new ThermicCarFactory();
        CarFactory allTerrainCarFactory = new AllTerrainCarFactory();

        ElectricCarFactory car1 = electricCarFactory.createCar("Car 1");
        System.out.println(car1);
        ThermicCarFactory car2 = thermicCarFactory.createCar("Car 2");
        System.out.println(car2);
        AllTerrainCarFactory car3 = allTerrainCarFactory.createCar("Car 3");
        System.out.println(car3);
    }
}
