package org.example.recipe_jdbc.DAO;

import org.example.recipe_jdbc.Entity.Etape;
import org.example.recipe_jdbc.Util.DatabaseManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EtapeDao extends BaseDao<Etape>{
    @Override
    public Etape create(Etape element) throws SQLException {
        try {
            connection = DatabaseManager.getConnection();
            request = "INSERT INTO etape(description_etape) VALUES (?)";
            preparedStatement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, element.getDescription_etape());
            int row = preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            if (row != 1 || !resultSet.next()) {
                throw new SQLException("Failed to create etape");
            }
            element.setId_etape(resultSet.getInt(1)); // Setting the ID of the etape
            connection.commit();
            return element;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            connection.rollback();
            return null;
        } finally {
            close();
        }
    }
    @Override
    public boolean delete(Etape element) throws SQLException {
        request = "DELETE FROM etape WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(request)) {
            statement.setInt(1, element.getId_etape());
            statement.executeUpdate();
            return true;
        }
    }

    @Override
    public Etape update(Etape element) throws SQLException {
        return null;
    }

    @Override
    public Etape get(int id) throws SQLException {
        try{
            connection = DatabaseManager.getConnection();
            request = "SELECT * FROM etape WHERE id = ?";
            preparedStatement = connection.prepareStatement(request);
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return Etape.builder()
                        .id_etape(resultSet.getInt("id_etape"))
                        .description_etape(resultSet.getString("description_etape"))
                        .build();
            }
            return null;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }finally {
            close();
        }
    }

    @Override
    public List<Etape> get() throws SQLException {
        try {
            List<Etape> etapes = new ArrayList<>();
            connection = DatabaseManager.getConnection();
            request = "SELECT * FROM etape";
            preparedStatement = connection.prepareStatement(request);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                etapes.add(Etape.builder()
                        .id_etape(resultSet.getInt("id"))
                        .description_etape(resultSet.getString("description_etape"))
                        .build());
            }
            return etapes;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            close();
        }
    }
}
