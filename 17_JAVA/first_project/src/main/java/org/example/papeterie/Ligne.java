package org.example.papeterie;

public class Ligne {
    private ArticleUnitaire articleUnitaire;
    private int quantite;

    public Ligne(ArticleUnitaire articleUnitaire, int quantite) {
        this.articleUnitaire = articleUnitaire;
        this.quantite = quantite;
    }

    public int getQuantite() {
        return quantite;
    }

    public ArticleUnitaire getArticleUnitaire() {
        return articleUnitaire;
    }

    public void afficheLigne() {
        if (articleUnitaire != null) {
            double prixTotal = quantite * articleUnitaire.getPrix();
            System.out.println("Quantité: " + quantite +
                    " - Référence de l'article: " + articleUnitaire.getUniqueRef() +
                    " - Nom de l'article: " + articleUnitaire.getName() +
                    " - Prix unitaire: " + articleUnitaire.getPrix() +
                    " - Prix total: " + prixTotal);
        } else {
            System.out.println("Erreur.");
        }
    }
}

