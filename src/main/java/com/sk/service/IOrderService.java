package com.sk.service;

import java.util.List;

import com.sk.dto.OrderDto;
import com.sk.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
