/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.models;

/**
 *
 * @author Admin
 */
public class Orders {
    private int Order_id;
    private int Customer_id;
    private int table_id;
    private String customer_name;
    private String table_name;
    private String state;

    public Orders(int Customer_id, int table_id, String customer_name, String table_name, String state) {
        this.Customer_id = Customer_id;
        this.table_id = table_id;
        this.customer_name = customer_name;
        this.table_name = table_name;
        this.state = state;
    }

    public Orders(int Order_id, int Customer_id, int table_id, String customer_name, String table_name, String state) {
        this.Order_id = Order_id;
        this.Customer_id = Customer_id;
        this.table_id = table_id;
        this.customer_name = customer_name;
        this.table_name = table_name;
        this.state = state;
    }
    
    
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public int getTable_id() {
        return table_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getTable_name() {
        return table_name;
    }

    public Orders(int Customer_id, int table_id) {
        this.Customer_id = Customer_id;
        this.table_id = table_id;
    }

    public Orders(int Order_id, int Customer_id, int table_id, String customer_name, String table_name) {
        this.Order_id = Order_id;
        this.Customer_id = Customer_id;
        this.table_id = table_id;
        this.customer_name = customer_name;
        this.table_name = table_name;
    }

    
    
    public int getOrder_id() {
        return Order_id;
    }

    public void setOrder_id(int Order_id) {
        this.Order_id = Order_id;
    }

    public int getCustomer_id() {
        return Customer_id;
    }

    public void setCustomer_id(int Customer_id) {
        this.Customer_id = Customer_id;
    }
}
