package org.example.exercice_voiture_jee;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/cars")
@Produces(MediaType.APPLICATION_JSON)
public class CarResource {
    @GET
    @Path("/one")
    public Car getFirstCar() {
        return new Car(1, "Nissan", 2020, "blue");
    }

    @GET
    public List<Car> getAllCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(2, "Nissan", 2012, "red"));
        carList.add(new Car(3, "Subaru", 2004, "blue, yellow"));
        return carList;
    }
}
