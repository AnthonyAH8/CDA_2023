package org.example;

import java.util.Random;
import java.util.Scanner;

public class demo_tableau {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // Random random = new Random();
        // int[] tabEntier = new int[10];
        //
        // tabEntier[0] = 1;
        // System.out.println(tabEntier[0]);
        //
        // tabEntier[0] = 8;
        // System.out.println(tabEntier[0]);
        //
        // for (int i = 0; i < tabEntier.length; i++) {
        // System.out.println(tabEntier[i]);
        // }
        //
        // String[] tabChaine = new String[10];
        // for (int i = 0; i < tabChaine.length; i++) {
        // System.out.println(tabChaine[i]);
        // }

        // # Recherche de Valeur
        //
        // - Créez un tableau pré-rempli de nombres ou de chaînes.
        // L'utilisateur tente de deviner une valeur contenue dans le tableau.
        // Le programme indique si la valeur est présente et, si oui, à quelle position.

        // System.out.println("Recherche de valeur");
        //
        // Integer[] tabNumbers = {1, 2, 3, 4, 5, 6};
        // Integer userChoice;
        // int randomNumber = random.nextInt(tabNumbers.length) + 1;
        // do {
        // System.out.println("Veuillez saisir un chiffre compris entre 1 et 6");
        // userChoice = scanner.nextInt();
        // } while (randomNumber != userChoice);
        //
        // if (randomNumber == userChoice) {
        // System.out.println("Bravo, vous avez trouvé le bon chiffre qui était : " +
        // randomNumber);
        // }

        // -------------------------------------------

        // # Jeu des Paires (Memory)
        //
        // - Implémentez un jeu de mémoire simple où l'utilisateur doit trouver des
        // paires de valeurs identiques dans un tableau.
        // Le tableau est affiché face cachée, et l'utilisateur spécifie les indices des
        // éléments à retourner pour trouver les paires.

        // Integer[] tabNumbers = {1, 1, 3, 4, 5, 3, 5, 2, 2, 3};
        //
        // System.out.println("Rechercher les paires");
        // System.out.println("--------------------------");
        // System.out.println("Saisissez un premier nombre entre 1 et 10:");
        // int userChoice1 = scanner.nextInt();
        // System.out.println("Saisissez un second nombre entre 1 et 10:");
        // int userChoice2 = scanner.nextInt();
        //
        // boolean found = false;
        // int position = -1;
        //
        // for (int i = 0; i < tabNumbers.length - 1; i++) {
        // if ((userChoice1 == tabNumbers[i] && userChoice2 == tabNumbers[i + 1]) ||
        // (userChoice2 == tabNumbers[i] && userChoice1 == tabNumbers[i + 1])) {
        // System.out.println("Bravo, vous avez trouve la paire à la position " +
        // tabNumbers[i] + " et " + tabNumbers[i + 1]);
        // found = true;
        // position = i;
        // break;
        // } else {
        // System.out.println("Erreur");
        // System.out.println("Saisissez un premier nombre entre 1 et 10:");
        // userChoice1 = scanner.nextInt();
        // System.out.println("Saisissez un second nombre entre 1 et 10:");
        // userChoice2 = scanner.nextInt();
        // if (!found && userChoice1 == userChoice2) {
        // System.out.println("Bravo, vous avez trouve la paire à la position " +
        // tabNumbers[i + 1]);
        // break;
        // }
        // }
        // }
        // --------------------------------------------

        // # Simulation de Réservation de Sièges
        //
        // - Simulez un système de réservation de sièges dans un théâtre ou un avion.
        // Les sièges disponibles sont représentés dans un tableau.
        // L'utilisateur peut choisir un siège, et le programme met à jour le tableau
        // pour indiquer que le siège est désormais pris.

        // int totalSeats = 10;
        // Boolean[] seats = new Boolean[totalSeats];
        // for (int i = 0; i < totalSeats; i++) {
        // seats[i] = false;
        // }
        //
        // while (true) {
        // System.out.println("État actuel des sièges:");
        // for (int i = 0; i < totalSeats; i++) {
        // if (seats[i]) {
        // System.out.println("Siège " + (i + 1) + ": Réservé");
        // } else {
        // System.out.println("Siège " + (i + 1) + ": Disponible");
        // }
        // }
        //
        // System.out.println("-----------------------------------------");
        // System.out.println("Veuillez choisir un siège (1-" + totalSeats + ") ou
        // appuyez sur 0 pour quitter: ");
        // int choice = scanner.nextInt();
        //
        // if (choice == 0) {
        // System.out.println("Au revoir !");
        // break;
        // }
        //
        // if (choice < 1 || choice > totalSeats) {
        // System.out.println("Choix invalide. Veuillez choisir un siège entre 1 et " +
        // totalSeats);
        // continue;
        // }
        //
        // if (seats[choice - 1]) {
        // System.out.println("le siège n°" + choice + " est déjà pris.");
        // } else {
        //
        // seats[choice - 1] = true;
        // System.out.println("Le siège " + choice + " est réservé.");
        // }
        // }

