package org.example;

import org.example.exercices.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure().build();

        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();

        session.getTransaction().begin();

//        Product product1 = new Product();
//        product1.setMarque("Apple");
//        product1.setReference("123");
//        product1.setDateAchat(2022);
//        product1.setPrix(100);
//        product1.setStock(10);
//        session.save(product1);
//
//        Product product2 = new Product();
//        product2.setMarque("Apple 15 Pro Max");
//        product2.setReference("123");
//        product2.setDateAchat(2021);
//        product2.setPrix(1000);
//        product2.setStock(5);
//        session.save(product2);
//
//        Product product3 = new Product();
//        product3.setMarque("Samsung");
//        product3.setReference("212");
//        product3.setDateAchat(2024);
//        product3.setPrix(800);
//        product3.setStock(2);
//        session.save(product3);
//
//        Product product4 = new Product();
//        product4.setMarque("Xiaomi");
//        product4.setReference("212");
//        product4.setDateAchat(2024);
//        product4.setPrix(800);
//        product4.setStock(2);
//        session.save(product4);
//
//        Product product5 = new Product();
//        product5.setMarque("Nokia 3310");
//        product5.setReference("212");
//        product5.setDateAchat(2024);
//        product5.setPrix(800);
//        product5.setStock(2);
//        session.save(product5);
//
//        Product product = session.load(Product.class,2L);
//        System.out.println(product);
//
//
//        Product productUpdate = session.get(Product.class ,1L);
//        productUpdate.setPrix(500);
//
//        Product productDelete = session.get(Product.class ,3L);
//        session.delete(productDelete);
//
//        session.getTransaction().commit();

//        Query<Product> query = session.createQuery("from Product", Product.class);
//        Iterator<Product> products = query.iterate();
//        while (products.hasNext()){
//            Product p = products.next();
//            System.out.println("Produits : " + p);
//        }
//
//        System.out.println("+++++++++++++++++++++++++++");
//
//        Query<Product> query1 = session.createQuery("from Product where prix > 550");
//        List<Product> productsPrix = query1.list();
//        System.out.println("Liste des produits avec un prix supérieur à 750€");
//        for (Product product : productsPrix) {
//            System.out.println(product);
//        }
//
//        System.out.println("+++++++++++++++++++++++++++");
//
//        Query <Product> query3 = session.createQuery("from Product where dateAchat between :start and :end");
//        query3.setParameter("start", 2023);
//        query3.setParameter("end", 2024);
//        List<Product> productList = query3.list();
//        for (Product list : productList){
//            System.out.println(list.getMarque());
//        }
//
//        System.out.println("+++++++++++++++++++++++++++");

//        System.out.println("Entrez une première date : ");
//        int firstDate = scanner.nextInt();
//        System.out.println("Entrez une seconde date : ");
//        int secondDate = scanner.nextInt();
//        System.out.println("Première date : " + firstDate + "\nSeconde date : " + secondDate);
//        Query query4 = session.createQuery("from Product where dateAchat between :firstDate and :secondDate");
//        query4.setParameter("firstDate", firstDate);
//        query4.setParameter("secondDate", secondDate);
//        List<Product> products4 = query4.list();
//        for (Product list4 : products4){
//            System.out.println(list4.getMarque());
//        }

//        System.out.println("+++++++++++++++++++++++++++");

//        System.out.println("Entrez un stock : ");
//        int stock = scanner.nextInt();
//        System.out.println("Stock inférieur à " + stock);
//        Query query5 = session.createQuery("from Product where stock < :stock");
//        query5.setParameter("stock", stock);
//        List<Product> products5 = query5.list();
//        for (Product list5: products5){
//            System.out.println("ID du produit " + list5.getId() + " Réfenrence du produit " + list5.getReference());
//        }

        Query query6 = session.createQuery("from Product where marque =:marque");
        query6.setParameterList("marque", Collections.singleton("Apple"));
        List <Product> product6 = query6.list();
        for (Product list6 : product6){
            System.out.println("Stock" + list6.getStock());
        }

        session.close();
        sessionFactory.close();
    }
}
