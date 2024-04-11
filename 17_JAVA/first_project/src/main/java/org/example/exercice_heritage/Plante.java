package org.example.exercice_heritage;

public class Plante {

    private String name;
    private double height;
    private String color;

    public Plante(String name, double height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void informations() {
        System.out.println("Nom de la plante : " + name);
        System.out.println("Hauteur de la plante : " + height + " m");
        System.out.println("Couleur des feuilles : " + color);
    }
}
