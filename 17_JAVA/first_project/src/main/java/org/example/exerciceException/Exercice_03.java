package org.example.exerciceException;

public class Exercice_03 {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};

        try {
            int valeur = tableau[5];
            System.out.println("La valeur est : " + valeur);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : Tentative d'accès en dehors des limites du tableau.");
        }
    }
}
