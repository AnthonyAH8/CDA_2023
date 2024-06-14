package main.java.org.example.exercice_gestion_produits.repository;

import main.java.org.example.exercice_gestion_produits.model.Product;
import org.hibernate.Session;

import java.util.List;

public class ProductRepository extends Repository<Product> {

    public ProductRepository(Session session) {
        super(session);
    }

    @Override
    public Product findById(int id) {
        try {
            return _session.get(Product.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Product> findAll() {
        try {
            return _session.createQuery("from Product", Product.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void create(Product product) {
        try {
            _session.beginTransaction();
            _session.save(product);
            _session.getTransaction().commit();
        } catch (Exception e) {
            if (_session.getTransaction() != null) {
                _session.getTransaction().rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void update(Product product) {
        try {
            _session.beginTransaction();
            _session.update(product);
            _session.getTransaction().commit();
        } catch (Exception e) {
            if (_session.getTransaction() != null) {
                _session.getTransaction().rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Product product) {
        try {
            _session.beginTransaction();
            _session.delete(product);
            _session.getTransaction().commit();
        } catch (Exception e) {
            if (_session.getTransaction() != null) {
                _session.getTransaction().rollback();
            }
            e.printStackTrace();
        }
    }
}
