package com.sunbeam;


public class Customer {
    private int customerId;
    private String customerName;
    private String contactNumber;

    private RestaurantTable reservedTable;

    public Customer(int customerId, String customerName, String contactNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.reservedTable = null;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public RestaurantTable getReservedTable() {
        return reservedTable;
    }

    public void setReservedTable(RestaurantTable reservedTable) {
        this.reservedTable = reservedTable;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + customerName +", Contact: " + contactNumber;
    }
}
