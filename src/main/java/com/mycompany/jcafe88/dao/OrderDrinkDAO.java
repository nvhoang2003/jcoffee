/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.dao;

import com.mycompany.jcafe88.models.OrderDrink;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tcom
 */
public class OrderDrinkDAO extends BaseDAO {

    public static List<OrderDrink> list() {
        List<OrderDrink> dataList = new ArrayList<>();

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from order_drinks";
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                OrderDrink order_drink;
                order_drink = new OrderDrink(
                        resultSet.getInt("order_drink_id"),
                        resultSet.getInt("order_id"),
                        resultSet.getInt("drink_id"),
                        resultSet.getInt("quantity"),
                        resultSet.getInt("price")
                );
                dataList.add(order_drink);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderDrinkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return dataList;
    }

    public static void insert(OrderDrink order_drink) {
        openConnection();

        String sql = "insert into order_drinks(order_id, drink_id, quantity, price) values (?, ?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, order_drink.getOrder_id());
            statement.setInt(2, order_drink.getDrink_id());
            statement.setInt(3, order_drink.getQuantity());
            statement.setInt(4, order_drink.getPrice());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDrinkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void update(OrderDrink order_drink) {
        openConnection();

        String sql = "update order_drinks set order_id = ?, drink_id = ?, quantity = ?, price = ? where order_drink_id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, order_drink.getOrder_id());
            statement.setInt(2, order_drink.getDrink_id());
            statement.setInt(3, order_drink.getQuantity());
            statement.setInt(4, order_drink.getPrice());
            statement.setInt(4, order_drink.getOrder_drink_id());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDrinkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void delete(int id) {
        openConnection();

        String sql = "delete from order_drinks where id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDrink.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static OrderDrink find(int id) {
        OrderDrink order_drink = null;

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from order_drinks where id = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                order_drink = new OrderDrink(
                        resultSet.getInt("order_drink_id"),
                        resultSet.getInt("order_id"),
                        resultSet.getInt("drink_id"),
                        resultSet.getInt("quantity"),
                        resultSet.getInt("price")
                );
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderDrinkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return order_drink;
    }
}
