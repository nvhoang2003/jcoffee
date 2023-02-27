/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.dao;

import com.mycompany.jcafe88.models.Bill;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

        String sql = "insert into bills(time_pay, amount, amount_after_sale, customer_id, order_id, code_sale_id) values (?, ?, ?, ? , ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setDate(1, bill.getTime_pay());
            statement.setInt(2, bill.getAmount());
            statement.setInt(3, bill.getAmount_after_sale());
            statement.setInt(4, bill.getCustomer_id());
            statement.setInt(5, bill.getOrder_id());
            statement.setInt(6, bill.getCode_sale_id());
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

}
