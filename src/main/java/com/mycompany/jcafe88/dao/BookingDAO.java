/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.dao;

import com.mycompany.jcafe88.BookingState;
import com.mycompany.jcafe88.models.Booking;
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
public class BookingDAO extends BaseDAO {

    public static List<Booking> list() {
        List<Booking> dataList = new ArrayList<>();

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from bookings";
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Booking booking;
                booking = new Booking(
                        resultSet.getInt("booking_id"),
                        resultSet.getString("name"),
                        resultSet.getInt("seat_count"),
                        BookingState.getBookingStateByKey(resultSet.getInt("state"))
                );
                dataList.add(booking);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return dataList;
    }

    public static void insert(Booking booking) {
        openConnection();

        String sql = "insert into bookings(name, seat_count, state) values (?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, booking.getName());
            statement.setInt(2, booking.getSeatCount());
            statement.setInt(3, booking.getState().getKey());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void update(Booking booking) {
        openConnection();

        String sql = "update bookings set name = ?, seat_count = ?, state = ? where booking_id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, booking.getName());
            statement.setInt(2, booking.getSeatCount());
            statement.setInt(3, booking.getState().getKey());
            statement.setInt(4, booking.getBookingId());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static void delete(int id) {
        openConnection();

        String sql = "delete from bookings where id = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
    }

    public static Booking find(int id) {
        Booking booking = null;

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from bookings where id = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                booking = new Booking(
                        resultSet.getInt("booking_id"),
                        resultSet.getString("name"),
                        resultSet.getInt("seat_count"),
                        BookingState.getBookingStateByKey(resultSet.getInt("state"))
                );
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return booking;
    }

    public static List<Booking> findBYState(int Value) {
        List<Booking> dataList = new ArrayList<>();

        openConnection();

        try {
            //Thuc thi lenh
            String sql = "select * from bookings where state = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, Value);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Booking booking;
                booking = new Booking(
                        resultSet.getInt("booking_id"),
                        resultSet.getString("name"),
                        resultSet.getInt("seat_count"),
                        BookingState.getBookingStateByKey(resultSet.getInt("state"))
                );

                dataList.add(booking);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();

        return dataList;
    }
}
