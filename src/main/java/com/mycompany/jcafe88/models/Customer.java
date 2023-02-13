/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.models;

import java.util.Date;

/**
 *
 * @author NGUYEN DAT
 */
public class Customer {
        private String customer_name, address, email, phone_number;
    private int customer_id, gender, age;
    private Date date_of_birth;
    private Boolean Is_vip;

    public Customer(){
  
    }
    
    public Customer(int customer_id, String customer_name, int gender, String address, String email, String phone_number, int age, Date date_of_birth, Boolean Is_vip){
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.phone_number = phone_number;
        this.age = age;
        this.date_of_birth = date_of_birth;
        this.Is_vip = Is_vip;
    }
    
    public String getCustomer_name(String string) {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getCustomer_id(String string) {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Boolean getIs_vip() {
        return Is_vip;
    }

    public void setIs_vip(Boolean Is_vip) {
        this.Is_vip = Is_vip;
    }

}
