package org.example.exercice_voiture_jee;

public class Car {

    private int id;

    private String marque;

    private int manufacturedAt;

    private String color;

    public Car() {
    }

    public Car(int id, String marque, int manufacturedAt, String color) {
        this.id = id;
        this.marque = marque;
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
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
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
