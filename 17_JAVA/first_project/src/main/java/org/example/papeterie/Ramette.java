package org.example.papeterie;

public class Ramette extends ArticleUnitaire{
    private double grammage;
    private Article article;

    public Ramette(int uniqueRef, String name, double prix, double grammage, Article article) {
        super(name, prix);
        this.grammage = grammage;
        this.article = article;
    }

    public double getGrammage() {
        return grammage;
    }

    public void setGrammage(double grammage) {

        this.grammage = grammage;
    }

    @Override
    public double getPrix() {
        return 0.12 * grammage;
    }
}
