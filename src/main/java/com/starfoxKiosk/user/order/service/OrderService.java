package com.starfoxKiosk.user.order.service;

import com.starfoxKiosk.user.order.domain.Order;
import com.starfoxKiosk.user.order.repository.OrderRepository;

import java.util.List;

public class OrderService {

    private final OrderRepository orderRepository = new OrderRepository();

    public void register(Order order) {
        orderRepository.registerOrder(order);
    }




}
