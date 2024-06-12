package org.example.exercice_gestion_chien.service;

import org.example.exercice_gestion_chien.entity.Dogs;
import org.example.exercice_gestion_chien.interfaces.Repository;
import org.hibernate.Query;

import java.util.List;

public class DogService extends BaseService implements Repository<Dogs> {

    public DogService(){
        super();
    }

    @Override
    public boolean create(Dogs o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Dogs o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Dogs o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Dogs findById(int id) {
        session = sessionFactory.openSession();
        Dogs dogs = session.get(Dogs.class,id);
        session.close();
        return dogs;
    }

    @Override
    public List<Dogs> findAll() {
        List<Dogs> dogsList = null;
        session = sessionFactory.openSession();
        Query<Dogs> dogsQuery = session.createQuery("from Dogs");
        dogsList = dogsQuery.list();
        session.close();
        return dogsList;
    }
}
