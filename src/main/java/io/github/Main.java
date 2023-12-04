package io.github;

import io.github.configuration.DatabaseConnection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {


        // Database Connection test
        Connection connection = null;

        try {
            connection = new DatabaseConnection().getConnection();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}