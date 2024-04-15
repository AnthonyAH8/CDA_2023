package org.example.exerciceCompteBancaire;

import java.util.List;

public class ComptePayant extends CompteBancaire {

    private final double interet;

    public ComptePayant(double solde, String nom, List<String> listeOperations, double interet) {
        super(solde, nom, listeOperations);
        this.interet = interet;
    }

    public void ajouterInteret() {
        double nouveauSolde = getSolde() * (1 + interet);
        setSolde(nouveauSolde);
    }

    @Override
    public String toString() {
        return "ComptePayant{" +
                "interet=" + interet +
                ", solde=" + getSolde() +
                '}';
    }
}