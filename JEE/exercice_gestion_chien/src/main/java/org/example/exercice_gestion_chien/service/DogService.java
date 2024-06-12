package org.example.exercice_gestion_chien.service;

import org.example.exercice_gestion_chien.entity.Dogs;
import org.example.exercice_gestion_chien.interfaces.Repository;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

import static org.example.exercice_gestion_chien.util.HibernateSession.sessionFactory;

public class DogService extends Repository<Dogs> {

    public DogService(Session session) {
        super(session);
    }

    @Override
    public boolean create(Dogs o) {
        return true;
    }

    @Override
    public boolean update(Dogs o) {
        return true;
    }

    @Override
    public boolean delete(Dogs o) {
        return true;
    }

    @Override
    public Dogs findById(int id) {
        Session session = sessionFactory.openSession();
        Dogs dog = session.get(Dogs.class, id);
        session.close();
        return dog;
    }

    @Override
    public List<Dogs> findAll() {
        Session session = sessionFactory.openSession();
        Query<Dogs> query = session.createQuery("from Dogs");
        List<Dogs> dogs = query.list();
        session.close();
        return dogs;
    }
}

}
