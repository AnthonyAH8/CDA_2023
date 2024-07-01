package com.example.exercice_site_meubles_spring.dao;

import com.example.exercice_site_meubles_spring.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
