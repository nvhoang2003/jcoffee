/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.dao;

import com.mycompany.jcafe88.models.Table;
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
public class TableDAO extends BaseDAO{
     public static List<Table> list() {
        List<Table> dataList = new ArrayList<>();

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from tables";
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Table table;
                table = new Table(
                        resultSet.getInt("table_id"),
                        resultSet.getString("name"),
                        resultSet.getInt("seat_count"),
                        resultSet.getBoolean("is_useable")
                );
                dataList.add(table);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return dataList;
    }

    public static void insert(Table table) {
        openConnection();

        String sql = "insert into tables(name, seat_count, is_useable) values (?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, table.getName());
            statement.setInt(2, table.getSeat_count());
            statement.setBoolean(3, table.getIs_useable());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TableDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void update(Table table) {
        openConnection();

        String sql = "update tables set name = ?, seat_count = ?, is_useable = ? where admin_id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, table.getName());
            statement.setInt(2, table.getSeat_count());
            statement.setBoolean(3, table.getIs_useable());
            statement.setInt(4, table.getTable_id());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TableDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static Table find(int id) {
        Table table = null;

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from tables where table_id = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                table = new Table(
                        resultSet.getString("name"),
                        resultSet.getInt("seat_count"),
                        resultSet.getBoolean("is_useable")
                );
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return table;
    }

     public static void delete(int id) {
        openConnection();

        String sql = "delete from tables where table_id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TableDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }
}
