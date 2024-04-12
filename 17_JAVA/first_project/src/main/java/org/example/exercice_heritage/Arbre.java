package org.example.exercice_heritage;

public class Arbre extends Plante {

    private double circonference;

    public Arbre(String name, double height, String color, double circonference) {
        super(name, height, color);
        this.circonference = circonference;
    }

    public double getCirconference() {
        return circonference;
    }

    public void setCirconference(double circonference) {
        this.circonference = circonference;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCirconférence : " + circonference + " m";
    }
}
