package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class demoOptional {
        public static void main(String[] args) {
            List<String> list = Arrays.asList("apple", "banana", "cherry");
            // Recherche d'un élément dans la liste
            Optional<String> result = list.stream()
                    .filter(s -> s.startsWith("a"))
                    // Filtre pour les éléments commençant par "a"
                    .findFirst(); // Récupère le premier élément correspondant
            // Vérification de la présence de l'élément
            if (result.isPresent()) {
                System.out.println("Premier élément commençant par 'a': " + result.get());
            }
            else {
                System.out.println("Aucun élément commençant par 'a' trouvé.");
            }
        }
    }
