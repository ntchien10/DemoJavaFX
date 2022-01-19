package com.example.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
    public static Boolean Authentication(String username,String password) {
        try{
            Connection con= OracleJDBCConnection.getJJDBCConnection();
            Statement statement=con.createStatement();
            String sql= "SELECT * FROM CHIEN_LOGIN WHERE USERNAME='"+username+"' AND PASSWORD = '"+password+"'";
            ResultSet rs= statement.executeQuery(sql);
            while ( rs.next()){
                String user=rs.getString("USERNAME");
                String pass=rs.getString("PASSWORD");
                if (username.equals(user)&&password.equals(pass)){
                    return true;
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}
