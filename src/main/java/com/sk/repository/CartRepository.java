package com.sk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUserId(Long userId);
}
