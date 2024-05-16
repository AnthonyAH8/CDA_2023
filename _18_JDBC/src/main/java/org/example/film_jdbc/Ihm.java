package org.example.film_jdbc;

import org.example.film_jdbc.DAO.FilmDAO;
import org.example.film_jdbc.Entity.Film;
import org.example.film_jdbc.Util.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Ihm {
    private Connection connection;
    private FilmDAO filmDAO;
    private Scanner scanner;

    public Ihm(){
        scanner = new Scanner(System.in);

        try {
            connection = DatabaseManager.getConnection();
            filmDAO = new FilmDAO(connection) {
                @Override
                public List<Film> getFilms() throws SQLException {
                    return null;
                }

                @Override
                public boolean deleteFilm(int id) {
                    return false;
                }

                @Override
                public void updateFilm(int id, String titre, String realisateur, String dateSortie, String genre) {

                }

                @Override
                public void createFilm(String titre, String realisateur, String dateSortie, String genre) {

                }
            };
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void startProgram() throws SQLException {
        int choice;
        while(true){
            System.out.println("----Librairie de films----");
            System.out.println("1.Ajout d'un film");
            System.out.println("2.Modification d'un film");
            System.out.println("3.Suppression d'un film");
            System.out.println("4.Voir la liste des films");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    createFilm();
                    break;
                case 2:
                    updateFilm();
                    break;
                case 3:
                    deleteFilm();
                    break;
                case 4:
                    getAllFilms();
                    break;
                default:
                    return;
            }
        }
    }

    private void createFilm(){
        System.out.println("---Création d'un nouveau film---");
        System.out.println("Titre du film:");
        String titre = scanner.nextLine();
        System.out.println("Nom du réalisateur:");
        String realisateur = scanner.nextLine();
        System.out.println("Date de sortie");
        String dateSortie = scanner.nextLine();
        System.out.println("Genre du film:");
        String genre = scanner.nextLine();
        filmDAO.createFilm(titre, realisateur, dateSortie, genre);
    }

    private void updateFilm() {
        System.out.println("---Modification d'un film---");
        System.out.println("Entrez l'ID du film à modifier:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nouveau titre du film:");
        String titre = scanner.nextLine();
        System.out.println("Nouveau nom du réalisateur:");
        String realisateur = scanner.nextLine();
        System.out.println("Nouvelle date de sortie:");
        String dateSortie = scanner.nextLine();
        System.out.println("Nouveau genre du film:");
        String genre = scanner.nextLine();

        filmDAO.updateFilm(id, titre, realisateur, dateSortie, genre);
        System.out.println("Film mis à jour avec succès.");
    }


    private void deleteFilm() throws SQLException {
        System.out.println("---Suppression d'un film---");
        System.out.println("Entrez l'ID du film à supprimer:");
        int id = scanner.nextInt();
        scanner.nextLine();

        filmDAO.deleteFilm(id);
        System.out.println("Film supprimé avec succès.");
    }


    private void getAllFilms(){
        List<Film> films = filmDAO.getAllFilms();
        for (Film film: films){
            System.out.println(film);
        }
    }
}
