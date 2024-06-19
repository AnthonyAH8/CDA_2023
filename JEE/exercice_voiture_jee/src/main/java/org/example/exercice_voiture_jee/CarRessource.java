package org.example.exercice_voiture_jee;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDate;

@Path("/cars")
public class CarRessource {
    @GET
    @Path("/one")
    @Produces(MediaType.APPLICATION_JSON)
    public Car getFirstCar(){
        return new Car(1, "Nissan", LocalDate.of(2020, 10, 10), "blue");
    }
}
