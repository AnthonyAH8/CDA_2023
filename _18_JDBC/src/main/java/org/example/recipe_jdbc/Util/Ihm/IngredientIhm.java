package org.example.recipe_jdbc.Util.Ihm;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.example.recipe_jdbc.DAO.IngredientDao;
import org.example.recipe_jdbc.Entity.Ingredient;

public class IngredientIhm {
    private Scanner scanner;
    private IngredientDao ingredientDao;

    public IngredientIhm(Scanner scanner) {
        this.scanner = scanner;
        this.ingredientDao = new IngredientDao();
    }

    public void start() {
        int entry;
        while (true) {
            System.out.println("-- Menu Ingrédients --");
            System.out.println("1. Créer un ingrédient");
            System.out.println("2. Liste des ingrédients");
            System.out.println("3. Supprimer un ingrédient");
            System.out.println("0. Quitter");
            
            entry = scanner.nextInt();
            scanner.nextLine(); 

            switch (entry) {
                case 1:
                    creerIngredient();
                    break;
                case 2:
                    listeIngredients();
                    break;
                case 3:
                    supprimerIngredient();
                    break;
                case 0:
                    return;
                default:
                   break;
            }
        }
    }

    private void creerIngredient() {
        System.out.println("- Créer un ingrédient -");
        System.out.print("Nom de l'ingrédient : ");
        String nom = scanner.nextLine();

        Ingredient ingredient = Ingredient.builder()
                .nom_ingredient(nom)
                .build();

        try {
            Ingredient ingredientCree = ingredientDao.create(ingredient);
            if (ingredientCree != null) {
                System.out.println("Nouvel ingrédient créé : " + ingredientCree);
            } else {
                System.out.println("Erreur lors de la création de l'ingrédient.");
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    private void listeIngredients() {
        System.out.println("- Liste des ingrédients -");
        try {
            List<Ingredient> ingredients = ingredientDao.get();
            for (Ingredient ingredient : ingredients) {
                System.out.println(ingredient);
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    private void supprimerIngredient() {
        System.out.println("- Supprimer un ingrédient -");
        System.out.print("ID de l'ingrédient à supprimer : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            Ingredient ingredient = ingredientDao.get(id);
            if (ingredient != null) {
                boolean supprimer = ingredientDao.delete(ingredient);
                if (supprimer) {
                    System.out.println("Ingrédient supprimé avec succès.");
                } else {
                    System.out.println("Erreur lors de la suppression de l'ingrédient.");
                }
            } else {
                System.out.println("Aucun ingrédient trouvé avec cet ID.");
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
}