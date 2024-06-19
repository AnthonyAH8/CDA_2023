package org.example.exercice_voiture_crud.model;

public class Car {
    private int id;

    private String brand;

    private int manufacturedAt;

    private String color;

    public Car() {
    }

    public Car(int id, String marque, int manufacturedAt, String color) {
        this.id = id;
        this.brand = marque;
        this.manufacturedAt = manufacturedAt;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return brand;
    }

    public void setMarque(String marque) {
        this.brand = marque;
    }

    public int getManufacturedAt() {
        return manufacturedAt;
    }

    public void setManufacturedAt(int manufacturedAt) {
        this.manufacturedAt = manufacturedAt;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
