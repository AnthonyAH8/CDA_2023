package org.example.exerciceCompteBancaire;

public class Client {
    private String nom;
    private String prenom;
    private String identifiant;
    private String listeComptes;

    public Client(String nom, String prenom, String identifiant, String listeComptes) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.listeComptes = listeComptes;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public String getListeComptes() {
        return listeComptes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public void setListeComptes(String listeComptes) {
        this.listeComptes = listeComptes;
    }
}
