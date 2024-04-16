package org.example.papeterie;

public class Main {
    public static void main(String[] args) {

        ArticleUnitaire articleUnitaire = new ArticleUnitaire("REF1", 10.0);
        Ligne ligne = new Ligne(articleUnitaire,5);

        ligne.afficheLigne();
    }
}