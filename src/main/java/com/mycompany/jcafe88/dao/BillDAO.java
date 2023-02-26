/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.dao;

import com.mycompany.jcafe88.models.Bill;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class BillDAO extends BaseDAO {

    public static List<Bill> list() {
        List<Bill> dataList = new ArrayList<>();

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from bills";
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Bill bill;
                bill = new Bill(
                        resultSet.getInt("bill_id"),
                        resultSet.getInt("customer_id"),
                        resultSet.getDate("time_pay"),
                        resultSet.getInt("amount"),
                        resultSet.getInt("amount_after_sale"),
                        resultSet.getInt("order_id"),
                        resultSet.getInt("code_sale_id")
                );
                dataList.add(bill);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return dataList;
    }

    public static void insert(Bill bill) {
        openConnection();

        String sql = "insert into bills(time_pay, amount, amount_after_sale, code_sale_id) values (?, ?, ?, ? )";
        try {
            statement = conn.prepareStatement(sql);
            statement.setDate(1, bill.getTime_pay());
            statement.setInt(2, bill.getAmount());
            statement.setInt(3, bill.getAmount_after_sale());
            statement.setInt(3, bill.getCode_sale_id());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void update(Bill bill) {
        openConnection();

        String sql = "update Bills set time_pay, amount, amount_after_sale, code_sale_id) values (?, ?, ?, ? ) where Bill_id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setDate(1, bill.getTime_pay());
            statement.setInt(2, bill.getAmount());
            statement.setInt(3, bill.getAmount_after_sale());
            statement.setInt(3, bill.getCode_sale_id());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static Bill find(int id) {
        Bill Bill = null;

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from bills where id = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Bill = new Bill(
                        resultSet.getInt("bill_id"),
                        resultSet.getInt("customer_id"),
                        resultSet.getDate("time_pay"),
                        resultSet.getInt("amount"),
                        resultSet.getInt("amount_after_sale"),
                        resultSet.getInt("order_id"),
                        resultSet.getInt("code_sale_id")
                );
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return Bill;
    }

    
     public static int find_stas(Date a, Date b) {
        int amount = 0;

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select SUM(bills.amount) as sum from bills where bills.time_pay between ? and ?";
            statement = conn.prepareStatement(sql);
            statement.setDate(1, new java.sql.Date(a.getTime()));
            statement.setDate(2, new java.sql.Date(b.getTime()));

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                amount = resultSet.getInt("sum");
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return amount;
    }
}
