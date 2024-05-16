package org.example.recipe_jdbc.DAO;

import org.example.recipe_jdbc.Entity.Etape;
import org.example.recipe_jdbc.Entity.Ingredient;
import org.example.recipe_jdbc.Util.DatabaseManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class IngredientDao extends BaseDao<Ingredient>{

    @Override
    public Ingredient create(Ingredient element) throws SQLException {
        try{
            connection = DatabaseManager.getConnection();
            request = "INSERT INTO ingredient(nom) VALUES (?)";
            preparedStatement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, element.getNom_ingredient());
            int row = preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            if(row != 1){
                throw new SQLException();
            }
            if(resultSet.next()){
                element.setId_ingredient(resultSet.getInt(1));
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
    public boolean delete(Ingredient element) throws SQLException {
        request = "DELETE FROM ingredient WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(request)) {
            statement.setInt(1, element.getId_ingredient());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


    @Override
    public Ingredient update(Ingredient element) throws SQLException {
        return null;
    }

    @Override
    public Ingredient get(int id) throws SQLException {
        try{
            connection = DatabaseManager.getConnection();
            request = "SELECT * FROM ingredient WHERE id_ingredient = ?";
            preparedStatement = connection.prepareStatement(request);
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return Ingredient.builder()
                        .id_ingredient(resultSet.getInt("id_ingredient"))
                        .nom_ingredient(resultSet.getString("nom_ingredient"))
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
    public List<Ingredient> get() throws SQLException {
        try{
            List<Ingredient> ingredients = new ArrayList<>();
            connection = DatabaseManager.getConnection();
            request = "SELECT * FROM ingredient";
            preparedStatement = connection.prepareStatement(request);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                ingredients.add(Ingredient.builder()
                        .id_ingredient(resultSet.getInt("id_ingredient"))
                        .nom_ingredient(resultSet.getString("nom_ingredient"))
                        .build());
            }
            return ingredients;
        }catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            close();
        }
    }
}
