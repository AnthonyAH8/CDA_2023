package org.example.recipe_jdbc.DAO;

import org.example.recipe_jdbc.Entity.Recette;
import org.example.recipe_jdbc.Util.DatabaseManager;

import javax.xml.crypto.Data;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class RecetteDao extends BaseDao <Recette> {
    @Override
    public Recette create(Recette element) throws SQLException {
        try {
            connection = DatabaseManager.getConnection();
            request = "INSERT INTO recette(nom, tempsPrep, tempsCuisson, difficulte, categorieId) VALUES (?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, element.getNom());
            preparedStatement.setInt(2, element.getTempsPrep());
            preparedStatement.setInt(3, element.getTempsCuisson());
            preparedStatement.setInt(4, element.getDifficulte());
            preparedStatement.setInt(5, element.getCategorieId());
            int row = preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            if (row != 1) {
                throw new SQLException();
            }
            if (resultSet.next()) {
                element.setId_recette(resultSet.getInt(1));
            }
            connection.commit();
            return element;
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            connection.rollback();
            return null;
        }finally {
            close();
        }
    }

    @Override
    public boolean delete(Recette element) throws SQLException {
        request = "DELETE FROM recette WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(request)) {
            statement.setInt(1, element.getId_recette());
            statement.executeUpdate();
            return true;
        }
        catch (SQLException exception){
            System.out.println(exception.getMessage());
            return false;
        }
    }

    @Override
    public Recette update(Recette element) throws SQLException {
        return null;
    }

    @Override
    public Recette get(int id) throws SQLException {
        try {
            connection = DatabaseManager.getConnection();
            request = "SELECT * FROM recette WHERE id_recette = ?";
            preparedStatement = connection.prepareStatement(request);
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return Recette.builder()
                        .id_recette(resultSet.getInt("id_recette"))
                        .nom(resultSet.getString("nom"))
                        .tempsPrep(resultSet.getInt("tempsPrep"))
                        .tempsCuisson(resultSet.getInt("tempsCuisson"))
                        .difficulte(resultSet.getInt("difficulte"))
                        .categorieId(resultSet.getInt("categorieId"))
                        .build();
            }
            return null;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }finally {
            close();
        }
    }

    @Override
    public List<Recette> get() throws SQLException {
        return null;
    }
}
