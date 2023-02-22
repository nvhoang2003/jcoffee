/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.models;

/**
 *
 * @author Admin
 */
public class Drinks {
    private int id;
    private String name;
    private int price;
    private String Description;
    private byte[] Image;

    public Drinks(int id, String name, int price, String Description, byte[] Image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.Description = Description;
        this.Image = Image;
    }

    public Drinks(String name, int price, String Description, byte[] Image) {
        this.name = name;
        this.price = price;
        this.Description = Description;
        this.Image = Image;
    }

    public Drinks(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setImage(byte[] Image) {
        this.Image = Image;
    }

    @Override
    public String toString() {
        return "Drinks{" + "id=" + id + ", name=" + name + ", price=" + price + ", Description=" + Description + '}';
    }
    
}
