package org.example.exerciceCompteBancaire;

import java.util.List;

public abstract class CompteBancaire {

    public static double solde;
    private String nom;
    private List<String> listeOperations;

    public CompteBancaire(double solde, String nom, List<String> listeOperations) {
        this.solde = solde;
        this.nom = nom;
        this.listeOperations = listeOperations;
    }

    public static void deposer(double montant) {
        double nouveauSolde = solde + montant;
        solde(nouveauSolde);
    }

    public static void retirer(double montant) {
        if (montant <= solde) {
            double nouveauSolde = solde - montant;
            getSolde(nouveauSolde);
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        }
    }

    public double getSolde() {
        return solde;
    }

    public String getNom() {
        return nom;
    }

    public List<String> getListeOperations() {
        return listeOperations;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setListeOperations(List<String> listeOperations) {
        this.listeOperations = listeOperations;
    }
}
