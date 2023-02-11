/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe88.models;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

/**
 *
 * @author Tcom
 */
public class Admin {

    private int admin_id;
    private String user_name;
    private String name;
    private String password;

    public Admin() {
    }

    public Admin(int admin_id, String user_name, String name) {
        this.admin_id = admin_id;
        this.user_name = user_name;
        this.name = name;
    }

    public Admin(String user_name, String name, String password) {
        this.user_name = user_name;
        this.name = name;
        this.password = password;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEncryptedPassword(String password) {
        String encrypted_password = null;

        try {
            /* Chon loai md5. */
            MessageDigest m = MessageDigest.getInstance("MD5");

            /* dua pass vao m */
            m.update(password.getBytes());

            /* chuyen ve byte */
            byte[] bytes = m.digest();

            /* noi pass vs he co so 16*/
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            /* Dua ve string de tao ra encrypted password */
            encrypted_password = s.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return encrypted_password;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" + "admin_id=" + admin_id + ", user_name=" + user_name + ", name=" + name + ", password=" + password + '}';
    }
}
