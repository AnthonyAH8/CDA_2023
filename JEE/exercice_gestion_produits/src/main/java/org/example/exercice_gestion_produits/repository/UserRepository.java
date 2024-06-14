package main.java.org.example.exercice_gestion_produits.repository;

import main.java.org.example.exercice_gestion_produits.model.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.List;

public class UserRepository extends Repository<User> {
    public UserRepository(Session session) {
        super(session);
    }

    @Override
    public User findById(int id) {
        try {
            return _session.get(User.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<User> findAll() {
        try {
            return _session.createQuery("from User", User.class).list();
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void create(User user) {
        try {
            _session.beginTransaction();
            _session.save(user);
            _session.getTransaction().commit();
        } catch (Exception e) {
            if (_session.getTransaction() != null) {
                _session.getTransaction().rollback();
            }
            e.printStackTrace();
        }
    }
}
