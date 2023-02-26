/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.models;

import java.sql.Date;

/**
 *
 * @author ACER
 */
public class Bill {

    private int bill_id;
    private int customer_id;
    private Date time_pay;
    private int amount;
    private int amount_after_sale;
    private int order_id;
    private int code_sale_id;
    private String customer_name;
    private String table_name;

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public Bill(int bill_id, int amount, String customer_name, String table_name) {
        this.bill_id = bill_id;
        this.amount = amount;
        this.customer_name = customer_name;
        this.table_name = table_name;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setTime_pay(Date time_pay) {
        this.time_pay = time_pay;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setAmount_after_sale(int amount_after_sale) {
        this.amount_after_sale = amount_after_sale;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public void setCode_sale_id(int code_sale_id) {
        this.code_sale_id = code_sale_id;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public Bill(int bill_id, int customer_id, Date time_pay, int amount, int amount_after_sale, int order_id, int code_sale_id) {
        this.bill_id = bill_id;
        this.customer_id = customer_id;
        this.time_pay = time_pay;
        this.amount = amount;
        this.amount_after_sale = amount_after_sale;
        this.order_id = order_id;
        this.code_sale_id = code_sale_id;
    }

    public Bill(int customer_id, Date time_pay, int amount, int amount_after_sale, int order_id, int code_sale_id) {
        this.customer_id = customer_id;
        this.time_pay = time_pay;
        this.amount = amount;
        this.amount_after_sale = amount_after_sale;
        this.order_id = order_id;
        this.code_sale_id = code_sale_id;
    }
    
    

    public int getBill_id() {
        return bill_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public Date getTime_pay() {
        return time_pay;
    }

    public int getAmount() {
        return amount;
    }

    public int getAmount_after_sale() {
        return amount_after_sale;
    }

    public int getOrder_id() {
        return order_id;
    }

    public int getCode_sale_id() {
        return code_sale_id;
    }

    @Override
    public String toString() {
        return "Bill{" + "bill_id=" + bill_id + ", customer_id=" + customer_id + ", time_pay=" + time_pay + ", amount=" + amount + ", amount_after_sale=" + amount_after_sale + ", order_id=" + order_id + ", code_sale_id=" + code_sale_id + '}';
    }

}
