package com.tns.fooddeliverysystem.services;

import com.tns.fooddeliverysystem.entities.*;

import java.util.*;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();
    private int customerIdCounter = 1;

    public Customer addCustomer(String name, long contact) {
        Customer customer = new Customer(customerIdCounter++, name, contact);
        customers.add(customer);
        return customer;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomerById(int id) {
        for (Customer c : customers) {
            if (c.getUserId() == id)
                return c;
        }
        return null;
    }
}