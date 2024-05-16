package org.example.recipe_jdbc.DAO;

import org.example.recipe_jdbc.Entity.RecetteIngredient;
import org.example.recipe_jdbc.Util.DatabaseManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RecetteIngredientDao extends BaseDao<RecetteIngredient> {
    @Override
    public RecetteIngredient create(RecetteIngredient element) throws SQLException {
        try{
            connection = DatabaseManager.getConnection();
            request = "INSERT INTO recette_ingredient(recette_id, ingredient_id) VALUES (?,?)";
            preparedStatement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, element.getRecette_id());
            preparedStatement.setInt(2, element.getIngredient_id());
            int row = preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            if(row != 1){
                throw new SQLException();
            }
            if(resultSet.next()){
                element.setId_recette_ingredient(resultSet.getInt(1));
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
    public boolean delete(RecetteIngredient element) throws SQLException {
        request = "DELETE FROM recette_ingredient WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(request)) {
            statement.setInt(1, element.getId_recette_ingredient());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public RecetteIngredient update(RecetteIngredient element) throws SQLException {
        return null;
    }

    @Override
    public RecetteIngredient get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<RecetteIngredient> get() throws SQLException {
        List<RecetteIngredient> recetteIngredients = new ArrayList<>();
        String query = "SELECT * FROM recette_ingredient";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int recetteId = resultSet.getInt("recette_id");
                int ingredientId = resultSet.getInt("ingredient_id");
                recetteIngredients.add(RecetteIngredient.builder()
                                .recette_id(resultSet.getInt("recette_id"))
                                .ingredient_id(resultSet.getInt("ingredient_id"))
                        .build());
            }
        }
        return recetteIngredients;
    }
}

