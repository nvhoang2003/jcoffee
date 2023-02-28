/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.dao;

import static com.mycompany.jcafe88.dao.BaseDAO.closeConnection;
import static com.mycompany.jcafe88.dao.BaseDAO.conn;
import static com.mycompany.jcafe88.dao.BaseDAO.openConnection;
import static com.mycompany.jcafe88.dao.BaseDAO.statement;
import com.mycompany.jcafe88.models.Admin;
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
public class AdminDAO extends BaseDAO {

    public static List<Admin> list() {
        List<Admin> dataList = new ArrayList<>();

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from admins";
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Admin admin;
                admin = new Admin(
                        resultSet.getInt("admin_id"),
                        resultSet.getString("user_name"),
                        resultSet.getString("name")
                );
                dataList.add(admin);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return dataList;
    }

    public static void insert(Admin admin) {
        openConnection();

        String sql = "insert into admins(name, user_name, password) values (?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, admin.getName());
            statement.setString(2, admin.getUser_name());

            statement.setString(3, admin.getEncryptedPassword(admin.getPassword()));

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void update(Admin admin) {
        openConnection();

        String sql = "update admins set name = ?, user_name = ?, password = ? where admin_id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, admin.getName());
            statement.setString(2, admin.getUser_name());
            statement.setString(3, admin.getEncryptedPassword(admin.getPassword()));
            statement.setInt(4, admin.getAdmin_id());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static Admin find(int id) {
        Admin admin = null;

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from admins where admin_id = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                admin = new Admin(
                        resultSet.getInt("admin_id"),
                        resultSet.getString("user_name"),
                        resultSet.getString("name")
                );
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return admin;
    }

    public static int getIdByName(String user_name) {
        int id = 0;
        Admin admin = null;
        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from admins where user_name = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, user_name);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                admin = new Admin(
                        resultSet.getInt("admin_id"),
                        resultSet.getString("name"),
                        resultSet.getString("user_name")
                );
                break;
            }
            id = admin.getAdmin_id();

        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return id;

    }

    public static boolean login(String user_name, String password) {
        Admin admin = null;

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from admins where user_name = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, user_name);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                admin = new Admin(
                        resultSet.getInt("admin_id"),
                        resultSet.getString("name"),
                        resultSet.getString("user_name")
                );
                break;
            }
            if (admin == null) {
                return false;
            } else if (!admin.getEncryptedPassword(password).equals(resultSet.getString("password"))) {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return true;
    }
}
