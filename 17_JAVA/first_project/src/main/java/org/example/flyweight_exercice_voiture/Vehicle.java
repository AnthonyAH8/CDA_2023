package org.example.flyweight_exercice_voiture;

public class Vehicle {
    private String color;
    private String model;
    private String year;
    private VehicleFlyWeight vehicleFlyWeight;

    public Vehicle(String color, String model, String year, VehicleFlyWeight vehicleFlyWeight) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.vehicleFlyWeight = vehicleFlyWeight;
    }

    public void display(){
        this.vehicleFlyWeight.vehiclesInfos(color);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' + "}"
                ;
    }
}
