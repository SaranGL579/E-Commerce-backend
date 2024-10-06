package com.sk.service;

import java.math.BigDecimal;

import com.sk.model.Cart;
import com.sk.model.User;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);


    Cart getCartByUserId(Long userId);
	Cart initializeNewCart(User u);
}