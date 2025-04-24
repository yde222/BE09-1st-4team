package com.starfoxKiosk.user.order.domain;

public class Order {

    private int orderId;
    private int userId;

    public Order() {
    }

    public Order(int orderId, int userId) {
        this.orderId = orderId;
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return userId;
    }

    public void setCustomerId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                '}';
    }



}
