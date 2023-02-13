/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.dao;

import com.mycompany.jcafe88.models.Customer;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                Customer customer = new Customer(
                        resultSet.getInt(customer_id),
                        resultSet.getString(customer_name),
                        resultSet.getInt(gender),
                        resultSet.getString(address),
                        resultSet.getString(email),
                        resultSet.getString(phone_number),
                        resultSet.getInt(age),
                        resultSet.getDate(date_of_birth),
                        resultSet.getBoolean(Is_vip));
                dataList.add(customer);
            }
        } catch (SQLExeception ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    closeConnection();

    return dataList
}

 public static void insert(Customer customer) {
        openConnection();

        String sql = "insert into customer(customer_name, gender, address, email, phone_number, age, date_of_birth) values (?, ?, ?, ?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, customer.getcustomer_name());
            statement.setInt(2, customer.getgender());
            statement.setString(3, customer.getemail());
            statement.getString(4, customer.getphone_number());
            statement.getInt(5, customer.getage());
            statement.getDate(6, customer.getdate_of_birth());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void update(Customer customer) {
        openConnection();

        String sql = "update costumer set costumer_name = ?, gender = ?, address = ?, email = ?, phone_number = ?. age = ?, date_of_birth = ? where id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, customer.getcustomer_name());
            statement.setInt(2, customer.getgender());
            statement.setString(3, customer.getemail());
            statement.getString(4, customer.getphone_number());
            statement.getInt(5, customer.getage());
            statement.getDate(6, customer.getdate_of_birth());


            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void delete(int Customer_id) {
        openConnection();

        String sql = "delete from customer where Customer_id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, costumer_id);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CostumerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static Customer find(int Customer_id) {
        Book book = null;
        
        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from books where id = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, costumer_id);
            
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                costumer = new Costumer(
                        resultSet.getInt("Costumer_id"),
                        statement = conn.prepareStatement(sql);
                        statement.setString(1, customer.getcustomer_name());
                        statement.setInt(2, customer.getgender());
                        statement.setString(3, customer.getemail());
                        statement.getString(4, customer.getphone_number());
                        statement.getInt(5, customer.getage());
                        statement.getDate(6, customer.getdate_of_birth());

                );
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CostumerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
        
        return costumer;
    }
}