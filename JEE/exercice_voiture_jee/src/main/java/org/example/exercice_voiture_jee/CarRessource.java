package org.example.exercice_voiture_jee;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Path("/cars")
public class CarRessource {
    @GET
    @Path("/one")
    @Produces(MediaType.APPLICATION_JSON)
    public Car getFirstCar() {
        return new Car(1, "Nissan", new Date(2020, 10, 10), "blue");
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> carList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(2, "Nissan", new Date(2020, 10, 10), "red"));
        return cars;
    }
}
