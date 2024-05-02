package org.example.exercice_strategy_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaxSystem taxSystem = new TaxSystem();

        while (true){
            System.out.println("=== Sélection de la stratégie fiscale ===");
            System.out.println("1. IFR - Impôt Forfaitaire sur le Revenu");
            System.out.println("2. IRP - Impôt sur le Revenu Progressif");
            System.out.println("3. TVA - Taxe sur la Valeur Ajoutée");
            System.out.println("0. Quitter");


            System.out.print("Votre choix : ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 :
                taxSystem.setStrategy(new ifr());
                System.out.println("Veuillez entrer un montant : ");
                double incomeIFR = scanner.nextDouble();
                taxSystem.taxNavigation(incomeIFR);
                break;

                case 2:
                taxSystem.setStrategy(new irp());
                System.out.println("Veuillez entrer un montant : ");
                double incomeIRP = scanner.nextDouble();
                taxSystem.taxNavigation(incomeIRP);
                break;

                case 3:
                taxSystem.setStrategy(new tva());
                    System.out.println("Veuillez entrer un montant : ");
                double doubleTVA = scanner.nextInt();
                taxSystem.taxNavigation(doubleTVA);
                break;

                case 0:
                    System.out.println("Au revoir");
                    scanner.close();

                default:
                    System.out.println("Mauvaise saisie");
            }
        }
    }
}