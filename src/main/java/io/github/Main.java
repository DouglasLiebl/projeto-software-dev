package io.github;

import io.github.configuration.DatabaseConnection;
import io.github.pages.MainPage;
import io.github.service.ClientService;
import io.github.service.MovieService;
import io.github.service.impl.ClientServiceImpl;
import io.github.service.impl.MovieServiceImpl;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws Exception {

        MainPage mainPage = new MainPage();
        mainPage.setVisible(true);

    }
}