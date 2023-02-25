/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.dao;

import com.mycompany.jcafe88.models.CodeSale;
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
public class CodeSaleDAO extends BaseDAO {
     public static List<CodeSale> list() {
        List<CodeSale> dataList = new ArrayList<>();

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from code_sale";
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                CodeSale code_sale;
                code_sale = new CodeSale(
                        resultSet.getInt("code_sale_id"),
                        resultSet.getString("name"),
                        resultSet.getInt("sale_off"),
                        resultSet.getString("code")
                );
                dataList.add(code_sale);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CodeSaleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return dataList;
    }

    public static void insert(CodeSale code_sale) {
        openConnection();

        String sql = "insert into code_sale(name, sale_off, code) values (?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, code_sale.getName());
            statement.setInt(2, code_sale.getSale_off());
            statement.setString(3, code_sale.getCode());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CodeSaleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void update(CodeSale code_sale) {
        openConnection();

        String sql = "update code_sale set name = ?, sale_off = ?, code = ? where code_sale_id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, code_sale.getName());
            statement.setInt(2, code_sale.getSale_off());
            statement.setString(3, code_sale.getCode());
            statement.setInt(4, code_sale.getCode_sale_id());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CodeSaleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void delete(int id) {
        openConnection();

        String sql = "delete from code_sale where code_sale_id= ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CodeSaleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static CodeSale find(int id) {
        CodeSale code_sale = null;

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from code_sale where code_sale_id = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                code_sale = new CodeSale(
                        resultSet.getInt("code_sale_id"),
                        resultSet.getString("name"),
                        resultSet.getInt("sale_off"),
                        resultSet.getString("code")
                );
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CodeSaleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return code_sale;
    }
}
