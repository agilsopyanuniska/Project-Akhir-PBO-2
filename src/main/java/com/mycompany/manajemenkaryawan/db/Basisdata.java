
package com.mycompany.manajemenkaryawan.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Basisdata {
    private static final String URL = "jdbc:mysql://localhost:3306/manajemen_karyawan";
    private static final String USER = "root";
    private static final String PASS = "";
    public static Connection getConnection(){
        Connection con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting..");
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Connected!!");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }
 
}
