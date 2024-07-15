package com.example.spring_security_jwt.repository;

import com.example.spring_security_jwt.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Long> {
}
