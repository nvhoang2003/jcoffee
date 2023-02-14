/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Drinks;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class DrinksDAO extends com.mycompany.jcafe88.dao.BaseDAO {
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
            String sql =("SELECT * FROM `drinks`");
            ResultSet rs = Drinks.executeQuery();
            while (rs.next()) {
                Drinks drinks = new Drinks(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
                list.add(drinks);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DrinksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }  

    public List<Drinks> list() {
        
       return null;
        
    }

    private void openConnection() {
       
    }

}
