package org.example.recipe_jdbc.Util.Ihm;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.example.recipe_jdbc.DAO.CategorieDao;
import org.example.recipe_jdbc.Entity.Categorie;

public class CategorieIhm {
    private static Scanner scanner;
    private static CategorieDao categorieDao;

    public CategorieIhm(Scanner scanner){
        this.scanner = scanner;
        this.categorieDao = new CategorieDao();
    }

    public void start(){
        int entry;
        while (true) {
            System.out.println("-- Menu Catégories --");
            System.out.println("1. Créer une catégorie");
            System.out.println("2. Liste des catégories");
            System.out.println("3. Supprimer une catégorie");
            System.out.println("0. Quitter");

            entry = scanner.nextInt();
            scanner.nextLine(); 

            switch (entry) {
                case 1:
                    creerCategorie();
                    break;
                case 2:
                    listeCategories();
                    break;  
                case 3:
                    supprimerCategorie();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }
    private static void creerCategorie(){
        System.out.println("- Créer une catégorie -");
        System.out.print("Nom de la catégorie : ");
        String nom_categorie = scanner.nextLine();

        Categorie categorie = Categorie.builder()
            .nom_categorie(nom_categorie)
            .build();
        
        try{
            Categorie categorieCreee = categorieDao.create(categorie);
            if (categorieCreee != null) {
                System.out.println("Nouvelle catégorie créée" + categorieCreee);
            } else {
                System.out.println("Erreur lors de la création de la catégorie");
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    private static void listeCategories(){
        System.out.println("-Liste des catégories-");
        try {
            List <Categorie> categories = categorieDao.get();
            for (Categorie categorie : categories) {
                System.out.println(categorie);
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    private static void supprimerCategorie(){
        System.out.println("Supprimer une catégorie");
        System.out.println("ID de la catégorie à supprimer");

        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            Categorie categorie = categorieDao.get(id);
            if (categorie != null) {
                boolean supprimer = categorieDao.delete(categorie);
                if (supprimer) {
                    System.out.println("Catégorie supprimée avec succès.");
                } else {
                    System.out.println("Erreur lors de la suppression de la catégorie.");
                }
            }else{
                System.out.println("Aucune catégorie trouvée avec cet ID.");
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
}
