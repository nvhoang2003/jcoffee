/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.models;

/**
 *
 * @author NGUYEN DAT
 */
public class Order_Drinks {
    private int Order_Drinks_ID;
    private int Order_ID;
    private int Drinks_ID;
    private int Quantity;
    private int price;
    
    public Order_Drinks(){
        
    }

    public Order_Drinks(int Order_Drinks_ID, int Order_ID, int Drinks_ID, int Quantity, int price) {
        this.Order_Drinks_ID = Order_Drinks_ID;
        this.Order_ID = Order_ID;
        this.Drinks_ID = Drinks_ID;
        this.Quantity = Quantity;
        this.price = price;
    }
    
    

    public int getOrder_Drinks_ID() {
        return Order_Drinks_ID;
    }

    public void setOrder_Drinks_ID(int Order_Drinks_ID) {
        this.Order_Drinks_ID = Order_Drinks_ID;
    }

    public int getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(int Order_ID) {
        this.Order_ID = Order_ID;
    }

    public int getDrinks_ID() {
        return Drinks_ID;
    }

    public void setDrinks_ID(int Drinks_ID) {
        this.Drinks_ID = Drinks_ID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
