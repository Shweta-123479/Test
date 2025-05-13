package com.java.in.programming;

import java.sql.*;

public class Create_JDBC_Conn {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username ="root";
        String pwd ="root";

        Connection connection = DriverManager.getConnection(url,username,pwd);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from Employee;");

        while(resultSet.next())
        {
           System.out.println(resultSet.getString("empid"));
        }
    }
}
