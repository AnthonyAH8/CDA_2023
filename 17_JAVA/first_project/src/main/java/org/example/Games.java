package org.example;

import java.util.Scanner;
import java.util.Random;

public class Games {
    public static void main(String[] args) {

//        1. # Le jeu de Pierre-Papier-Ciseaux
//
//                - Objectif : Jouer contre l'ordinateur à Pierre-Papier-Ciseaux.
//                - Fonctionnement : L’utilisateur et l’ordinateur choisissent chacun pierre, papier, ou ciseaux.
//                Le programme détermine ensuite le gagnant selon les règles classiques du jeu.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//
        System.out.println("Pierre, papier ou ciseaux?");
        String tentative = scanner.nextLine().toLowerCase();
        int computerChoiceNumber = random.nextInt(3);

        String computerChoice = "";

        switch (computerChoiceNumber) {

            case 0:
                computerChoice = "pierre";
                break;
            case 1:
                computerChoice = "papier";
                break;
            case 2:
                computerChoice = "ciseaux";
                break;
            default:
                System.out.println("Mauvaise saisie.");
        }

        System.out.println("Choix de l'ordinateur: " + computerChoice);
        System.out.println("Vous avez choisi: " + tentative);

        if (tentative.equals(computerChoice)) {
            System.out.println("Egalité");
        } else if ((tentative.equals("pierre") && computerChoice.equals("ciseaux")) ||
                (tentative.equals("papier") && computerChoice.equals("pierre")) ||
                (tentative.equals("ciseaux") && computerChoice.equals("papier"))) {
            System.out.println("Vous avez gagné");
        } else {
            System.out.println("Vous avez perdu");
        } 
/*

        3. # Course de voitures simplifiée

                - Objectif : Atteindre l'arrivée avant l'ordinateur en avançant basé sur les résultats d'un dé.
                - Fonctionnement : Chaque tour, l’utilisateur et l’ordinateur "lancent un dé" (génèrent un nombre aléatoire entre 1 et 6).
                Le nombre indique combien de cases ils avancent. Le premier à atteindre une certaine distance gagne

        4. # L'évasion du labyrinthe

                - Objectif : Trouver la sortie d'un labyrinthe simple représenté par du texte.
                - Fonctionnement : Le labyrinthe est représenté par un ensemble de directions possibles à chaque étape (par exemple, gauche, droite, avancer).
                À chaque étape, l’utilisateur choisit une direction. Le jeu se termine lorsque l’utilisateur trouve la sortie.
                Bien que cela puisse sembler nécessiter un tableau, un labyrinthe simple peut être codé dans la logique du programme sans utiliser explicitement de tableau.
*/
    }
}
