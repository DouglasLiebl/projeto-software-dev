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
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?useSSL=false", "postgres", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
