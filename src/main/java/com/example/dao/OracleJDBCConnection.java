package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleJDBCConnection {
    public static Connection getJJDBCConnection() {
        final String url = "jdbc:oracle:thin:@192.168.1.226:1521:vhc";
        final String user = "user01";
        final String password = "user01";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
