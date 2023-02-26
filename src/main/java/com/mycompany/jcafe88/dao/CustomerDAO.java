/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.dao;

import com.mycompany.jcafe88.models.Customer;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;

/**
 *
 * @author NGUYEN DAT
 */
public class CustomerDAO extends BaseDAO {

    public static List<Customer> list() {
        List<Customer> dataList = new ArrayList<>();

        openConnection();

        try {
            //thuc thi lenh
            String sql = "select * from customers";
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Customer customer;
                customer = new Customer(
                        resultSet.getInt("customer_id"),
                        resultSet.getString("customer_name"),
                        resultSet.getString("address"),
                        resultSet.getString("email"),
                        resultSet.getString("phone_number"),
                        resultSet.getInt("gender"),
                        resultSet.getInt("age"),
                        resultSet.getDate("date_of_birth"),
                        resultSet.getBoolean("is_vip"));
                dataList.add(customer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();

        return dataList;
    }

    public static void insert(Customer customer) {
        openConnection();

        String sql = "insert into customers(customer_name, gender, address, email, phone_number, age, date_of_birth, is_vip) values (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, customer.getCustomer_name());
            statement.setInt(2, customer.getGender());
            statement.setString(3, customer.getAddress());
            statement.setString(4, customer.getEmail());
            statement.setString(5, customer.getPhone_number());
            statement.setInt(6, customer.getAge());
            statement.setDate(7, new java.sql.Date(customer.getDate_of_birth().getTime()));
            statement.setBoolean(8, customer.getIs_vip());

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void update(Customer customer) {
        openConnection();

        String sql = "update customers set customer_name = ?, gender = ?, address = ?, email = ?, phone_number = ?, age = ?, date_of_birth = ?, is_vip = ? where customer_id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, customer.getCustomer_name());
            statement.setInt(2, customer.getGender());
            statement.setString(3, customer.getAddress());
            statement.setString(4, customer.getEmail());
            statement.setString(5, customer.getPhone_number());
            statement.setInt(6, customer.getAge());
            statement.setDate(7, new java.sql.Date(customer.getDate_of_birth().getTime()));
            statement.setBoolean(8, customer.getIs_vip());
            statement.setInt(9, customer.getCustomer_id());

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void delete(int Customer_id) {
        openConnection();

        String sql = "delete from customers where customer_id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, Customer_id);

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static Customer find(int Customer_id) {
        Customer customer = null;

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from customers where customer_id = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, Customer_id);

            ResultSet resultSet = statement.executeQuery();

            statement = conn.prepareStatement(sql);

            while (resultSet.next()) {
                customer = new Customer(
                        resultSet.getInt("customer_id"),
                        resultSet.getString("customer_name"),
                        resultSet.getString("address"),
                        resultSet.getString("email"),
                        resultSet.getString("phone_number"),
                        resultSet.getInt("gender"),
                        resultSet.getInt("age"),
                        resultSet.getDate("date_Of_Birth"),
                        resultSet.getBoolean("is_vip")
                );
                break;

            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return customer;
    }
    
    public static boolean findCustomer_ID(String cus_name) {
        boolean b = false;

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select customer_id from customers where customer_name = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, cus_name);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
               b = true;
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
        return b;
    }
}

