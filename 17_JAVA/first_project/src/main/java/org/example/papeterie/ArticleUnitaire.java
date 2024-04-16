package org.example.papeterie;

public class ArticleUnitaire extends Article{
    private static int uniqueRef;
    private String name;
    private double prix;

    public String getName() {
        return name;
    }

    public double getPrix() {
        return prix;
    }

    public ArticleUnitaire(String name, double prix) {
        super(uniqueRef);
        this.name = name;
        this.prix = prix;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

}
