package org.example.recipe_jdbc.Util.Ihm;

import org.example.recipe_jdbc.DAO.IngredientDao;

import java.util.Scanner;

public class Ihm {
    private Scanner scanner;

    public Ihm(){
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        int entry;
        while(true){
            System.out.println("Application de gestion de recette");
            System.out.println("1.Menu recettes");
            // TODO suite menu principal
            entry = scanner.nextInt();
            scanner.nextLine();

            switch (entry){
                case 1:
                    RecetteIhm recetteIhm = new RecetteIhm(scanner);
                    recetteIhm.start();
                    break;
                // TODO suite menu principal
                default:
                    return;
            }
        }
    }
}
