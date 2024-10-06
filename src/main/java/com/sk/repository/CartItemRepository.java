package com.sk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    void deleteAllByCartId(Long id);
}
