package com.example.exercice_site_meubles_spring.dao;

import com.example.exercice_site_meubles_spring.entity.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FurnitureRepository extends JpaRepository<Furniture, Long> {

    static List<Furniture> getAllFurniture() {
        return List.of();
    }
}
