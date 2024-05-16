package org.example.recipe_jdbc.DAO;

import org.example.recipe_jdbc.Entity.Ingredient;
import org.example.recipe_jdbc.Util.DatabaseManager;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
public class IngredientDao extends BaseDao<Ingredient>{

    @Override
    public Ingredient create(Ingredient element) throws SQLException {
        try{
            connection = DatabaseManager.getConnection();
            request = "INSERT INTO ingredient(nom) VALUES (?)";
            preparedStatement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, element.getNom());
            int row = preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            if(row != 1){
                throw new SQLException();
            }
            if(resultSet.next()){
                element.setId(resultSet.getInt(1));
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
        return false;
    }

    @Override
    public Ingredient update(Ingredient element) throws SQLException {
        return null;
    }

    @Override
    public Ingredient get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Ingredient> get() throws SQLException {
        return null;
    }
}
