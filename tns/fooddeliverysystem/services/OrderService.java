package com.tns.fooddeliverysystem.services;

import com.tns.fooddeliverysystem.entities.*;

import java.util.*;

public class OrderService {
    private List<Order> orders = new ArrayList<>();
    private List<DeliveryPerson> deliveryPeople = new ArrayList<>();
    private int orderIdCounter = 1;
    private int deliveryIdCounter = 1;

    public Order placeOrder(Customer customer, String address) {
        Order order = new Order(orderIdCounter++, customer);
        for (Map.Entry<FoodItem, Integer> e : customer.getCart().getItems().entrySet()) {
            order.addItem(e.getKey(), e.getValue());
        }
        order.setDeliveryAddress(address);
        customer.getCart().getItems().clear(); // Empty cart
        orders.add(order);
        return order;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public DeliveryPerson addDeliveryPerson(String name, long contact) {
        DeliveryPerson dp = new DeliveryPerson(deliveryIdCounter++, name, contact);
        deliveryPeople.add(dp);
        return dp;
    }

    public List<DeliveryPerson> getDeliveryPeople() {
        return deliveryPeople;
    }

    public boolean assignDeliveryPersonToOrder(int orderId, int deliveryId) {
        for (Order o : orders) {
            if (o.getOrderId() == orderId) {
                for (DeliveryPerson dp : deliveryPeople) {
                    if (dp.getDeliveryPersonId() == deliveryId) {
                        o.setDeliveryPerson(dp);
                        o.setStatus("Assigned");
                        return true;
                    }
                }
            }
        }
        return false;
    }
}