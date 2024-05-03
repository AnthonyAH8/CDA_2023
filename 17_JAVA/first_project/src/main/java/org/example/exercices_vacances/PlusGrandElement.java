package org.example.exercices_vacances;

import java.util.Scanner;

public class PlusGrandElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la taille du tableau: ");
        int taille = scanner.nextInt();

        int[] tableau = new int[taille];

        System.out.println("Entrez les éléments du tableau: ");
        for (int i = 0; i < taille; i++) {
            tableau[i] = scanner.nextInt();
        }
        int plusGrand = plusGrandNombre(tableau);

        System.out.println("Le plus grand élement du tableau est " + plusGrand);
    }
    public static int plusGrandNombre(int[] tableau){
        if (tableau.length == 0) {
            System.out.println("Erreur");
        }

        int maxNombre = tableau[0];

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > maxNombre) {
                maxNombre = tableau[i];
            }
        }
        return maxNombre;
    }
}
