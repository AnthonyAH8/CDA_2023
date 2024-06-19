package org.example.exercice_voiture_crud.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.exercice_voiture_crud.model.Car;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CarService {

    private List<Car> carList = new ArrayList<>();

    public Car getCarById(int id) {
        return updateCar(getCarById(id));
    }

    public Car save(int id, String marque, int manufacturedAt, String color) {
        return (Car) carList;
    }

    public Car updateCar(Car updatedCar) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getId() == updatedCar.getId()) {
                carList.set(i, updatedCar);
                return updatedCar;
            }
        }
        return updatedCar;
    }

    public boolean deleteCar(int id){
        return carList.removeIf(car -> car.getId() == id);
    }
}
