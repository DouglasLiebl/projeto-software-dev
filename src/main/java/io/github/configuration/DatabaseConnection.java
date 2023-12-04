package io.github.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public Connection getConnection() {
        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://postgresql:5432/billingProject?useSSL=false", "postgres", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
