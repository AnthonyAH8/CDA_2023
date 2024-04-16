package org.example.Collections;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Vector:
        Vector<String> vector = new Vector<>();

        vector.add("Pomme");
        vector.add("Orange");
        vector.add("Poire");

        System.out.println("Vector: " + vector);

//        Méthodes possibles pour le vector

        System.out.println("Taille du vector: " + vector.size());
        System.out.println("Element à l'index 1: " + vector.get(1));
        System.out.println("Est-ce que Pomme est présent? " + vector.contains("Pomme"));



//        SortedSet (Tree Set)
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Java");
        sortedSet.add("Python");
        sortedSet.add("C++");
        System.out.println("\nSortedSet: " + sortedSet);

//        Méthodes pour SortedSet

        System.out.println("1. Premier élément :" + sortedSet.first());
        System.out.println("2. Dernier élément :" + sortedSet.last());

        SortedSet<String> headSet = sortedSet.headSet("Python");
        System.out.println("Sous ensemble avant Python : " + headSet);

//        LinkedList

        LinkedList<Double> linkedList= new LinkedList<>();
        linkedList.add(3.14);
        linkedList.add(3.14);
        linkedList.add(20.0);
        System.out.println("\nLinkedlist :" + linkedList);

//        Méthodes pour LinkedList

        System.out.println("1. Premier élément : " + linkedList.getFirst());
        System.out.println("2. Dernier élément : " + linkedList.getLast());

        linkedList.removeFirst();
        System.out.println("\nSuppression du premier élément : " + linkedList);
        linkedList.removeLast();
        System.out.println("\nSuppression du dernier élément : " + linkedList);

//        TreeMap

        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Java", 20);
        sortedMap.put("Python", 10);
        sortedMap.put("C++", 15);
        System.out.println("\nSortedMap : " + sortedMap);
        System.out.println("1. Clés de SortedMap : " + sortedMap.keySet());
        System.out.println("2. Valeurs de SortedMap : " + sortedMap.values());
        System.out.println("3. Supprimer l'entrée avec la clé 'Python' :" + sortedMap.remove("Python"));
        System.out.println("Nouvelle SortedMap : " + sortedMap);

        // HashMap
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Java",20);
        hashMap.put("Python",10);
        hashMap.put("C++",30);
        System.out.println("\nHashMap : "+ hashMap);

        // Méthodes pour hashmap

        System.out.println("1. Taille du Hashmap : " + hashMap.size());
        System.out.println("2. Valeur associé à 'Java' : " + hashMap.get("Java"));
        System.out.println("3. Est ce que 'Test' est présent ? : " + hashMap.containsKey("Test"));
        System.out.println("4. Suppression de l'entréé avec la clé Python : ");
        hashMap.remove("Python");
        System.out.println(" Nouveau HashMap : "+ hashMap);

    }
}
