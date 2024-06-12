package org.example.exercice_gestion_chien.interfaces;

import java.util.List;

public interface Repository<T>{
    boolean create(T o);
    boolean update(T o);
    boolean delete(T o);

    T findById(int id);

    List<T> findAll();
}
