package org.example.exercice_gestion_chien.interfaces;

import org.example.exercice_gestion_chien.entity.Dogs;
import org.hibernate.Session;

import java.util.List;

public abstract class Repository<T> {
    protected Session _session;
    public Repository(Session session){
        _session = session;
    }

    public boolean create(T o){
        _session.save(o);
        return false;
    }

    public boolean update(T o){
        _session.update(o);
        return false;
    }

    public boolean delete(T o){
        _session.delete(o);
        return false;
    }

    public abstract T findById(int id);

    public abstract List<Dogs> findAll();
}
