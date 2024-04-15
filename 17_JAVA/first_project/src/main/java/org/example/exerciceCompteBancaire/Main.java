package org.example.exerciceCompteBancaire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean quitter = false;

        while(!quitter) {
            System.out.println("=====Menu principal=====");
            System.out.println("1.Lister les comptes bancaires");
            System.out.println("2.Créer un compte bancaire");
            System.out.println("3.Effectuer un dépôt");
            System.out.println("4.Effectuer un retrait");
            System.out.println("5.Afficher les opérations et le solde");
            System.out.println("0.Quitter le programme");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Solde actuel: " + CompteBancaire.solde());
                    break;
                case 2:
                    System.out.println("Entrez le montant à déposer:");
                    double montantDepot = scanner.nextDouble();
                    CompteBancaire.deposer(montantDepot);
                    System.out.println("Dépôt effectué avec succès.");
                    break;
                case 3:
                    System.out.println("Entrez le montant à retirer:");
                    double montantRetrait = scanner.nextDouble();
                    CompteBancaire.retirer(montantRetrait);
                    break;
            }
        }
    }
}
