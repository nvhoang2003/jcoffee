/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.models;

import com.mycompany.jcafe88.BookingState;

/**
 *
 * @author Tcom
 */
public class Booking {

    private int bookingId;
    private String name;
    private int seatCount;
    private BookingState state;

    public Booking() {
    }

    public Booking(int bookingId, String name, int seatCount, BookingState state) {
        this.bookingId = bookingId;
        this.name = name;
        this.seatCount = seatCount;
        this.state = state;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getName() {
        return name;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public BookingState getState() {
        return state;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public void setState(BookingState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Booking{" + "bookingId=" + bookingId + ", name=" + name + ", seatCount=" + seatCount + ", state=" + state + '}';
    }
}
