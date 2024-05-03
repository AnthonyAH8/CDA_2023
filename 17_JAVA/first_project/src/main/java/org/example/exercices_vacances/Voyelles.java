package org.example.exercices_vacances;

import java.util.Scanner;

public class Voyelles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une phrase: ");

        String chaine = scanner.nextLine();

        int voyellesCount = nombreVoyelles(chaine);

        System.out.println("Le nombre de voyelles dans la phrase est " + voyellesCount + ".");
    }
    public static int nombreVoyelles(String chaine){
        int voyellesCount = 0;

        for (int i = 0; i < chaine.length(); i++) {
            char caractere = Character.toLowerCase(chaine.charAt(i));
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' || caractere == 'y') {
                voyellesCount++;
            }
        }
        return voyellesCount;
    }
}
