package com.example.exercice_todolist_spring.controller;

import com.example.exercice_todolist_spring.model.Product;
import com.example.exercice_todolist_spring.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products")
    public String productsList(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("/products/filter")
    public String productFilter(@RequestParam(name = "contactFilter", required = false) String category, Model model){
        List<Product> products = (List<Product>) productService.getProductByCategoryFilter(category);
        model.addAttribute("products", products);
        return "productDetail";
    }
}
