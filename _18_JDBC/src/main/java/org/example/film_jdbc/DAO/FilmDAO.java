package org.example.film_jdbc.DAO;

import org.example.film_jdbc.Entity.Film;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class FilmDAO extends BaseDao<Film> {
    private Connection connection;

    public FilmDAO(Connection connection) {
        super(connection);
        this.connection = connection;
    }

    @Override
    public Film createFilm(Film element) throws SQLException {
        String request = "INSERT INTO film (titre, realisateur, dateSortie, genre) VALUES (?,?,?,?)";
        connection.setAutoCommit(false);
        try (PreparedStatement preparedStatement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, element.getTitre());
            preparedStatement.setString(2, element.getRealisateur());
            preparedStatement.setString(3, element.getDateSortie());
            preparedStatement.setString(4, element.getGenre());
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Erreur lors de la création du film, aucune ligne affectée.");
            }
            try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                if (resultSet.next()) {
                    element.setId_film(resultSet.getInt(1));
                    connection.commit();
                    return element;
                }
            }
            throw new SQLException("Aucune clé générée lors de la création du film.");
        } catch (SQLException exception) {
            connection.rollback();
            throw exception;
        }
    }

    @Override
    public Film updateFilm(Film element) throws SQLException {
        String request = "UPDATE film SET titre=?, realisateur=?, dateSortie=?, genre=? WHERE id=?";
        connection.setAutoCommit(false);
        try (PreparedStatement preparedStatement = connection.prepareStatement(request)) {
            preparedStatement.setString(1, element.getTitre());
            preparedStatement.setString(2, element.getRealisateur());
            preparedStatement.setString(3, element.getDateSortie());
            preparedStatement.setString(4, element.getGenre());
            preparedStatement.setInt(5, element.getId_film());
            int rows = preparedStatement.executeUpdate();
            if (rows == 0) {
                throw new SQLException("Erreur lors de la mise à jour du film, aucune ligne affectée.");
            }
            connection.commit();
            return element;
        } catch (SQLException exception) {
            connection.rollback();
            throw exception;
        }
    }

    @Override
    public Film deleteFilm(Film element) throws SQLException {
        String request = "DELETE FROM film WHERE id=?";
        connection.setAutoCommit(false);
        try (PreparedStatement preparedStatement = connection.prepareStatement(request)) {
            preparedStatement.setInt(1, element.getId_film());
            int rows = preparedStatement.executeUpdate();
            if (rows == 0) {
                throw new SQLException("Erreur lors de la suppression du film, aucune ligne affectée.");
            }
            connection.commit();
            return element;
        } catch (SQLException exception) {
            connection.rollback();
            throw exception;
        }
    }

    @Override
    public Film getID(int ID) throws SQLException {
        String request = "SELECT * FROM film WHERE id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(request)) {
            preparedStatement.setInt(1, ID);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return Film.builder()
                            .id_film(resultSet.getInt("id"))
                            .titre(resultSet.getString("titre"))
                            .realisateur(resultSet.getString("realisateur"))
                            .dateSortie(resultSet.getString("dateSortie"))
                            .genre(resultSet.getString("genre"))
                            .build();
                } else {
                    throw new SQLException("Aucun film trouvé avec l'ID spécifié.");
                }
            }
        }
    }

    @Override
    public List<Film> getAllFilms() {
        List<Film> films = new ArrayList<>();
        String request = "SELECT * FROM film";
        try (PreparedStatement preparedStatement = connection.prepareStatement(request)) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    films.add(Film.builder()
                            .id_film(resultSet.getInt("id"))
                            .titre(resultSet.getString("titre"))
                            .realisateur(resultSet.getString("realisateur"))
                            .dateSortie(resultSet.getString("dateSortie"))
                            .genre(resultSet.getString("genre"))
                            .build());
                }
                return films;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
