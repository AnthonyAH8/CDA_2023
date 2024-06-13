package org.example.exercice_gestion_produits.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exercice_gestion_produits.model.Product;

import java.io.IOException;

@WebServlet(name = "product", value = "product")
public class ProductServlet extends HttpServlet {

    private Product product;

    @Override
    public void init() throws ServletException {
        product = new Product(product.getBrand(), product.getReference(), product.getLocalDate(), product.getPrice(), product.getStock());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
