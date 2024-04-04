package org.example;

import java.util.Random;
import java.util.Scanner;


public class jeu_du_pendu {
    public static void main(String[] args) {
//        2. # Le jeu du pendu simplifié
//
//                - Objectif : Deviner un mot lettre par lettre.
//                - Fonctionnement : Le jeu choisit un mot. L’utilisateur tente de deviner les lettres du mot une par une.
//                Le jeu se termine si l’utilisateur trouve toutes les lettres du mot ou si un certain nombre d’essais est dépassé

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String userChoice = "";
        String computerWord = "voiture";
        String computerWord2 = "code";
        String computerWord3 = "bureau";
        String computerWord4 = "tableau";
        int tries = 10;

        System.out.println("*******************");
        System.out.println("   Jeu du pendu    ");
        System.out.println("*******************");

        while (tries > 0) {
            System.out.println("Veuillez saisir une lettre :");
            String tentative = scanner.nextLine().toLowerCase();

            if (computerWord.contains(tentative)) {
                System.out.println("La lettre se trouve dans le mot");
            } else {
                System.out.println("La lettre ne se trouve pas dans le mot");
                tries--;
                System.out.println(tries + " tentatives restantes.");
                continue;
            }
            userChoice += tentative;

            if (userChoice.equals(computerWord)) {
                System.out.println("Vous avez gagné");
                System.out.println("Le mot à deviner était " + computerWord);
                return;
            }
        }

        if (tries == 0) {
            System.out.println("Vous avez perdu");
            System.out.println("Le mot à deviner était : " + computerWord);
        }
    }
}