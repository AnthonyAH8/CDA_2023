package org.example.recipe_jdbc.Util.Ihm;

import org.example.recipe_jdbc.DAO.RecetteIngredientDao;
import org.example.recipe_jdbc.Entity.RecetteIngredient;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class RecetteIngredientIhm {
    private Scanner scanner;
    private RecetteIngredientDao recetteIngredientDao;

    public RecetteIngredientIhm(Scanner scanner) {
        this.scanner = scanner;
        this.recetteIngredientDao = new RecetteIngredientDao();
    }

    public void start() throws SQLException {
        int entry;
        while (true) {
            System.out.println("--Menu RecetteIngredient--");
            System.out.println("1. Ajouter un ingrédient à une recette");
            System.out.println("2. Supprimer un ingrédient d'une recette");
            System.out.println("3. Lister les ingrédients d'une recette");
            System.out.println("0. Quitter");
            entry = scanner.nextInt();
            scanner.nextLine();

            switch (entry) {
                case 1:
                    ajouterIngredient();
                    break;
                case 2:
                    supprimerIngredient();
                    break;
                case 3:
                    listerIngredients();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
                    break;
            }
        }
    }

    private void ajouterIngredient() {
        System.out.println("- Ajouter un ingrédient à une recette -");
        System.out.print("ID de la recette: ");
        int recetteId = scanner.nextInt();
        System.out.print("ID de l'ingrédient: ");
        int ingredientId = scanner.nextInt();
        scanner.nextLine();

        RecetteIngredient recetteIngredient = RecetteIngredient.builder()
                .recette_id(recetteId)
                .ingredient_id(ingredientId)
                .build();

        try {
            RecetteIngredient createdRecetteIngredient = recetteIngredientDao.create(recetteIngredient);
            if (createdRecetteIngredient != null) {
                System.out.println("Ingrédient ajouté à la recette avec succès.");
            } else {
                System.out.println("Erreur lors de l'ajout de l'ingrédient à la recette.");
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    private void supprimerIngredient() {
        System.out.println("- Supprimer un ingrédient d'une recette -");
        System.out.print("ID de la recette: ");
        int recetteId = scanner.nextInt();
        System.out.print("ID de l'ingrédient: ");
        int ingredientId = scanner.nextInt();
        scanner.nextLine();

        RecetteIngredient recetteIngredient = RecetteIngredient.builder()
                .recette_id(recetteId)
                .ingredient_id(ingredientId)
                .build();

        try {
            boolean deleted = recetteIngredientDao.delete(recetteIngredient);
            if (deleted) {
                System.out.println("Ingrédient supprimé de la recette avec succès.");
            } else {
                System.out.println("Erreur lors de la suppression de l'ingrédient de la recette.");
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    private void listerIngredients() throws SQLException {
        System.out.println("- Lister les ingrédients d'une recette -");
        System.out.print("ID de la recette: ");
        int recetteId = scanner.nextInt();
        scanner.nextLine();

        List<RecetteIngredient> recetteIngredients = recetteIngredientDao.getByRecetteId(recetteId);
        if (recetteIngredients.isEmpty()) {
            System.out.println("Aucun ingrédient trouvé pour cette recette.");
        } else {
            System.out.println("Ingrédients de la recette " + recetteId + ":");
            for (RecetteIngredient recetteIngredient : recetteIngredients) {
                System.out.println("ID Ingrédient: " + recetteIngredient.getIngredient_id());
            }
        }
    }
}
