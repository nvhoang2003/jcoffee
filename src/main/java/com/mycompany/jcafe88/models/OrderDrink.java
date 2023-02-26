/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.models;

import com.mycompany.jcafe88.dao.DrinksDAO;

/**
 *
 * @author Tcom
 */
public class OrderDrink {
    private int order_drink_id;
    private int order_id;
    private int drink_id;
    private int quantity;
    private int price;
    private String drink_name;

    public String getDrink_name() {
        return drink_name;
    }

    public void setDrink_name(String drink_name) {
        this.drink_name = drink_name;
    }

    public OrderDrink(int order_drink_id, int order_id, int drink_id, int quantity, int price, String drink_name) {
        this.order_drink_id = order_drink_id;
        this.order_id = order_id;
        this.drink_id = drink_id;
        this.quantity = quantity;
        this.price = price;
        this.drink_name = drink_name;
    }

    public OrderDrink(int order_drink_id, int order_id, int drink_id, int quantity, int price) {
        this.order_drink_id = order_drink_id;
        this.order_id = order_id;
        this.drink_id = drink_id;
        this.quantity = quantity;
        this.price = price;
    }
    
     public OrderDrink( int order_id, int drink_id, int quantity, int price) {
        this.order_id = order_id;
        this.drink_id = drink_id;
        this.quantity = quantity;
        this.price = price;
    }

    public OrderDrink() {
    }

    public int getOrder_drink_id() {
        return order_drink_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public int getDrink_id() {
        return drink_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setOrder_drink_id(int order_drink_id) {
        this.order_drink_id = order_drink_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public void setDrink_id(int drink_id) {
        this.drink_id = drink_id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return drink_name + " x " + quantity;
    }
}
