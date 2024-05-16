package org.example.film_jdbc.DAO;

import org.example.film_jdbc.Entity.Film;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao<T> {
    protected Connection _connection;
    protected PreparedStatement preparedStatement;
    protected String request;
    protected ResultSet resultSet;

    protected BaseDao (Connection connection){
        this._connection = connection;
    }

    public abstract T createFilm(T element) throws SQLException;
    public abstract T updateFilm(T element) throws SQLException;
    public abstract T deleteFilm(T element) throws SQLException;
    public abstract T getID(int ID) throws SQLException;
    public abstract List<T> getFilms() throws SQLException;

    public abstract List<Film> getAllFilms();

    public abstract boolean deleteFilm(int id);

    public abstract void updateFilm(int id, String titre, String realisateur, String dateSortie, String genre);

    public abstract void createFilm(String titre, String realisateur, String dateSortie, String genre);
}
