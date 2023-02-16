/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.dao;

import static com.mycompany.jcafe88.dao.BaseDAO.closeConnection;
import static com.mycompany.jcafe88.dao.BaseDAO.conn;
import static com.mycompany.jcafe88.dao.BaseDAO.openConnection;
import static com.mycompany.jcafe88.dao.BaseDAO.statement;
import com.mycompany.jcafe88.models.Drinks;
import com.mycompany.jcafe88.models.Orders;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class OrdersDAO extends BaseDAO {

    private static OrdersDAO instance;

    public OrdersDAO() {
    }

    public static OrdersDAO getInstance() {
        if (instance == null) {
            instance = new OrdersDAO();
        }
        return instance;
    }

    public List<Orders> ListOrder(int id) {
        List<Orders> list = new ArrayList<Orders>();
        openConnection();
        try {
            String sql = ("SELECT * FROM orders");
            statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Orders orders = new Orders(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                list.add(orders);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return list;
    }
    public static void insert(Orders orders) {
        openConnection();

        String sql = "insert into orders(Order_id, Customer_id, Booking_id,) values (?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, orders.getOrder_id());
            statement.setInt(2, orders.getCustomer_id());
            statement.setInt(3, orders.getBooking_id());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void update(Orders orders) {
        openConnection();

        String sql = "update set orders set (Order_id, Customer_id, Booking_id,) values (?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, orders.getOrder_id());
            statement.setInt(2, orders.getCustomer_id());
            statement.setInt(3, orders.getBooking_id());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static Orders find(int id) {
        Orders orders = null;

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from orders where id = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                orders = new Orders(
                        resultSet.getInt("Order_id"),
                        resultSet.getInt("Customer_id"),
                        resultSet.getInt("Booking_id")
                );
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
        return null;
    }

    public static void delete(int id) {
        openConnection();

        String sql = "delete from orders where id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }
}
