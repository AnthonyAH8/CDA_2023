package org.example.restaurationFactory;

public class Main {
    public static void main(String[] args) {
        ItalianCuisineFactory plat1 = new ItalianCuisineFactory();
        System.out.println(plat1);

        MexicanCuisineFactory plat2 = new MexicanCuisineFactory();
        System.out.println(plat2);

        JapaneseCuisineFactory plat3 = new JapaneseCuisineFactory();
        System.out.println(plat3);

    }
}
