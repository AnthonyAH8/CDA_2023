package org.example.recipe_jdbc.DAO;

import org.example.recipe_jdbc.Entity.Commentaire;

import java.sql.SQLException;
import java.util.List;

public class CommentaireDao extends BaseDao<Commentaire> {
    @Override
    public Commentaire create(Commentaire element) throws SQLException {
        return null;
    }

    @Override
    public boolean delete(Commentaire element) throws SQLException {
        return false;
    }

    @Override
    public Commentaire update(Commentaire element) throws SQLException {
        return null;
    }

    @Override
    public Commentaire get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Commentaire> get() throws SQLException {
        return null;
    }
}
