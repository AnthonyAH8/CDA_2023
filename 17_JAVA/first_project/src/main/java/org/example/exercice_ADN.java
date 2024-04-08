package org.example;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class exercice_ADN {
        public static boolean chaineADN(String ADN) {
            var regex = "[atcgATCG]+";
            return ADN.matches(regex);
        }

        public static String saisieChaineAdn(String message) {
            Scanner scanner = new Scanner(System.in);
            String chaine = scanner.nextLine().trim().toLowerCase();
            while (!chaineADN(chaine)) {
                System.out.println("Erreur ! " + message);
                String saisie = saisieChaineAdn("Enter an DNA sequence: ");
                System.out.println("Saisie d'une chaine ADN: " + saisie);
            }
            return chaine;
        }

        public static void main(String[] args) {
            System.out.println(chaineADN("agct"));

        }
    }
