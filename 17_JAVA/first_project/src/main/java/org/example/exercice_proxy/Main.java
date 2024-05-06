package org.example.exercice_proxy;

public class Main {
    public static void main(String[] args) {
        RealBook realBook = new RealBook("title", "content");
        realBook.readBook();
    }
}
