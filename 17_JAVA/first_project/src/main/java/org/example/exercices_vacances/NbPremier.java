package org.example.exercices_vacances;

import java.util.Scanner;

public class NbPremier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre entier positif : ");

        int nombreLimite = scanner.nextInt();

        System.out.println("Les nombres premiers positifs jusqu'à " + nombreLimite + " sont"); nombrePremierListe(nombreLimite);
    }

    public static boolean estNombrePremier(int nombre){
        if (nombre <= 1) {
            System.out.println("Veuillez entrer un nombre positif");
            System.out.println("Entrez un nombre entier positif : ");
        }
        for (int i = 2; i < Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void nombrePremierListe(int nombreLimite){
        for (int i = 2; i < nombreLimite; i++) {
            if (estNombrePremier(i)) {
                System.out.println(i + " ");
            }
        }
    }
}
