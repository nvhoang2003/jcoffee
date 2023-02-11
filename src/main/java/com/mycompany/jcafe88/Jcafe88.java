/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.jcafe88;

import com.mycompany.jcafe88.models.Booking;
import com.mycompany.jcafe88.dao.BookingDAO;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Tcom
 */
public class Jcafe88 {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        BookingDAO bd = new BookingDAO();
         
        List<Booking> list = bd.list();
        if (list == null) {
            System.out.println("NOt round");
        } else {
            System.out.println(list);
        }
    }
}
