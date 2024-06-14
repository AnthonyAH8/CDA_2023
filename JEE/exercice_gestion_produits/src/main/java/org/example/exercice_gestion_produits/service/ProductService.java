package main.java.org.example.exercice_gestion_produits.service;

import main.java.org.example.exercice_gestion_produits.model.Product;
import main.java.org.example.exercice_gestion_produits.repository.ProductRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.time.LocalDate;
import java.util.List;

public class ProductService {

    private ProductRepository productRepository;
    private SessionFactory _sessionFactory;
    private Session session;

    public ProductService(SessionFactory sessionFactory){
        _sessionFactory = sessionFactory;
    }

    public Product getProduct(int id){
        Product product = null;
        session = _sessionFactory.openSession();
        productRepository = new ProductRepository(session);
        try {
            product = productRepository.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return product;
    }

    public boolean createProduct(String brand, String reference, LocalDate purchase, double price, int stock){
        boolean successfulCreation = false;
        session = _sessionFactory.openSession();
        session.getTransaction();
        productRepository = new ProductRepository(session);
        Product product = new Product(brand, reference, purchase, price, stock);
        try{
            productRepository.create(product);
            session.getTransaction().commit();
            successfulCreation = true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return successfulCreation;
    }

    public List<Product> getAllProducts(){
        List<Product> productList = null;
        session = _sessionFactory.openSession();
        try{
            productList = productRepository.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return productList;
    }
}
