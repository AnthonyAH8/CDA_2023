package org.example.builder;

public class Main {
    public static void main(String[] args) {
        Voiture voiture1 = new Voiture.VoitureBuilder().marque("Renault").build();
        System.out.println(voiture1);
        Voiture voiture2 = new Voiture.VoitureBuilder().marque("Peugeot").modele("Mégane").build();
        System.out.println(voiture2);
        Voiture voiture3 = new Voiture.VoitureBuilder().marque("Peugeot").modele("Mégane").annee(2020).build();
        System.out.println(voiture3);
    }
}
