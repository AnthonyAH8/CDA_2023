package org.example.exercice_voiture_crud.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.exercice_voiture_crud.model.Car;
import org.example.exercice_voiture_crud.service.CarService;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Path("/cars")
@Produces(MediaType.APPLICATION_JSON)
public class CarController {

    private final CarService carService;

    @Inject
    public CarController(CarService carService) {
        this.carService = carService;
    }

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

    @GET
    @Path("/filteredcars")
    public List<Car> getFilteredCars() {
        return getAllCars().stream()
                .filter(c -> c.getId() > 0)
                .collect(Collectors.toList());
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postCar(Car car) {
        Car savedCar = carService.save(car.getId(), car.getMarque(), car.getManufacturedAt(), car.getColor());
        return Response.created(URI.create("/cars/" + savedCar.getId())).entity(savedCar).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response putCar(@PathParam("id") int id, Car updatedCar) {
        Car existingCar = carService.getCarById(id);
        existingCar.setMarque(updatedCar.getMarque());
        existingCar.setManufacturedAt(updatedCar.getManufacturedAt());
        existingCar.setColor(updatedCar.getColor());

        carService.updateCar(existingCar);

        return Response.ok(existingCar).build();
    }


    @DELETE
    @Path("/{id}")
    public Response deleteCar(@PathParam("id") int id) {
        carService.getCarById(id);

        carService.deleteCar(id);
        return Response.ok().build();
    }
}


