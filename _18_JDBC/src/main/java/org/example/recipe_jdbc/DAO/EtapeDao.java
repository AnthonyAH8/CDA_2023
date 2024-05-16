package org.example.recipe_jdbc.DAO;

import org.example.recipe_jdbc.Entity.Etape;

import java.sql.SQLException;
import java.util.List;

public class EtapeDao extends BaseDao<Etape>{
    @Override
    public Etape create(Etape element) throws SQLException {
        return null;
    }

    @Override
    public boolean delete(Etape element) throws SQLException {
        return false;
    }

    @Override
    public Etape update(Etape element) throws SQLException {
        return null;
    }

    @Override
    public Etape get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Etape> get() throws SQLException {
        return null;
    }
}
