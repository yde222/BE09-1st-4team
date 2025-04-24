package com.starfoxKiosk.user;

import com.starfoxKiosk.user.order.controller.OrderController;
import com.starfoxKiosk.user.order.domain.Order;
import com.starfoxKiosk.user.order.view.OrderView;

import java.util.List;

public class UserApplication {

    public static void main(String[] args) {

        OrderController orController = new OrderController();
        OrderView orView = new OrderView();

        orController.createOrder(1001,1);
        orController.createOrder(1002,2);

        List<Order> orders = orController.getAllOrders();



    }
}
