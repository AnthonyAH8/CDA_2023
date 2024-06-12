package org.example.exercice_gestion_chien.repository;

import org.example.exercice_gestion_chien.entity.Dogs;
import org.example.exercice_gestion_chien.interfaces.Repository;
import org.hibernate.Session;

import java.util.List;

public abstract class DogRepository extends Repository<Dogs> {

    public DogRepository(Session session) {
        super(session);
    }

    @Override
    public boolean create(Dogs o) {
        return false;
    }

    @Override
    public boolean update(Dogs o) {
        return false;
    }

    @Override
    public boolean delete(Dogs o) {
        return false;
    }

    @Override
    public Dogs findById(int id) {
        return (Dogs) _session.get(Dogs.class,id);
    }

    @Override
    public List<Dogs> findAll() {
        return (List<Dogs>) _session.createQuery(String.valueOf(Dogs.class));
    }
}
