package org.example.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> prenoms = new ArrayList<>();

        prenoms.add("Toto");
        prenoms.add("Tata");
        prenoms.add("Jean-Kévin");
        prenoms.add("Hervé");

        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(3));
        System.out.println(prenoms.get(2));

        prenoms.set(0, "Titi");

        System.out.println(prenoms);

        System.out.println("Longueur liste : " + prenoms.size());

        System.out.println("-----------------");

        prenoms.remove(0);

        for (String prenom : prenoms){
            System.out.println(prenom);
        }

        System.out.println("-----------------");

        for(int i = 0; i < prenoms.size(); i++) {
            System.out.println(prenoms.get(i));
        }
    }
}
