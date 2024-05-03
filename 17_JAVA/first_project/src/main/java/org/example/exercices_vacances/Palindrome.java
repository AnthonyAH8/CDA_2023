package org.example.exercices_vacances;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un mot:");

        String chaine = scanner.nextLine();

        if (estPalindrome(chaine)) {
            System.out.println(chaine + " est un palindrome.");
        } else {
            System.out.println(chaine + " n'est pas un palindrome.");
        }
    }
    public static boolean estPalindrome(String chaine){
        chaine = chaine.toLowerCase();
        int longueur = chaine.length();
        for (int i = 0; i < longueur/2 ; i++) {
            if (chaine.charAt(i) != chaine.charAt(longueur - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
