package org.example;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class demoStream {
    public static void main(String[] args) {

//        // Création d'une liste de prénoms
//        List<String> prenoms = Arrays.asList(
//                "Alice", "Bob", "Caroline", "David", "Anna", "Catherine");
//        // Filtrer pour ne garder que les prénoms commençant par "A"
//        List<String> prenomsCommencantParA = prenoms.stream()
//                .filter(prenom -> prenom.startsWith("A"))
//                .toList();
//
//        // Compter les prénoms contenant un "C"
//        long countWithC = prenoms.stream()
//                .filter(prenom -> prenom.contains("C") || prenom.contains("c"))
//                .count();
//
//        List <String> withC = prenoms.stream()
//                .filter(prenom -> prenom.contains("C") || prenom.contains("c"))
//                .toList();
//
//        System.out.println("Prénoms commençant par 'A': "
//                + prenomsCommencantParA);
//        System.out.println("Nombre de personnes dont le prénom contient un 'C': "
//                + countWithC);
//        System.out.println("Nombre de personnes dont le prénom contient un 'C': "
//                + withC);

//        System.out.println(" ============== Demo Java ============= ");
//        List <String> names = Arrays.asList("Luke", "Leia", "Han", "Anakin", "Anakin", "Obi-Wan",
//                "Yoda", "Chewbacca", "R2-D2", "C-3PO", "Padmé");
//        System.out.println();
//        System.out.println("Filtre personnage commençant par la lettre A:");
//        names.stream()
//                .filter(p -> p.startsWith("A"))
//                .forEach(System.out::println);
//
//        System.out.println();
//
//        System.out.println("Count :");
//        System.out.println("Le nombre de personnage dont le prénom commence par A :" + names.stream()
//                .filter(p -> p.startsWith("A"))
//                .count());
//
//        System.out.println();
//
//        System.out.println("Distinct : ");
//        names.stream()
//                .distinct()
//                .forEach(System.out::println);
//
//        System.out.println();
//
//        System.out.println("Limit :");
//        names.stream()
//                .limit(4)
//                .forEach(System.out::println);
//
//        System.out.println();
//
//        System.out.println("Sorted :");
//        names.stream()
//                .sorted()
//                .forEach(System.out::println);
//
//        System.out.println();
//
//        System.out.println("Sorted inverse :");
//        names.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);

        // Création d'une liste de personnes

        List <Person> personList = Arrays.asList(
                new Person("Skywalker", "Luke", 32),
                new Person("Skywalker", "Anakin", 44),
                new Person("Solo", "Han", 28),
                new Person("Maître", "Yoda", 74),
                new Person("Skywalker", "Luke", 32)
        );
        System.out.println();
        double totalAge = personList.stream()
                .mapToDouble(p -> p.getAge())
                .sum();
        System.out.println("Age des personnages cumulés : " + totalAge);

        System.out.println();

        Optional<Person> person = personList.stream()
                .filter(p -> p.getAge() >= 40)
                .findFirst();

        if (person.isPresent()){
            System.out.println(person.get().toString());
        }else {
            System.out.println("Aucun personnage de cet age");
        }

        System.out.println();
        System.out.println("============ To Map ==============");

        Map<UUID, String> personMap = personList.stream()
                .collect(Collectors.toMap(p -> UUID.randomUUID(), Person::getNom));
        System.out.println(personMap);

        System.out.println();

        System.out.println("============ mapToDouble & sum =======");

        System.out.println();

        System.out.println("Démo : filter, map, collect");
        System.out.println("Nouvelle connexion");

        List<Person> listmodifiee = personList.stream()
                .filter(p -> p.getAge() > 35)
                .map(p -> {
                    p.setAge(p.getAge()- 20);
                    return p;
                })
                .toList();
        listmodifiee.stream()
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Nouveau tableau");

        Person[] people = personList.stream()
                .filter(p -> p.getAge() > 40)
                .map(p -> {
                    p.setAge(p.getAge() - 20);
                    return p;
                })
                .toArray(Person[]::new);
        Arrays.stream(people).forEach(System.out::println);

        personList.stream().forEach(System.out::println);
    }
}