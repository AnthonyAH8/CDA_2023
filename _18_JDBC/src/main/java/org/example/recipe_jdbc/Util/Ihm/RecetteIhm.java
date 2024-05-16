package org.example.recipe_jdbc.Util.Ihm;

import org.example.recipe_jdbc.DAO.RecetteDao;
import org.example.recipe_jdbc.Entity.Recette;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class RecetteIhm {
    private Scanner scanner;
    private RecetteDao recetteDao;

    public RecetteIhm(Scanner scanner){
        this.scanner = scanner;
        recetteDao = new RecetteDao();
    }
    public void start(){
        int entry;
        while(true){
            System.out.println("--Menu recettes--");
            System.out.println("-Créer une recette-");
            System.out.println("-Modifier une recette-");
            System.out.println("-Supprimer une recette-");
            entry = scanner.nextInt();
            scanner.nextLine();

            switch(entry){
                case 1:
                    creerRecette();
                    break;
                case 2:
                    supprimerRecette();
                    break;
                case 3:
                    listeRecettes();
                default:
                    return;
            }
        }
    }

    private void creerRecette(){
        System.out.println("-Créer une recette-");
        System.out.println("Nom de la recette: ");
        String nom = scanner.nextLine();
        System.out.println("Temps de préparation: ");
        int prep = scanner.nextInt();
        System.out.println("Temps de cuisson: ");
        int cuisson = scanner.nextInt();
        System.out.println("Note de difficulté sur 5: ");
        int difficulte = scanner.nextInt();
        scanner.nextLine();
        Recette recette = Recette.builder()
                .nom(nom)
                .tempsPrep(prep)
                .tempsCuisson(cuisson)
                .difficulte(difficulte)
                .build();
        try{
            Recette recetteCree = recetteDao.create(recette);
            if (recetteCree != null){
                System.out.println("Nouvelle recette " + recetteCree);
            }else{
                System.out.println("Erreur");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void listeRecettes() {
        System.out.println("Liste des recettes");
        try {
            List<Recette> recettes = recetteDao.get();
            for (Recette recette : recettes) {
                System.out.println(recette);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erreur lors de la récupération des recettes.", e);
        }
    }
    private void supprimerRecette() {
        System.out.println("-Supprimer une recette-");
        System.out.println("Entrez l'ID de la recette à supprimer: ");
        int idRecette = scanner.nextInt();
        scanner.nextLine();
        try {
            Recette recette = recetteDao.get(idRecette);
            if (recette != null) {
                if (recetteDao.delete(recette)) {
                    System.out.println("Recette supprimée avec succès !");
                } else {
                    System.out.println("Erreur lors de la suppression de la recette.");
                }
            } else {
                System.out.println("Aucune recette trouvée avec l'ID: " + idRecette);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erreur lors de la suppression de la recette.", e);
        }
    }
}
