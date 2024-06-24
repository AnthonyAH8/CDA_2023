package com.example.exercice_todolist_spring.service;

import com.example.exercice_todolist_spring.model.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class ProductService {
    private final Map<UUID, Product> productMap;

    public ProductService(){
        productMap = new HashMap<>();

        Product product1 = Product.builder()
                .id(UUID.randomUUID())
                .name("Iphone")
                .category("Smartphone")
                .price(1599.90)
                .build();

        Product product2 = Product.builder()
                .id(UUID.randomUUID())
                .name("Samsung")
                .category("Smartphone")
                .price(899.90)
                .build();

        Product product3 = Product.builder()
                .id(UUID.randomUUID())
                .name("Clé USB")
                .category("Bureautique")
                .price(9.90)
                .build();

        productMap.put(product1.getId(), product1);
        productMap.put(product2.getId(), product2);
        productMap.put(product3.getId(), product3);

    }

    public Product getProductById(UUID uuid){
        return productMap.get(uuid);
    }

    public Product getProductByCategoryFilter(String category) {
        return productMap.values().stream()
                .filter(p -> p.getCategory().equals(category))
                .findAny()
                .orElse(null);
    }


    public List <Product> getAllProducts(){
        return productMap.values().stream().toList();
    }

//    public Product getProductByMaxPrice(double price){
//        return (Product) productMap.values().stream().filter(pr -> pr.getPrice());
//    }
}
