package org.example.exercice_proxy;

public abstract class SecuredBookProxy implements Book {

    private RealBook realBook;

    public SecuredBookProxy(String title, String content) {
        this.realBook = new RealBook("title", "content");
    }

    @Override
    public void readBook(String content) {
        realBook.readBook(content);
    }
}
