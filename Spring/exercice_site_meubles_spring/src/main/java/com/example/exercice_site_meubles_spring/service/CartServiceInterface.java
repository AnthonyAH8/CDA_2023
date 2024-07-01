package com.example.exercice_site_meubles_spring.service;

import com.example.exercice_site_meubles_spring.entity.CartItem;

import java.util.List;

public interface CartServiceInterface {
    List<CartItem> getCartItems();
    void addCartItem(CartItem cartItem);
    void removeFromCart(CartItem cartItem);
    void clearCart(CartItem cartItem);
}
