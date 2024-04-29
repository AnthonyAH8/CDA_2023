package org.example.exerciceException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class racineCarree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try{
                System.out.println("Veuillez saisir un entier positif: ");
                int number = scanner.nextInt();

                if (number < 0) {
                    System.out.println("Erreur, il faut insérer un nombre supérieur à 0");
                    continue;
                }

                double racineCarree = Math.sqrt(number);
                System.out.println("La racine carrée de " + number + " est " + racineCarree);
                break;
            }catch(InputMismatchException e){
                System.out.println("Erreur, veuillez insérer un nombre entier");
                scanner.nextLine();
            }
        }
    }
}
