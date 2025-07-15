package com.tns.fooddeliverysystem.application;

import com.tns.fooddeliverysystem.entities.*;
import com.tns.fooddeliverysystem.services.*;

import java.util.Scanner;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodService foodServices = new FoodService();
        CustomerService customerServices = new CustomerService();
        OrderService orderServices = new OrderService();

        while (true) {
            System.out.println("\n1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int mainChoice = sc.nextInt();
            sc.nextLine();

            switch (mainChoice) {
                case 1:
                    while (true) {
                        System.out.println("\n***** Admin Menu *****");
                        System.out.println("1. Add Restaurant");
                        System.out.println("2. Add Food Item to Restaurant");
                        System.out.println("3. Remove Food Item from Restaurant");
                        System.out.println("4. View Restaurants and Menus");
                        System.out.println("5. View Orders");
                        System.out.println("6. Add Delivery Person");
                        System.out.println("7. Assign Delivery Person to Order");
                        System.out.println("8. Exit");
                        System.out.print("Enter your choice: ");
                        int adminChoice = sc.nextInt();
                        sc.nextLine();

                        if (adminChoice == 8) break;

                        switch (adminChoice) {
                            case 1:
                                System.out.print("Enter restaurant name: ");
                                String rname = sc.nextLine();
                                Restaurant rest = foodServices.addRestaurant(rname);
                                System.out.println("Added: " + rest);
                                break;
                            case 2:
                                System.out.print("Restaurant ID: ");
                                int rid = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Food name: ");
                                String fname = sc.nextLine();
                                System.out.print("Price: ");
                                double fprice = sc.nextDouble();
                                foodServices.addFoodItemToRestaurant(rid, fname, fprice);
                                break;
                            case 3:
                                System.out.print("Restaurant ID: ");
                                rid = sc.nextInt();
                                System.out.print("Food ID: ");
                                int fid = sc.nextInt();
                                foodServices.removeFoodItemFromRestaurant(rid, fid);
                                break;
                            case 4:
                                for (Restaurant r : foodServices.getRestaurants()) {
                                    System.out.println(r + ":");
                                    for (FoodItem fi : r.getMenu()) {
                                        System.out.println("   " + fi);
                                    }
                                }
                                break;
                            case 5:
                                for (Order o : orderServices.getOrders()) {
                                    System.out.println(o);
                                    System.out.println("------------------------");
                                }
                                break;
                            case 6:
                                System.out.print("Name: ");
                                String dname = sc.nextLine();
                                System.out.print("Contact: ");
                                long dcontact = sc.nextLong();
                                DeliveryPerson dp = orderServices.addDeliveryPerson(dname, dcontact);
                                System.out.println("Added: " + dp);
                                break;
                            case 7:
                                System.out.print("Order ID: ");
                                int oid = sc.nextInt();
                                System.out.print("Delivery Person ID: ");
                                int did = sc.nextInt();
                                boolean assigned = orderServices.assignDeliveryPersonToOrder(oid, did);
                                System.out.println(assigned ? "Assigned successfully" : "Assignment failed");
                                break;
                        }
                    }
                    break;

                case 2:
                    Customer customer = null;
                    while (true) {
                        System.out.println("\n***** Customer Menu *****");
                        System.out.println("1. Add Customer");
                        System.out.println("2. View Food Items");
                        System.out.println("3. Add Food to Cart");
                        System.out.println("4. View Cart");
                        System.out.println("5. Place Order");
                        System.out.println("6. View Orders");
                        System.out.println("7. Exit");
                        System.out.print("Enter your choice: ");
                        int custChoice = sc.nextInt();
                        sc.nextLine();

                        if (custChoice == 7) break;

                        switch (custChoice) {
                            case 1:
                                System.out.print("Name: ");
                                String cname = sc.nextLine();
                                System.out.print("Contact: ");
                                long ccontact = sc.nextLong();
                                customer = customerServices.addCustomer(cname, ccontact);
                                System.out.println("Welcome, " + customer.getUsername());
                                break;
                            case 2:
                                for (FoodItem fi : foodServices.getAllFoodItems()) {
                                    System.out.println(fi);
                                }
                                break;
                            case 3:
                                if (customer == null) {
                                    System.out.println("Please register first.");
                                    break;
                                }
                                System.out.print("Food ID: ");
                                int fid = sc.nextInt();
                                System.out.print("Quantity: ");
                                int qty = sc.nextInt();
                                for (FoodItem fi : foodServices.getAllFoodItems()) {
                                    if (fi.getId() == fid) {
                                        customer.getCart().addItem(fi, qty);
                                        System.out.println("Added to cart.");
                                    }
                                }
                                break;
                            case 4:
                                if (customer != null) {
                                    System.out.println(customer.getCart());
                                }
                                break;
                            case 5:
                                if (customer == null) {
                                    System.out.println("Please register first.");
                                    break;
                                }
                                System.out.print("Delivery Address: ");
                                String addr = sc.nextLine();
                                Order o = orderServices.placeOrder(customer, addr);
                                System.out.println("Order Placed: " + o.getOrderId());
                                break;
                            case 6:
                                for (Order o2 : orderServices.getOrders()) {
                                    if (o2.getCustomer() == customer)
                                        System.out.println(o2);
                                }
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}