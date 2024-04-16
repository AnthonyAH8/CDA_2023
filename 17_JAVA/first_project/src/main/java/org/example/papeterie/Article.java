package org.example.papeterie;

public class Article {
    private int uniqueRef;
    public Article(int uniqueRef) {

        this.uniqueRef = uniqueRef;
    }

    public int getUniqueRef() {
        return uniqueRef;
    }

    public void setUniqueRef(int uniqueRef) {
        this.uniqueRef = uniqueRef;
    }
}
