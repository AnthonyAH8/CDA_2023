package main.java.org.example.exercice_gestion_produits.service;

import main.java.org.example.exercice_gestion_produits.model.User;
import main.java.org.example.exercice_gestion_produits.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class UserService {

    private UserRepository userRepository;

    private SessionFactory _sessionFactory;

    private Session session;

    public UserService(SessionFactory sessionFactory){
        _sessionFactory = sessionFactory;
    }
    public User getUser(int id){
        User user = null;
        session = _sessionFactory.openSession();
        userRepository = new UserRepository(session);
        try{
            user = userRepository.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return user;
    }

    public boolean createUser(String username, String password, String email){
        boolean successfulCreation = false;
        session = _sessionFactory.openSession();
        session.beginTransaction();
        userRepository = new UserRepository(session);
        User user = new User(username, password, email);
        try {
            userRepository.create(user);
            session.getTransaction().commit();
            successfulCreation = true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return successfulCreation;
    }
}
