package org.example.flyweight_exercice_voiture;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private Map<String, SharedCarState> carweight = new HashMap<>();
    private String vehicleType;

    public SharedCarState getcarWeight(String color, String model, String year){
        String carKey = color + "|" + model;
        if (!carweight.containsKey(carKey)){
            carweight.put(carKey, new SharedCarState(color, model, year));
        }
        return carweight.get(carKey);
    };

    @Override
    public String toString() {
        return "CarFactory{" +
                "carweight=" + carweight +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
