
package com.tns.fooddeliverysystem.entities;

import java.util.*;

public class Cart {
    private Map<FoodItem, Integer> items;

    public Cart() {
        items = new HashMap<>();
    }

    public void addItem(FoodItem foodItem, int quantity) {
        items.put(foodItem, items.getOrDefault(foodItem, 0) + quantity);
    }

    public void removeItem(FoodItem foodItem) {
        items.remove(foodItem);
    }

    public Map<FoodItem, Integer> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<FoodItem, Integer> entry : items.entrySet()) {
            sb.append(entry.getKey()).append(" x ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}