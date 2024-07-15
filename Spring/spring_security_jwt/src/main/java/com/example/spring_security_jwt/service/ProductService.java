package com.example.spring_security_jwt.service;

import com.example.spring_security_jwt.entity.Product;
import com.example.spring_security_jwt.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(int id) {
        return productRepository.findById(Long.valueOf(id));
    }

    public Product create(Product product) {
        Product newProduct = Product.builder()
                .name(product.getName())
                .price(product.getPrice())
                .build();
        productRepository.save(newProduct);
        return newProduct;
    }

    public Product update(int id, Product product) {
        Product updateProduct = productRepository.findById(Long.valueOf(id)).get();
        updateProduct.setName(product.getName());
        updateProduct.setPrice(product.getPrice());
        productRepository.save(updateProduct);
        return updateProduct;
    }

    public void delete(Product product) {
        productRepository.delete(product);
    }
}
