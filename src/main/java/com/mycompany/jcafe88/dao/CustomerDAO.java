/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.dao;

import com.mycompany.jcafe88.dao.BaseDAO;
import com.mycompany.jcafe88.models.Customer;
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
public class CustomerDAO extends BaseDAO {
    
    public static List<Customer>list(){
        List<Customer> dataList = new ArrayList<>();
        
        openConnection();
        
        try{
            //thuc thi lenh
            String sql = "select * from customers";
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()){
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
        }catch (SQLExeception ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    closeConnection();
    
    return dataList
}


   