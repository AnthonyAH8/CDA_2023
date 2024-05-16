package org.example.zoo_jdbc.DAO;

import org.example.zoo_jdbc.Entity.Animaux;
import org.example.zoo_jdbc.Entity.Enclos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao<T> {
    protected static Connection _connection;
    protected static PreparedStatement preparedStatement;
    protected static String request;
    protected static ResultSet resultSet;

    protected BaseDao (Connection connection){
        this._connection = connection;
    }

    public abstract T ajouterAnimal (T element)throws SQLException;
    public abstract List<T> get() throws SQLException;

    public abstract Enclos ajouterEnclos(Enclos build);
}
