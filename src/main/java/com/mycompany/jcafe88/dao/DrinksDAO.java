/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.dao;

/**
 *
 * @author Admin
 */
import static com.mycompany.jcafe88.dao.BaseDAO.closeConnection;
import static com.mycompany.jcafe88.dao.BaseDAO.conn;
import static com.mycompany.jcafe88.dao.BaseDAO.openConnection;
import static com.mycompany.jcafe88.dao.BaseDAO.statement;
import com.mycompany.jcafe88.models.Admin;
import com.mycompany.jcafe88.models.Drinks;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DrinksDAO extends BaseDAO {

    private static DrinksDAO instance;

    public DrinksDAO() {
    }

    public static DrinksDAO getInstance() {
        if (instance == null) {
            instance = new DrinksDAO();
        }
        return instance;
    }

    public List<Drinks> GetListDrink() {
        List<Drinks> list = new ArrayList<Drinks>();
        openConnection();
        try {
            String sql = ("SELECT * FROM drinks");
            statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Drinks drinks = new Drinks(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
                list.add(drinks);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DrinksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return null;
    }

    public static void insert(Drinks drinks) {
        openConnection();

        String sql = "insert into drinks(name, price, description,image) values (?, ?, ?,?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, drinks.getName());
            statement.setInt(2, drinks.getPrice());
            statement.setString(3, drinks.getDescription());
            statement.setString(4, drinks.getImage());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DrinksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void update(Drinks drinks) {
        openConnection();

        String sql = "update set drinks set (name, price, description,image) values (?, ?, ?,?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, drinks.getName());
            statement.setInt(2, drinks.getPrice());
            statement.setString(3, drinks.getDescription());
            statement.setString(4, drinks.getImage());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DrinksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static Drinks find(int id) {
        Drinks drinks = null;

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from drinks where id = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                drinks = new Drinks(
                        resultSet.getInt("drinks_id"),
                        resultSet.getString("name"),
                        resultSet.getInt("price"),
                        resultSet.getString("description"),
                        resultSet.getString("image")
                );
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DrinksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
        return null;
    }

    public static void delete(int id) {
        openConnection();

        String sql = "delete from drinks where id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DrinksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }
}
