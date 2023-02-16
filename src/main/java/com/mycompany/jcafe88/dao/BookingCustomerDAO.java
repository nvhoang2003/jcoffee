/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.dao;


import com.mycompany.jcafe88.models.BookingCustomer;
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
public class BookingCustomerDAO extends BaseDAO {
    public static List<BookingCustomer> list() {
        List<BookingCustomer> dataList = new ArrayList<>();

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from bookingcustomers";
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                BookingCustomer bookingcustomer;
                bookingcustomer = new BookingCustomer(
                        resultSet.getInt("booking_customer_id"),
                        resultSet.getInt("booking_id"),
                        resultSet.getInt("customer_id"),
                        resultSet.getDate("book_date"),
                        resultSet.getInt("time_out")
                );
                dataList.add(bookingcustomer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookingCustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return dataList;
    }

    public static void insert(BookingCustomer bookingcustomer) {
        openConnection();

        String sql = "insert into bookingcustomers(booking_id, customer_id, book_date, time_out) values (?, ?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, bookingcustomer.getBooking_id());
            statement.setInt(2, bookingcustomer.getCustomer_id());
            statement.setDate(3, bookingcustomer.getBook_date());
            statement.setInt(4, bookingcustomer.getTime_out());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BookingCustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void update(BookingCustomer bookingcustomer) {
        openConnection();

        String sql = "update bookingcustomers set booking_id = ?, customer_id = ?, book_date = ?, time_out = ? where booking_id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, bookingcustomer.getBooking_id());
            statement.setInt(2, bookingcustomer.getCustomer_id());
            statement.setDate(3, bookingcustomer.getBook_date());
            statement.setInt(4, bookingcustomer.getTime_out());
            statement.setInt(5, bookingcustomer.getBooking_customer_id());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BookingCustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void delete(int id) {
        openConnection();

        String sql = "delete from bookingcustomers where id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BookingCustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static BookingCustomer find(int id) {
        BookingCustomer bookingcustomer = null;

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from bookingcustomers where id = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                bookingcustomer = new BookingCustomer(
                        resultSet.getInt("booking_customer_id"),
                        resultSet.getInt("booking_id"),
                        resultSet.getInt("customer_id"),
                        resultSet.getDate("book_date"),
                        resultSet.getInt("time_out")
                );
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookingCustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return bookingcustomer;
    }
}
