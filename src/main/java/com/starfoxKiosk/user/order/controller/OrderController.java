package com.starfoxKiosk.user.order.controller;

import com.starfoxKiosk.user.order.domain.Order;
import com.starfoxKiosk.user.order.repository.OrderRepository;
import com.starfoxKiosk.user.order.service.OrderService;

import java.util.List;

public class OrderController {
    private final OrderService orderService = new OrderService();

    public void createOrder(int orderId, int userId) {
        Order order = new Order(orderId, userId);
        orderService.register(order);

    }

    public List<Order> getAllOrders() {
        return OrderRepository
    }
}
