package com.example.exercice_site_meubles_spring.service;

import com.example.exercice_site_meubles_spring.dao.CartItemRepository;
import com.example.exercice_site_meubles_spring.entity.CartItem;

import java.util.List;

public class CartService implements CartServiceInterface {

    private CartItemRepository cartItemRepository;

    @Override
    public List<CartItem> getCartItems() {
        return List.of();
    }

    @Override
    public void addCartItem(CartItem cartItem) {
        cartItemRepository.save(cartItem);
    }

    @Override
    public void removeFromCart(CartItem cartItem) {
        cartItemRepository.delete(cartItem);
    }

    @Override
    public void clearCart(CartItem cartItem) {
        cartItemRepository.delete(cartItem);
    }
}
