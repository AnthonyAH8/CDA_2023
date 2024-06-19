package org.example.exercice_voiture_jee;

import java.time.LocalDate;
import java.util.Date;

public class Car {

    private int id;

    private String marque;

    private LocalDate manufacturedAt;

    private String color;

    public Car(int id, String nissan, Date date, String blue){
    }

    public Car(int id, String marque, LocalDate manufacturedAt, String color) {
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

    public LocalDate getManufacturedAt() {
        return manufacturedAt;
    }

    public void setManufacturedAt(LocalDate manufacturedAt) {
        this.manufacturedAt = manufacturedAt;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
