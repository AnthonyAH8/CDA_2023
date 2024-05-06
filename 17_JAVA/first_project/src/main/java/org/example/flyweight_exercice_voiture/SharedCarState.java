package org.example.flyweight_exercice_voiture;

public class SharedCarState implements VehicleFlyWeight{

    private String color;
    private String model;
    private String year;

    public SharedCarState(String color, String model, String year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    @Override
    public void vehiclesInfos(String vehicleType) {
        System.out.println(vehicleType);
        System.out.println(color);
        System.out.println(model);
        System.out.println(year);
    }

}
