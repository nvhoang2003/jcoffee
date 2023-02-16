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
    private int Booking_id;

    public Orders(int Order_id, int Customer_id, int Booking_id) {
        this.Order_id = Order_id;
        this.Customer_id = Customer_id;
        this.Booking_id = Booking_id;
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

    public int getBooking_id() {
        return Booking_id;
    }

    public void setBooking_id(int Booking_id) {
        this.Booking_id = Booking_id;
    }

    @Override
    public String toString() {
        return "Orders{" + "Order_id=" + Order_id + ", Customer_id=" + Customer_id + ", Booking_id=" + Booking_id + '}';
    }

    
}
