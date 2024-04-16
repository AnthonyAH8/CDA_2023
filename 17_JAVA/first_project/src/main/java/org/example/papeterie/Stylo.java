package org.example.papeterie;

public class Stylo extends Article{
    private String couleur;
    private Article article;

    public Stylo(int uniqueRef, String couleur, Article article) {
        super(uniqueRef);
        this.couleur = couleur;
        this.article = article;
    }

    public String getCouleur() {
        return couleur;
    }

}
