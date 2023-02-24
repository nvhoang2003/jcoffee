/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.models;

/**
 *
 * @author Tcom
 */
public class Table {
    private int table_id;
    private String name;
    private int seat_count;
    private boolean is_useable;

    public Table() {
    }

    public Table(int table_id, String name, int seat_count, boolean is_useable) {
        this.table_id = table_id;
        this.name = name;
        this.seat_count = seat_count;
        this.is_useable = is_useable;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeat_count(int seat_count) {
        this.seat_count = seat_count;
    }

    public void setIs_useable(boolean is_useable) {
        this.is_useable = is_useable;
    }

    public int getTable_id() {
        return table_id;
    }

    public String getName() {
        return name;
    }

    public int getSeat_count() {
        return seat_count;
    }

    public boolean getIs_useable() {
        return is_useable;
    }

    public Table(String name, int seat_count, boolean is_useable) {
        this.name = name;
        this.seat_count = seat_count;
        this.is_useable = is_useable;
    }
}
