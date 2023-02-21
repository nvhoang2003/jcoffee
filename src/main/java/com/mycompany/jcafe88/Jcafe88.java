/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.jcafe88;

import com.mycompany.jcafe88.dao.AdminDAO;
import com.mycompany.jcafe88.models.Admin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tcom
 */
public class Jcafe88 {

    public static void main(String[] args) {
        AdminDAO bd = new AdminDAO();

        List<Admin> list1 = bd.list();
        if (list1 == null) {
            System.out.println("NOt round");
        } else {
            System.out.println(list1);
        }
        
        Admin admin = new Admin("hoang", "admin02", "1234678");
        bd.insert(admin);
        
        System.out.println(bd.login("hoang", "1234678"));
    }
}
