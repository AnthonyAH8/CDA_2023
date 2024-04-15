package org.example.exerciceCompteBancaire;

import java.util.List;

public class CompteCourant extends CompteBancaire{
    public CompteCourant(double solde, String nom, List<String> listeOperations) {
        super(solde, nom, listeOperations);
    }
}
