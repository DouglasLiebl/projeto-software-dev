package io.github;

import io.github.configuration.DatabaseConnection;
import io.github.pages.MainPage;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        MainPage mainPage = new MainPage();
        mainPage.setVisible(true);

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