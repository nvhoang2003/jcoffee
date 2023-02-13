/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jcafe88;

/**
 *
 * @author Tcom
 */
import DAO.DrinksDAO;
import DTO.Drinks;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

public class Jcafe88 {

    public static void main(String[] args) {
        DrinksDAO dr = new DrinksDAO();

        List<Drinks> list1 = dr.list();
        if (list1 == null) {
            System.out.println("Not round");
        } else {
            boolean list = false;
            System.out.println(list);
            System.out.println(list1);
        }
    }
}

