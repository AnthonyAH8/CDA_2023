package org.example.recipe_jdbc.Util.Ihm;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.example.recipe_jdbc.DAO.EtapeDao;
import org.example.recipe_jdbc.Entity.Etape;

public class EtapeIhm {
    private static Scanner scanner;
    private static EtapeDao etapeDao;

    public EtapeIhm(Scanner scanner){
        this.scanner = scanner;
        this.etapeDao = new EtapeDao();
    }

    public void start(){
        int entry;
        while (true) {
            System.out.println("---Menu étapes---");
            System.out.println("1. Créer une étape");
            System.out.println("2. Supprimer une étape");
            System.out.println("3. Voir étape");

            entry = scanner.nextInt();
            scanner.nextLine();
            
            switch (entry) {
                case 1:
                    creerEtape();
                    break;
                case 2: 
                    listeEtapes();
                    break;
                case 3:
                    supprimerEtape();
                    break;        
                case 0:
                    return;
                default:
                    break;
            }
        }
    }
    private static void creerEtape(){
        System.out.println("- Créer une étape -");
        System.out.print("Nom de l'étape : ");
        String description_etape = scanner.nextLine();

        Etape etape = Etape.builder()
        .description_etape(description_etape)
        .build();

        try{
            Etape etapeCree = etapeDao.create(etape);
            if (etapeCree != null) {
                System.out.println("Nouvelle étape créée" + etapeCree);
            }else{
                System.out.println("Erreur lors de la création de l'étape");
            }
        }catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
    private static void listeEtapes(){
        System.out.println("-Liste des étapes-");
        try {
            List<Etape> etapes = etapeDao.get();
            for (Etape etape : etapes) {
                System.out.println(etape);
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
    private static void supprimerEtape(){
        System.out.println("-Supprimer une étape");
        System.out.println("ID de l'étape à supprimer");
        int id = scanner.nextInt();
        scanner.nextLine();
        try {
            Etape etape = etapeDao.get(id);
            if (etape != null) {
                boolean supprimer = etapeDao.delete(etape);
                if (supprimer) {
                    System.out.println("Etape supprimée avec succès");
                } else {
                    System.out.println("Erreur lors de la suppression de l'étape.");
                }
            } else {
                System.out.println("Aucune étape trouvée avec cet ID.");
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
}
