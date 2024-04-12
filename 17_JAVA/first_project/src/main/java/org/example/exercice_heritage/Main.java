package org.example.exercice_heritage;

public class Main {
    public static void main(String[] args) {

        Plante plante1 = new Plante("Tournesol", 0.5, "Vert");

        System.out.println(plante1);

        System.out.println("----------------------------");

        Arbre arbre1 = new Arbre("Peuplier", 8, "Marron et Vert", 50);

        System.out.println(arbre1);
    }
}
