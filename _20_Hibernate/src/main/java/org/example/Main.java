package org.example;

import org.example.exercices.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure().build();

        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();

        session.getTransaction().begin();

        Product product1 = new Product();
        product1.setMarque("Apple");
        product1.setReference("123");
        product1.setDateAchat(2022);
        product1.setPrix(100);
        product1.setStock(10);
        session.save(product1);

        Product product2 = new Product();
        product2.setMarque("Apple 15 Pro Max");
        product2.setReference("123");
        product2.setDateAchat(2021);
        product2.setPrix(1000);
        product2.setStock(5);
        session.save(product2);

        Product product3 = new Product();
        product3.setMarque("Samsung");
        product3.setReference("212");
        product3.setDateAchat(2024);
        product3.setPrix(800);
        product3.setStock(2);
        session.save(product3);

        Product product4 = new Product();
        product4.setMarque("Xiaomi");
        product4.setReference("212");
        product4.setDateAchat(2024);
        product4.setPrix(800);
        product4.setStock(2);
        session.save(product4);

        Product product5 = new Product();
        product5.setMarque("Nokia 3310");
        product5.setReference("212");
        product5.setDateAchat(2024);
        product5.setPrix(800);
        product5.setStock(2);
        session.save(product5);

        Product product = session.load(Product.class,2L);
        System.out.println(product);


        Product productUpdate = session.get(Product.class ,1L);
        productUpdate.setPrix(500);

        Product productDelete = session.get(Product.class ,3L);
        session.delete(productDelete);

        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
