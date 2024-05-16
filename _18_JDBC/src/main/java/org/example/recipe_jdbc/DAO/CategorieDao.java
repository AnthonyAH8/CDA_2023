package org.example.recipe_jdbc.DAO;

import org.example.recipe_jdbc.Entity.Categorie;

import java.sql.SQLException;
import java.util.List;

public class CategorieDao extends BaseDao<Categorie> {
    @Override
    public Categorie create(Categorie element) throws SQLException {
        return null;
    }

    @Override
    public boolean delete(Categorie element) throws SQLException {
        return false;
    }

    @Override
    public Categorie update(Categorie element) throws SQLException {
        return null;
    }

    @Override
    public Categorie get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Categorie> get() throws SQLException {
        return null;
    }
}
