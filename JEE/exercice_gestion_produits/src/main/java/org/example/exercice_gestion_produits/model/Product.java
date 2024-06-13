package org.example.exercice_gestion_produits.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String brand;

    private String reference;

    @Temporal(TemporalType.DATE)
    private LocalDate purchase;

    private double price;

    private int stock;

    public Product(String brand, String reference, LocalDate localDate, double price, int stock) {
        this.brand = brand;
        this.reference = reference;
        this.purchase = localDate;
        this.price = price;
        this.stock = stock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDate getLocalDate() {
        return purchase;
    }

    public void setLocalDate(LocalDate localDate) {
        this.purchase = localDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "brand='" + brand + '\'' +
                ", reference='" + reference + '\'' +
                ", localDate=" + purchase +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
