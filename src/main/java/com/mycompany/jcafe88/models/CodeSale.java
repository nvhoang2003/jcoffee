/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.models;

/**
 *
 * @author Tcom
 */
public class CodeSale {
    private int code_sale_id;
    private String name;
    private int sale_off;
    private String Code;

    public int getCode_sale_id() {
        return code_sale_id;
    }

    public String getName() {
        return name;
    }

    public int getSale_off() {
        return sale_off;
    }

    public void setCode_sale_id(int code_sale_id) {
        this.code_sale_id = code_sale_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSale_off(int sale_off) {
        this.sale_off = sale_off;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getCode() {
        return Code;
    }

    public CodeSale() {
    }

    public CodeSale(int code_sale_id, String name, int sale_off, String Code) {
        this.code_sale_id = code_sale_id;
        this.name = name;
        this.sale_off = sale_off;
        this.Code = Code;
    }
    

    public CodeSale(String name, int sale_off, String Code) {
        this.name = name;
        this.sale_off = sale_off;
        this.Code = Code;
    }

    
    @Override
    public String toString() {
        return "CodeSale{" + "code_sale_id=" + code_sale_id + ", name=" + name + ", sale_off=" + sale_off + ", Code=" + Code + '}';
    }
    
    
}
