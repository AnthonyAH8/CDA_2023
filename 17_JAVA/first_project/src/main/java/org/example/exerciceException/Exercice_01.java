package org.example.exerciceException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercice_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean conversion = false;

        while (!conversion) {
            System.out.println("Veuillez saisir un nombre entier:");
            try {
                int nombre = scanner.nextInt();
                System.out.println(nombre + " est bien un nombre entier.");
                conversion = true;
            } catch (InputMismatchException e) {
                System.out.println("Erreur: Veuillez saisir un nombre valide.");
                scanner.nextLine();
            }
        }
    }
}
