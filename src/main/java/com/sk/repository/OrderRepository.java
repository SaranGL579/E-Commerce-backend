package com.sk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.model.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
  List<Order> findByUserId(Long userId);
}
