package org.example.recipe_jdbc.Util.Ihm;

import java.sql.SQLException;
import java.util.Scanner;

public class Ihm {
    private Scanner scanner;

    public Ihm(){
        this.scanner = new Scanner(System.in);
    }

    public void start() throws SQLException{
        int entry;
        while(true){
            System.out.println("Application de gestion de recettes");
            System.out.println("1.Menu recettes");
            System.out.println("2.Menu ingrédients");
            System.out.println("3.Menu étapes");
            System.out.println("4.Menu catégories");
            System.out.println("5.Menu commentaires");
            System.out.println("6.Menu recettes & ingrédients");

            entry = scanner.nextInt();
            scanner.nextLine();

            switch (entry){
                case 1:
                    RecetteIhm recetteIhm = new RecetteIhm(scanner);
                    recetteIhm.start();
                    break;
                case 2:
                    IngredientIhm ingredientIhm = new IngredientIhm(scanner);
                    ingredientIhm.start(); 
                    break; 
                case 3:
                    EtapeIhm etapeIhm = new EtapeIhm(scanner);
                    etapeIhm.start();
                    break;
                case 4:
                   CategorieIhm categorieIhm = new CategorieIhm(scanner);
                   categorieIhm.start();
                    break;
                case 5:
                    CommentaireIhm commentaireIhm = new CommentaireIhm(scanner);
                    commentaireIhm.start();
                    break;    
                case 6:
                    RecetteIngredientIhm recetteIngredientIhm = new RecetteIngredientIhm(scanner);
                    recetteIngredientIhm.start();
                case 0:
                    break;
                default:
                    return;
            }
        }
    }
}
