package com.mycompany.jcafe88.models;


import java.sql.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tcom
 */
public class BookingCustomer {
    private int booking_customer_id;
    private int booking_id;
    private int customer_id;
    private Date book_date;
    private int time_out;

    public BookingCustomer(int booking_customer_id, int booking_id, int customer_id, Date book_date, int time_out) {
        this.booking_customer_id = booking_customer_id;
        this.booking_id = booking_id;
        this.customer_id = customer_id;
        this.book_date = book_date;
        this.time_out = time_out;
    }

    public BookingCustomer() {
    }

    public int getBooking_customer_id() {
        return booking_customer_id;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public Date getBook_date() {
        return book_date;
    }

    public int getTime_out() {
        return time_out;
    }

    public void setBooking_customer_id(int booking_customer_id) {
        this.booking_customer_id = booking_customer_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setBook_date(Date book_date) {
        this.book_date = book_date;
    }

    public void setTime_out(int time_out) {
        this.time_out = time_out;
    }

    @Override
    public String toString() {
        return "BookingCustomer{" + "booking_customer_id=" + booking_customer_id + ", booking_id=" + booking_id + ", customer_id=" + customer_id + ", book_date=" + book_date + ", time_out=" + time_out + '}';
    }
}
