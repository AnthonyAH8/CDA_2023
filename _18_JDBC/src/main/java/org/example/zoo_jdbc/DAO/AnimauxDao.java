package org.example.zoo_jdbc.DAO;

import org.example.zoo_jdbc.Entity.Animaux;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class AnimauxDao extends BaseDao<Animaux> {

    public AnimauxDao(Connection connection) {
        super(connection);
    }

    @Override
    public Animaux ajouterAnimal(Animaux element) throws SQLException {
        String request;
        PreparedStatement preparedStatement = null;
        try {
            request = "INSERT INTO animaux (nom, race, description, age) VALUES (?, ?, ?, ?)";
            preparedStatement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, element.getNom());
            preparedStatement.setString(2, element.getRace());
            preparedStatement.setString(3, element.getDescription());
            preparedStatement.setInt(4, element.getAge());
            int nbrow = preparedStatement.executeUpdate();
            if (nbrow != 1) {
                _connection.rollback();
            } else {
                _connection.commit();
            }
            return element;
        } catch (SQLException exception) {
            _connection.rollback();
            throw exception;
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

    @Override
    public List<Animaux> get() throws SQLException {
        return null;
    }
}
