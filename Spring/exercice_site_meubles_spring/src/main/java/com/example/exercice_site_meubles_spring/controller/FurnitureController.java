package com.example.exercice_site_meubles_spring.controller;

import com.example.exercice_site_meubles_spring.entity.Furniture;
import com.example.exercice_site_meubles_spring.service.FurnitureService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FurnitureController {
    private final FurnitureService furnitureService;

    public FurnitureController(FurnitureService furnitureService) {
        this.furnitureService = furnitureService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("furniture", furnitureService.getAllFurniture());
        return "home";
    }

    @GetMapping("/addFurniture")
    public String addForm(Model model) {
        model.addAttribute("furniture", new Furniture());
        return "addForm";
    }

    @PostMapping("/addFurniture")
    public String addFurniture(@ModelAttribute("furniture") Furniture furniture) {
       furnitureService.saveFurniture(furniture);
        return "redirect:/";
    }

}
