//package org.example.zoo_jdbc.Util;
//
//import org.example.zoo_jdbc.DAO.AnimauxDao;
//import org.example.zoo_jdbc.DAO.EnclosDao;
//import org.example.zoo_jdbc.Entity.Animaux;
//import org.example.zoo_jdbc.Entity.Enclos;
//import org.example.zoo_jdbc.Util.DatabaseManager;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.List;
//import java.util.Scanner;
//
//public class IhmZoo {
//    private Connection connection;
//    private AnimauxDao animauxDao;
//    private EnclosDao enclosDao;
//    private Scanner scanner;
//
//    public IhmZoo() {
//        scanner = new Scanner(System.in);
//
//        try {
//            connection = DatabaseManager.getConnection();
//            animauxDao = new AnimauxDao(connection);
//            enclosDao = new EnclosDao(connection);
//            // todo repas
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void startProgram() {
//        int entry;
//        while (true) {
//            System.out.println("--- Zoo ---");
//            System.out.println("1/ Ajout d'animaux :");
//            System.out.println("2/ Alimentation des animaux ");
//            entry = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (entry) {
//                case 1:
//                    ajouterAnimal();
//                    break;
//                case 2:
//                    break;
//                case 3:
//                    ajouterEnclos();
//                    break;
//                default:
//                    return;
//            }
//        }
//    }
//
//    private void ajouterAnimal() {
//        System.out.println("Ajout d'un animal");
//        System.out.println("Nom de l'animal: ");
//        String nom = scanner.nextLine();
//        System.out.println("Race de l'animal: ");
//        String race = scanner.nextLine();
//        System.out.println("Description de l'animal: ");
//        String description = scanner.nextLine();
//        System.out.println("Age de l'animal: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        try {
//            Animaux animaux = animauxDao.ajouterAnimal(Animaux.builder()
//                    .nom(nom)
//                    .race(race)
//                    .description(description)
//                    .age(age)
//                    .build());
//            System.out.println("L'animal " + nom + " a bien été créé");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    private void ajouterEnclos() {
//        System.out.println("Ajout d'un enclos");
//        System.out.println("Nom de l'enclos");
//        String nom = scanner.nextLine();
//        System.out.println("Nom de l'endroit");
//        String endroit = scanner.nextLine();
//        System.out.println("Animaux à ajouter");
//        String animaux = scanner.nextLine();
//        try {
//            Animaux animauxAjout;
//            Enclos enclos = enclosDao.ajouterEnclos(Enclos.builder()
//                    .nom(nom)
//                    .endroit(endroit)
//                    .animaux(Animaux)
//                    .build());
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