        // # Bataille navale
        //
        // - Jouer une version simplifiée du jeu de bataille navale.
        // - Concepts utilisés : Tableaux pour représenter la grille, boucles,
        // conditions.
        // - Fonctionnement : Utilise un tableau pour créer une grille où l'utilisateur
        // et l'ordinateur placent leurs navires.
        // Ensuite, à tour de rôle, ils essaient de deviner la position des navires
        // adverses. Le premier à couler tous les navires adverses gagne.

        // Scanner scanner = new Scanner(System.in);
        // Random random = new Random();

        // boolean[][] battleships = new boolean[4][4];
        // int cases = 16;

        // int SHIPS = 3;
        // int shipsLength = 3;

        // while (true) {
        // System.out.println("Colonne : ");
        // int colonne = scanner.nextInt();
        // System.out.println("Ligne : ");
        // int ligne = scanner.nextInt();
        // if (!battleships[colonne - 1][ligne - 1]) {
        // cases--;
        // battleships[colonne - 1][ligne - 1] = true;
        // System.out.println("Touché");
        // } else {
        // System.out.println("Raté");
        // }

        // for (int i = 0; i < battleships.length; i++) {
        // for (int j = 0; j < battleships[i].length; j++) {
        // if (battleships[i][j]) {
        // System.out.print("X");
        // } else {
        // System.out.print("0");
        // }
        // }
        // System.out.println(); // Print a newline after each row
        // }
        // System.out.println("A vous de jouer");
        // }

        int battleGrid = 5;
        int ships = 3;
        char cases = '-';
        char ship = 'O';
        char hit = 'X';

        char[][] playerGrid = new char[battleGrid][battleGrid];
        char[][] computerGrid = new char[battleGrid][battleGrid];

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < battleGrid; i++) {
            for (int j = 0; j < battleGrid; j++) {
                playerGrid[i][j] = cases;
                computerGrid[i][j] = cases;
            }
        }

        System.out.println("Placez vos bateaux:");
        for (int i = 0; i < ships; i++) {
            System.out.print("Ligne pour le navire " + (i + 1) + " : ");
            int ligne = scanner.nextInt();
            System.out.print("Colonne pour le navire " + (i + 1) + " : ");
            int colonne = scanner.nextInt();
            playerGrid[ligne][colonne] = ship;
        }

        System.out.println("Placement des navires de l'ordinateur :");
        for (int i = 0; i < ships; i++) {
            int row = random.nextInt(battleGrid);
            int col = random.nextInt(battleGrid);
            computerGrid[row][col] = ship;
        }

        // Boucle principale du jeu
        while (true) {
            // Tour du joueur
            System.out.println("\nGrille de l'ordinateur :");
            displayGrid(computerGrid);
            System.out.println("À votre tour :");
            System.out.print("Ligne : ");
            int row = scanner.nextInt();
            System.out.print("Colonne : ");
            int col = scanner.nextInt();
            if (computerGrid[row][col] == ship) {
                System.out.println("Touché !");
                computerGrid[row][col] = hit;
            } else {
                System.out.println("À l'eau !");
            }

            if (allShipsSunk(computerGrid)) {
                System.out.println("Félicitations ! Vous avez coulé tous les navires ennemis. Vous avez gagné !");
                displayGrid(computerGrid);
                break;
            }

            System.out.println("\nTour de l'ordinateur :");
            int compRow = random.nextInt(battleGrid);
            int compCol = random.nextInt(battleGrid);
            if (playerGrid[compRow][compCol] == ship) {
                System.out.println("L'ordinateur a touché l'un de vos navires !");
                playerGrid[compRow][compCol] = hit;
            } else {
                System.out.println("L'ordinateur a tiré à l'eau.");
            }

            // Vérification de la victoire de l'ordinateur
            if (allShipsSunk(playerGrid)) {
                System.out.println("L'ordinateur a coulé tous vos navires. Vous avez perdu !");
                break;
            }
        }

    }

    // Affichage de la grille
    public static void displayGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Vérification si tous les navires sont coulés
    public static boolean allShipsSunk(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 'O') {
                    return false;
                }
            }
        }
        return true;
    }
}
