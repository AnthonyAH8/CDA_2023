package org.example.recipe_jdbc.Util.Ihm;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.example.recipe_jdbc.DAO.CommentaireDao;
import org.example.recipe_jdbc.Entity.Commentaire;

public class CommentaireIhm {
    private static Scanner scanner;
    private static CommentaireDao commentaireDao;

    public CommentaireIhm(Scanner scanner){
        this.scanner = scanner;
        this.commentaireDao = new CommentaireDao();

    }

    public void start(){
        int entry;
        while (true) {
            System.out.println("-- Menu Commentaires --");
            System.out.println("1. Ajouter un commentaire");
            System.out.println("2. Liste des commentaires");
            System.out.println("3. Supprimer un commentaire");
            System.out.println("0. Quitter");

            entry = scanner.nextInt();
            scanner.nextLine(); 

            switch (entry) {
                case 1:
                    ajouterCommentaire();
                    break;
                case 2:
                    listeCommentaires();
                    break;
                case 3:
                    supprimerCommentaire();
                    break;        
                case 0:
                    return;
                default:
                    break;
            }
        }
    }
    private static void ajouterCommentaire(){
        System.out.println("Ajouter des commtaires");
        String description = scanner.nextLine();
        Commentaire commentaire = Commentaire.builder()
            .description(description)
            .build();

            try {
                Commentaire commentaireAjout = commentaireDao.create(commentaire);
                if (commentaireAjout != null) {
                    System.out.println("Nouveau commentaire" + commentaireAjout);
                } else {
                    System.out.println("Erreur lors de l'ajout du commentaire");
                }
            } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    private static void listeCommentaires(){
        System.out.println("-Liste des commentaires-");
        try {
            List <Commentaire> commentaires = commentaireDao.get();
            for (Commentaire commentaire : commentaires) {
                System.out.println(commentaire);
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    private static void supprimerCommentaire(){
        System.out.println("Supprimer un commentaire");
        System.out.println("ID du commentaire à supprimer");

        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            Commentaire commentaire = commentaireDao.get(id);
            if (commentaire != null) {
                boolean supprimer = commentaireDao.delete(commentaire);
                if (supprimer) {
                    System.out.println("Commentaire supprimé avec succès");
                } else {
                    System.out.println("Erreur lors de la suppression du commentaire");
                }
            } else {
                System.out.println("Aucun commentaire trouvé");
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
}
