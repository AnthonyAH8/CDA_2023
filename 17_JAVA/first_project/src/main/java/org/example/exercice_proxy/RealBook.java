package org.example.exercice_proxy;

public class RealBook implements Book {
    private String title;
    private String contentBook;

    public RealBook(String title, String contentBook) {
        this.title = title;
        this.contentBook = contentBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentBook() {
        return contentBook;
    }

    public void setContentBook(String contentBook) {
        this.contentBook = contentBook;
    }

    @Override
    public void readBook() {
        System.out.println("Titre du livre : " + title);
        System.out.println("Contenu : " + contentBook);
    }

    @Override
    public void readBook(String content) {
        System.out.println(title + " " + content);
    }
}
