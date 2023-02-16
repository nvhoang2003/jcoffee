/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.dao;

import com.mycompany.jcafe88.models.Booking;
import com.mycompany.jcafe88.models.Order_Drinks;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGUYEN DAT
 */
public class Order_DrinksDAO extends BaseDAO {

    public static List<Order_Drinks> list() {
        List<Order_Drinks> dataList = new ArrayList<>();

        openConnection();

        try {
            //thuc thi lenh
            String sql = "SELECT * FROM order_drinks";
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Order_Drinks order_drinks;
                order_drinks = new Order_Drinks(
                        resultSet.getInt("order_drinks_id"),
                        resultSet.getInt("order_drinks"),
                        resultSet.getInt("drink_id"),
                        resultSet.getInt("quantity"),
                        resultSet.getInt("price")
                );
                dataList.add(order_drinks);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Order_DrinksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();

        return dataList;
    }

    public static void insert(Order_Drinks order_drinks) {
        openConnection();

        String sql = "insert into order_drinks(quantity, price) value (?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, order_drinks.getQuantity());
            statement.setInt(2, order_drinks.getPrice());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Order_DrinksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void update(Order_Drinks order_drinks) {
        openConnection();

        String sql = "update order_drink set quantity = ?, price = ? where order_drinks_id";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, order_drinks.getQuantity());
            statement.setInt(2, order_drinks.getPrice());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Order_DrinksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void delete(int id) {
        openConnection();

        String sql = "delete from order_drink where id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static Order_Drinks find(int id) {
        Order_Drinks order_drinks = null;

        openConnection();

        try {
            //thuc thi lenh
            String sql = "select * from order_drink where id = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                order_drinks = new Order_Drinks(
                        resultSet.getInt("order_drink_id"),
                        resultSet.getInt("order_id"),
                        resultSet.getInt("drinks_id"),
                        resultSet.getInt("quantity"),
                        resultSet.getInt("price")
                );
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Order_DrinksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();

        return order_drinks;
    }
}
