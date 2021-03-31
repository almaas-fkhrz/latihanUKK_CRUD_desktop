/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author almaas
 */

import java.sql.*;

public class Koneksi {
    public static Connection getConnection(){
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/db_manajemenbuku_almaas";
        String user = "root";
        String pwd = "";
        try {
            conn = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conn;
    }
    
    public static void main(String args[]){
        try {
            Connection c = Koneksi.getConnection();
            System.out.println(String.format("Koneksi ke database %s berhasil", c.getCatalog()));
        } catch (SQLException e){
            System.out.println(e);
        }
    }
}
