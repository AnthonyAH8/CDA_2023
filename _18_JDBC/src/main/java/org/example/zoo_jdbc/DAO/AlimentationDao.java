package org.example.zoo_jdbc.DAO;

import org.example.zoo_jdbc.Entity.Alimentation;
import org.example.zoo_jdbc.Entity.Animaux;
import org.example.zoo_jdbc.Util.DatabaseManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import static java.sql.Timestamp.valueOf;


public class AlimentationDao extends BaseDao<Alimentation> {
    private AnimauxDao animauxDao;

    public AlimentationDao(Connection connection, AnimauxDao animauxDao) {
        super(connection);
        this.animauxDao = animauxDao;
    }

    @Override
    public Alimentation ajouterAnimal(Alimentation element) throws SQLException {
        try {
            String request = "INSERT INTO alimentation (date, details, heure, id_animal) VALUES (?, ?, ?, ?)";
            preparedStatement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setDate(1, Date.valueOf(String.valueOf(element.getDate())));
            preparedStatement.setString(2, element.getDetails());
            preparedStatement.setTimestamp(3, Timestamp.valueOf(element.getHeure()));
            preparedStatement.setInt(4, element.getAnimaux().getId_animal());
            int nbrow = preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            Alimentation alimentation = null;
            if (resultSet.next()) {
                alimentation = Alimentation.builder()
                        .id(resultSet.getInt(1)) 
                        .date(element.getDate())
                        .heure(element.getHeure())
                        .details(element.getDetails())
                        .animaux(element.getAnimaux())
                        .build();
            }
            return alimentation;
        } catch (SQLException e) {
            throw new SQLException("Erreur: " + e.getMessage(), e);
        } finally {
            closeResources();
        }
    }

    @Override
    public List<Alimentation> get() throws SQLException {
        try {
            List<Alimentation> alimentations = new ArrayList<>();
            String request = "SELECT * FROM alimentation";
            preparedStatement = _connection.prepareStatement(request);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                alimentations.add(Alimentation.builder()
                        .id(resultSet.getInt("id"))
//                        .date(resultSet.getDate("date").toLocalDate())
                        .heure(resultSet.getTimestamp("heure").toLocalDateTime())
                        .details(resultSet.getString("details"))
                        .animaux(animauxDao.getAnimal(resultSet.getInt("id_animal")))
                        .build());
            }
            return alimentations;
        } catch (SQLException e) {
            throw new SQLException("Erreur: " + e.getMessage(), e);
        } finally {
            closeResources();
        }
    }

    private void closeResources() {
        try {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
        } catch (SQLException e) {
            System.err.println("Erreur: " + e.getMessage());
        }
    }
}
