package com.tns.fooddeliverysystem.services;

import com.tns.fooddeliverysystem.entities.*;

import java.util.*;

public class FoodService {
    private List<Restaurant> restaurants = new ArrayList<>();
    private int restaurantIdCounter = 1;
    private int foodIdCounter = 1;

    public Restaurant addRestaurant(String name) {
        Restaurant r = new Restaurant(restaurantIdCounter++, name);
        restaurants.add(r);
        return r;
    }

    public void addFoodItemToRestaurant(int restId, String foodName, double price) {
        for (Restaurant r : restaurants) {
            if (r.getId() == restId) {
                r.addFoodItem(new FoodItem(foodIdCounter++, foodName, price));
            }
        }
    }

    public void removeFoodItemFromRestaurant(int restId, int foodId) {
        for (Restaurant r : restaurants) {
            if (r.getId() == restId) {
                r.removeFoodItem(foodId);
            }
        }
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public List<FoodItem> getAllFoodItems() {
        List<FoodItem> items = new ArrayList<>();
        for (Restaurant r : restaurants) {
            items.addAll(r.getMenu());
        }
        return items;
    }
}