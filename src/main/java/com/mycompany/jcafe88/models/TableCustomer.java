/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.models;

/**
 *
 * @author Tcom
 */
public class TableCustomer {
    private int table_customer_id;
    private int table_id;
    private int customer_id;

    public TableCustomer() {
    }

    public TableCustomer(int table_customer_id, int table_id, int customer_id) {
        this.table_customer_id = table_customer_id;
        this.table_id = table_id;
        this.customer_id = customer_id;
    }

    public int getTable_customer_id() {
        return table_customer_id;
    }

    public int getTable_id() {
        return table_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setTable_customer_id(int table_customer_id) {
        this.table_customer_id = table_customer_id;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
}
