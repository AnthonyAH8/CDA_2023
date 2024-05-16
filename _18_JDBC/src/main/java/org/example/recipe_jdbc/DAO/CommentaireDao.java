package org.example.recipe_jdbc.DAO;

import org.example.recipe_jdbc.Entity.Commentaire;
import org.example.recipe_jdbc.Util.DatabaseManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CommentaireDao extends BaseDao<Commentaire> {
    @Override
    public Commentaire create(Commentaire element) throws SQLException {
        try{
            connection = DatabaseManager.getConnection();
            request = "INSERT INTO commentaire(description) VALUES (?)";
            preparedStatement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,element.getDescription());
            int row = preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            if(row != 1){
                throw new SQLException();
            }
            if(resultSet.next()){
                element.setDescription(String.valueOf(resultSet.getInt(1)));
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
    public boolean delete(Commentaire element) throws SQLException {
        request = "DELETE FROM commentaire WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(request)) {
            statement.setInt(1, element.getId_commentaire());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public Commentaire update(Commentaire element) throws SQLException {
        return null;
    }

    @Override
    public Commentaire get(int id) throws SQLException {
        try {
            connection = DatabaseManager.getConnection();
            request = "SELECT * FROM commentaire WHERE id_commentaire = ?";
            preparedStatement = connection.prepareStatement(request);
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return Commentaire.builder()
                        .id_commentaire(resultSet.getInt("id_ingredient"))
                        .description(resultSet.getString("description"))
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
    public List<Commentaire> get() throws SQLException {
        try{
            List<Commentaire> commentaires = new ArrayList<>();
            connection = DatabaseManager.getConnection();
            request = "SELECT * FROM commentaire";
            preparedStatement = connection.prepareStatement(request);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                commentaires.add(Commentaire.builder()
                        .id_commentaire(resultSet.getInt("id_ingredient"))
                        .description(resultSet.getString("description"))
                        .build());
            }
            return commentaires;
        }catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            close();
        }
    }
}

