package org.example;

import org.example.exercices.Product;
import org.example.exercices.entities.Commentaire;
import org.example.exercices.entities.Image;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure().build();

        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata().buildSessionFactory();


        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        session.getTransaction().begin();
//
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
//        for (Product productPrix : productsPrix) {
//            System.out.println(productPrix);
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
//
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
//
//        System.out.println("+++++++++++++++++++++++++++");
//
//        System.out.println("Entrez un stock : ");
//        int stock = scanner.nextInt();
//        System.out.println("Stock inférieur à " + stock);
//        Query query5 = session.createQuery("from Product where stock < :stock");
//        query5.setParameter("stock", stock);
//        List<Product> products5 = query5.list();
//        for (Product list5: products5){
//            System.out.println("ID du produit " + list5.getId() + " Réfenrence du produit " + list5.getReference());
//        }

//        System.out.println("+++++++++++++++++++++++++++");
//
//        Query query6 = session.createQuery("from Product where marque =:marque");
//        query6.setParameterList("marque", Collections.singleton("Apple"));
//        List <Product> product6 = query6.list();
//        for (Product list6 : product6){
//            System.out.println("Stock" + list6.getStock());
//        }

        // 2. Calculer le prix moyen des produits.

//        double prixMoyen = (double) session.createQuery("select avg(prix) from Product ").uniqueResult();
//        System.out.println(prixMoyen);
//
//        System.out.println("+++++++++++++++++++++++++++");

        // 3. Récupérer la liste des produits d'une marque choisie.

//        Query query7 = session.createQuery("from Product where marque =:marque");
//        query7.setParameterList("marque", Collections.singleton("Xiaomi"));
//        List <Product> product7 = query7.list();
//        for (Product list7 : product7){
//            System.out.println("Liste des produits de la marque : " + list7.getMarque());
//            System.out.println(list7);
//        }

//        System.out.println("+++++++++++++++++++++++++++");

        // 4. Supprimer les produits d'une marque choisie de la table produit.

//        String delete_query = "delete Product where marque=:marque";
//        Query query8 = session.createQuery(delete_query);
//        query8.setParameterList("marque", Collections.singleton("Apple"));
//        int success = query8.executeUpdate();

                        // # Exercice 5

//        On souhaite modifier notre application  en ajoutant les fonctionnalités suivantes :
//
//        - Chaque produit possède une ou plusieurs images (une image est caractérisée par un id et un url)
//        - Chaque produit possède un ou plusieurs commentaires (un id, un contenu et une date, une note).
//
//        1. Ajouter les classes nécessaires.
//        2. Ajouter la possibilité d'ajouter une image à un produit.
//        3. Ajouter la possibilité d'ajouter un commentaire à un produit.

//        Image image1 = new Image();
//        image1.setUrl("azertyuiop123");
//        session.save(image1);

//        Image image2 = new Image();
//        image2.setUrl("qsdfghjklm789");
//        session.save(image2);
//
//        Product product6 = new Product();
//        product6.setMarque("Samsung");
//        product6.setDateAchat(2017);
//        product6.setPrix(499);
//        product6.setReference("123456");
//        product6.setStock(40);
//        product6.setImage(image1);
//        session.save(product6);

//        SimpleDateFormat date1 = new SimpleDateFormat("dd-MM-yy");

//        Commentaire commentaire1 = new Commentaire();
//        commentaire1.setContenu("Le meilleur téléphone portable");
//        commentaire1.setDate(date1.get2DigitYearStart());
//        commentaire1.setNote(5);
//        session.save(commentaire1);

//        Commentaire commentaire2 = new Commentaire();
//        commentaire2.setContenu("Le deuxième meilleur téléphone portable");
//        commentaire2.setDate(date1.get2DigitYearStart());
//        commentaire2.setNote(3);
//        session.save(commentaire2);

//        Product product7 = new Product();
//        product7.setMarque("Sony");
//        product7.setDateAchat(2008);
//        product7.setPrix(100);
//        product7.setReference("7896541");
//        product7.setStock(800);
//        product7.setImage(image2);
//        product7.setCommentaire(commentaire2);
//        session.save(product7);

//        Product product8 = new Product();
//        product8.setMarque("Motorola");
//        product8.setDateAchat(1999);
//        product8.setPrix(100);
//        product8.setReference("7410852963");
//        product8.setStock(800);
//        product8.setImage(image2);
//        product8.setCommentaire(commentaire2);
//        session.save(product8);

//        4. Afficher les produits ave une note de 4 ou plus.

        Query query9 = session.createQuery("select p from Product as p join Commentaire c on c.products group by p having avg(c.note) >= :note1");
        query9.setParameter("note1", 4);
        List<Product> product9 = query9.list();
        for (Product list9 : product9){
            System.out.println(list9);
        }

        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
