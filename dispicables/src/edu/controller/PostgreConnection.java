package edu.controller;

import java.sql.*;

public class PostgreConnection {
    public Statement stm;
    public ResultSet rs;
    public Connection connection;
    private String driver = "org.postgresql.Driver";
    private String url = "jdbc:postgresql://localhost:5432/";
    private String username = "postgres";
    private String password = "admin";


    public void connection () {
        try {
            System.setProperty("jdbc.Drivers", driver);
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void disconnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
