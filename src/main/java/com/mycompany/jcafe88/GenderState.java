/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.jcafe88;



/**
 *
 * @author NGUYEN DAT
 */
public enum GenderState {
        NONGENDER(0, "Please enter your gender."), MALE(1, "Male"), FEMALE(2, "Female");
        
        private final int key;
        private final String value;
        
        private GenderState(int key, String value) {
            this.key = key;
            this.value = value;
        }
        
        public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static GenderState getGenderStateByValue(String value) {
        for (GenderState b : values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }

    public static GenderState getGenderStateByKey(int value) {
        for (GenderState b : values()) {
            if (b.key == value) {
                return b;
            } 
        }
        return null;
    }
    
}
