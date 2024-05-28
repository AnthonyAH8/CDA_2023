package org.example.tp_billetterie.Repository;

import javax.persistence.EntityManager;
import java.util.List;

public class LieuRepository extends BaseRepository{
    public LieuRepository(EntityManager em) {
        super(em);
    }

    @Override
    public void save(Object element) {

    }

    @Override
    public void delete(Object element) {

    }

    @Override
    public Object findById(int id, String discriminator) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public List findAllByType(String productClass) {
        return null;
    }
}
