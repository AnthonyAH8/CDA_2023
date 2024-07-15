package com.example.spring_security_jwt.controller;

import com.example.spring_security_jwt.entity.Product;
import com.example.spring_security_jwt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductService> getProductById(@PathVariable("id") int id) {
        return ResponseEntity.ok(productService);
    }

    @PostMapping("/create")
    public ResponseEntity<ProductService> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService);
    }

    @PutMapping("/update")
    public ResponseEntity<ProductService> updateProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ProductService> deleteProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService);
    }
}
