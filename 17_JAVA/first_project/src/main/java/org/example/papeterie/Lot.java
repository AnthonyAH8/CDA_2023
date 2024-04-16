package org.example.papeterie;

public class Lot extends Article{

    private int quantity;
    private double pourcentage;
    private Article article;

    public Lot(int uniqueRef, int quantity, double pourcentage) {
        super(uniqueRef);
        this.quantity = quantity;
        this.pourcentage = pourcentage;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public Article getArticle() {
        return article;
    }
}
