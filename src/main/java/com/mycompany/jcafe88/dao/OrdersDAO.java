/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.dao;

import com.mycompany.jcafe88.GenderState;
import com.mycompany.jcafe88.OrderState;
import static com.mycompany.jcafe88.dao.BaseDAO.closeConnection;
import static com.mycompany.jcafe88.dao.BaseDAO.conn;
import static com.mycompany.jcafe88.dao.BaseDAO.openConnection;
import static com.mycompany.jcafe88.dao.BaseDAO.statement;
import com.mycompany.jcafe88.models.Bill;
import com.mycompany.jcafe88.models.Orders;
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

    public static List<Orders> ListOrder() {
        List<Orders> list = new ArrayList<>();
         String sql = "SELECT o.*, c.customer_name as customer_name, t.name as table_name "
                + "FROM orders as o "
                + "JOIN customers as c ON o.customer_id = c.customer_id "
                + "JOIN tables as t ON o.table_id = t.table_id ";
//                + "WHERE o.state = ?";
        openConnection();
        try {
            statement = conn.prepareStatement(sql);
//            statement.setInt(1,OrderState.getKeyByValue("Pending"));
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Orders orders = new Orders(rs.getInt("order_id"), rs.getInt("customer_id"), rs.getInt("table_id"), rs.getString("customer_name"), rs.getString("table_name"), OrderState.getValueByKey(rs.getInt("state")));
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

        String sql = "insert into orders(customer_id, table_id, state) values (?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, orders.getCustomer_id());
            statement.setInt(2, orders.getTable_id());
            statement.setInt(3,OrderState.getKeyByValue("Pending"));
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void update(Orders orders) {
        openConnection();

        String sql = "update set orders set (order_id,customer_id, amount,) values (?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, orders.getOrder_id());
            statement.setInt(2, orders.getCustomer_id());
//            statement.setInt(3, orders.getAmount());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static Orders find(int id) {
        Orders orders = null;
        
        String sql = "SELECT o.*, c.customer_name as customer_name, t.name as table_name "
                + "FROM orders as o "
                + "JOIN customers as c ON o.customer_id = c.customer_id "
                + "JOIN tables as t ON o.table_id = t.table_id "
                + "WHERE order_id = ?";

        openConnection();

        try {
            //Thuc thi lenh
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                orders = new Orders(
                        rs.getInt("order_id"), rs.getInt("customer_id"), rs.getInt("table_id"), rs.getString("customer_name"), rs.getString("table_name"), OrderState.getValueByKey(rs.getInt("state"))
                );
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
        return orders;
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
    
    public static int findCustomer_ID(String cus_name) {
        int cus_id = 0;

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select customer_id from customers where customer_name = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, cus_name);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                cus_id = rs.getInt("customer_id");
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
        return cus_id;
    }
    
    public static int findTable_id(String table_name) {
        int table_id = 0;
        
        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select table_id from tables where name = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, table_name);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                table_id = rs.getInt("table_id");
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
        return table_id;
    }
    
     public static String findAllInfor(int id) {
        String str = "";

        String sql = "SELECT od.quantity as quantity, d.name as drink_name " 
                    + "FROM orders as o " 
                    + "JOIN order_drinks as od ON o.order_id = od.order_id "
                    + "JOIN drinks as d ON od.drink_id = d.drink_id "
                    + "WHERE o.order_id = ?" ; 
        openConnection();

        try {
            //Thuc thi lenh
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                System.out.println("wth");
                str += result.getString("drink_name") + " x " + result.getString("quantity");
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
        return str;
    }
     
     public static List<Bill> ListPendingOrder() {
        List<Bill> list = new ArrayList<>();
         String sql = "SELECT o.price as price,o.order_id as order_id, c.customer_name as customer_name, t.name as table_name, SUM(od.price) as amount "
                + "FROM orders as o "
                + "JOIN customers as c ON o.customer_id = c.customer_id "
                + "JOIN tables as t ON o.table_id = t.table_id "
                + "JOIN order_drinks as od ON o.order_id = od.order_id "
                + "GROUP BY od.order_id "
                + "WHERE o.state = ? ";
        openConnection();
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1,OrderState.getKeyByValue("Pending"));
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Bill bill = new Bill(rs.getInt("order_id"), rs.getInt("price"), rs.getString("customer_name"), rs.getString("table_name"));
                list.add(bill);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return list;
    }
}
