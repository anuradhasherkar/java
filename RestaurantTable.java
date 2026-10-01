package com.sunbeam;

public class RestaurantTable {

    private int tableNumber;
    private int capacity;
    private double price;

    private Customer customer;

    public RestaurantTable(int tableNumber, int capacity, double price) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.price = price;
        this.customer = null;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isReserved() {
        return customer != null;
    }

    @Override
    public String toString() {
        return "Table Number: " + tableNumber +", Capacity: " + capacity +", Price: " + price;
    }


	}

