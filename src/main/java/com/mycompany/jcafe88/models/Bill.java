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
    private final int bill_id;
    private final int customer_id;
    private final Date time_pay;
    private final int amount;
    private final int amount_after_sale;
    private final int order_id;
    private final int code_sale_id;

    public Bill(int bill_id, int customer_id, Date time_pay, int amount, int amount_after_sale, int order_id, int code_sale_id) {
        this.bill_id = bill_id;
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
