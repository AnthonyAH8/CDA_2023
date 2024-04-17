package org.example;

import java.util.Arrays;
import java.util.List;

public class demoStream {
    public static void main(String[] args) {

        // Création d'une liste de prénoms
        List<String> prenoms = Arrays.asList(
                "Alice", "Bob", "Caroline", "David", "Anna", "Catherine");
        // Filtrer pour ne garder que les prénoms commençant par "A"
        List<String> prenomsCommencantParA = prenoms.stream()
                .filter(prenom -> prenom.startsWith("A"))
                .toList();

        // Compter les prénoms contenant un "C"
        long countWithC = prenoms.stream()
                .filter(prenom -> prenom.contains("C") || prenom.contains("c"))
                .count();

        List <String> withC = prenoms.stream()
                .filter(prenom -> prenom.contains("C") || prenom.contains("c"))
                .toList();

        System.out.println("Prénoms commençant par 'A': "
                + prenomsCommencantParA);
        System.out.println("Nombre de personnes dont le prénom contient un 'C': "
                + countWithC);
        System.out.println("Nombre de personnes dont le prénom contient un 'C': "
                + withC);
    }
}