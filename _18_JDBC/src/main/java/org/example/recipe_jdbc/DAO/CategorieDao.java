package org.example.recipe_jdbc.DAO;

import org.example.recipe_jdbc.Entity.Categorie;
import org.example.recipe_jdbc.Util.DatabaseManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategorieDao extends BaseDao<Categorie> {
    @Override
    public Categorie create(Categorie element) throws SQLException {
        try{
            connection = DatabaseManager.getConnection();
            request = "INSERT INTO categorie(nom_categorie) VALUES (?)";
            preparedStatement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, element.getNom_categorie());
            int row = preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            if(row != 1){
                throw new SQLException();
            }
            if(resultSet.next()){
                element.setId_categorie(resultSet.getInt(1));
            }
            connection.commit();
            return element;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            connection.rollback();
            return null;
        }finally {
            close();
        }
    }

    @Override
    public boolean delete(Categorie element) throws SQLException {
        request = "DELETE FROM categorie WHERE id_categorie = ?";
        try (PreparedStatement statement = connection.prepareStatement(request)) {
            statement.setInt(1, element.getId_categorie());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public Categorie update(Categorie element) throws SQLException {
        return null;
    }

    @Override
    public Categorie get(int id) throws SQLException {
        try {
            List<Categorie> categories = new ArrayList<>();
            connection = DatabaseManager.getConnection();
            request = "SELECT * FROM categorie";
            preparedStatement = connection.prepareStatement(request);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                categories.add(Categorie.builder()
                        .id_categorie(resultSet.getInt("id_categorie"))
                        .nom_categorie(resultSet.getString("nom_categorie"))
                        .build());
            }
            return (Categorie) categories;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            close();
        }
    }

    @Override
    public List<Categorie> get() throws SQLException {
        try {
            List<Categorie> categories = new ArrayList<>();
            connection = DatabaseManager.getConnection();
            request = "SELECT * FROM ingredient";
            preparedStatement = connection.prepareStatement(request);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                categories.add(Categorie.builder()
                        .id_categorie(resultSet.getInt("id_categorie"))
                        .nom_categorie(resultSet.getString("nom_categorie"))
                        .build());
            }
            return categories;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            close();
        }
    }
}
