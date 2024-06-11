package org.example.jee;

public class Person {
    private String prenom;
    private String nom;
    private int age;

    public Person(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {

        return nom;
    }

    public int getAge() {

        return age;
    }
}
