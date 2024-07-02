package com.example.exercice_site_meubles_spring.service;

import com.example.exercice_site_meubles_spring.dao.FurnitureRepository;
import com.example.exercice_site_meubles_spring.entity.Furniture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureService implements FurnitureServiceInterface {

    private final FurnitureRepository furnitureRepository;

    @Autowired
    public FurnitureService(FurnitureRepository furnitureRepository) {
        this.furnitureRepository = furnitureRepository;
    }

    @Override
    public List<Furniture> getAllFurniture() {
        return FurnitureRepository.getAllFurniture();
    }

    @Override
    public Furniture saveFurniture(Furniture furniture) {
        return furnitureRepository.save(furniture);
    }

    @Override
    public Furniture getFurnitureById(int id) {
        return furnitureRepository.findById((long) id).orElse(null);
    }

    @Override
    public void deleteFurniture(Furniture furniture) {
        furnitureRepository.delete(furniture);
    }
}
