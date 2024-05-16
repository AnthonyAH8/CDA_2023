package org.example.zoo_jdbc.DAO;

import org.example.zoo_jdbc.Entity.Animaux;
import org.example.zoo_jdbc.Entity.Enclos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class EnclosDao extends BaseDao<Enclos> {

    public EnclosDao(Connection connection) {
        super(connection);
    }

    @Override
    public Enclos ajouterAnimal(Enclos element) throws SQLException {
        try {
            String request = "INSERT INTO enclos (nom, endroit) VALUES (?,?)";
            preparedStatement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, element.getNom());
            preparedStatement.setString(2, element.getEndroit());
            int nbrow = preparedStatement.executeUpdate();
            if (nbrow != 1) {
                throw new SQLException("Erreur");
            }
            resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                element.setId(resultSet.getInt(1));
            }
            _connection.commit();
            return element;
        } catch (SQLException e) {
            _connection.rollback();
            throw new SQLException("Erreur: " + e.getMessage(), e);
        } finally {
            closeResources();
        }
    }

    @Override
    public List<Enclos> get() throws SQLException {
        return null;
    }

    private void closeResources() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException e) {
            System.err.println("Erreur: " + e.getMessage());
        }
    }

}
