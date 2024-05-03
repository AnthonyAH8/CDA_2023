package org.example.exercices_vacances;

import java.util.Scanner;

public class SommeTableau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la taille du tableau :");

        int taille = scanner.nextInt();

        int[] tableau = new int[taille];

        System.out.println("Entrez les nombres à mettre dans le tableau :");

        for (int index = 0; index < taille; index++) {
            tableau[index] = scanner.nextInt();
        }

        int somme = calculerSomme(tableau);
        System.out.println("La somme est " + somme + ".");
    }

    public static int calculerSomme(int[] tableau){
        int somme = 0;
        for (int e : tableau) {
            somme += e;
        }
        return somme;
    }
}
