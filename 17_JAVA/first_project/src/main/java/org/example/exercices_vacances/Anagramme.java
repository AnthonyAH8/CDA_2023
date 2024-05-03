package org.example.exercices_vacances;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un premier mot:");
        String firstWord = scanner.nextLine().toLowerCase();

        System.out.println("Entrez un second mot:");
        String secondWord = scanner.nextLine().toLowerCase();

        if (anagramme(firstWord, secondWord)) {
            System.out.println(firstWord + " et " + secondWord + " sont des anagrammes.");
        } else {
            System.out.println(firstWord + " et " + secondWord + " ne sont pas des anagrammes.");
        }
    }
        public static boolean anagramme(String firstWord, String secondWord){
            char[] charFirstWord = firstWord.toCharArray();
            char[] charSecondWord = secondWord.toCharArray();

            Arrays.sort(charFirstWord);
            Arrays.sort(charSecondWord);

            return Arrays.equals(charFirstWord, charSecondWord);
    }
}
