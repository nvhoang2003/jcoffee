/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.jcafe88;

/**
 *
 * @author Tcom
 */
public enum BookingState {
    USEABLE(1, "useable"), UNUSEABLE(5, "unuseable");

    private final int key;
    private final String value;

    private BookingState(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static BookingState getBookingStateByValue(String value) {
        for (BookingState b : values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }

    public static BookingState getBookingStateByKey(int value) {
        for (BookingState b : values()) {
            if (b.key == value) {
                return b;
            } 
        }
        return null;
    }
}
