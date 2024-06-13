package org.example.exercice_gestion_produits.repository;

import org.example.exercice_gestion_produits.model.Product;
import org.example.exercice_gestion_produits.model.User;
import org.hibernate.Session;

import java.util.List;

public class UserRepository extends Repository<User> {
    public UserRepository(Session session) {
        super(session);
    }

    @Override
    public User findById(int id) {
        return (User) _session.get(User.class, id);
    }


    @Override
    public List<User> findAll() {

        return null;
    }
}
