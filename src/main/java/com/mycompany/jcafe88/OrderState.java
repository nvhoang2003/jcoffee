/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.jcafe88;

/**
 *
 * @author Tcom
 */
public enum OrderState {
    PENDING(1, "Pending"), COMPLETED(2, "Completed"), CANCEL(3, "Cancel");
        
        private final int key;
        private final String value;
        
        private OrderState(int key, String value) {
            this.key = key;
            this.value = value;
        }
        
        public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static int getKeyByValue(String value) {
        for (OrderState b : values()) {
            if (b.value.equals(value)) {
                return b.getKey();
            }
        }
        return 0;
    }

    public static String getValueByKey(int value) {
        for (OrderState b : values()) {
            if (b.key == value) {
                return b.getValue();
            } 
        }
        return null;
    }
}
