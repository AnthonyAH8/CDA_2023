package com.example.exercice_site_meubles_spring.service;

import com.example.exercice_site_meubles_spring.entity.Furniture;

import java.util.List;

public interface FurnitureServiceInterface {
    List<Furniture> getAllFurniture();
    Furniture saveFurniture(Furniture furniture);
    Furniture getFurnitureById(int id);
    void deleteFurniture(Furniture furniture);
}
