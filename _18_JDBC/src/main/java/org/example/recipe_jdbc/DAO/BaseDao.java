package org.example.recipe_jdbc.DAO;

import com.mysql.cj.jdbc.ConnectionImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao<T> {
    protected PreparedStatement preparedStatement;
    protected String request;
    protected ResultSet resultSet;
    protected Connection connection;

    public abstract T create (T element) throws SQLException;
    public abstract boolean delete (T element) throws SQLException;
    public abstract T update (T element) throws SQLException;
    public abstract T get (int id) throws SQLException;
    public abstract List <T> get() throws SQLException;

    protected void close () throws SQLException{
        if(!resultSet.isClosed()){
            resultSet.close();
        }

        if(!preparedStatement.isClosed()){
            preparedStatement.close();
        }
        if (!connection.isClosed()){
            connection.close();
        }
    }

}
