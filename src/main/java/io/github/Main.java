package io.github;

import io.github.configuration.DatabaseConnection;
import io.github.pages.MainPage;

import javax.swing.plaf.synth.SynthTableHeaderUI;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {

        MainPage mainPage = new MainPage();
        mainPage.setVisible(true);


        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Connection conn = new DatabaseConnection().getConnection();
                try {
                    String sql = """
                        SELECT EXISTS (
                            SELECT 1
                            FROM information_schema.tables
                            WHERE table_name = 'tb_movies'
                        );""";
                    PreparedStatement pstmt = conn.prepareStatement(sql);

                    ResultSet rs = pstmt.executeQuery();
                    if(!rs.next()) System.out.println("rs");
                    if(!rs.getBoolean(1)) {
                        sql = """
                        CREATE TABLE tb_movies(
                        	id BIGSERIAL PRIMARY KEY,
                        	name VARCHAR(255) NOT NULL,
                        	duration NUMERIC(10, 2) NOT NULL,
                        	director VARCHAR(255) NOT NULL,
                        	release_date VARCHAR(10) NOT NULL,
                        	genre VARCHAR(30) NOT NULL,
                        	rating VARCHAR(10) NOT NULL,
                        	description VARCHAR(255),
                        	is_available BOOLEAN NOT NULL
                        );
                        
                        CREATE TABLE tb_clients(
                        	id BIGSERIAL PRIMARY KEY,
                        	name VARCHAR(255) NOT NULL,
                        	email VARCHAR(255) UNIQUE NOT NULL,
                        	cpf VARCHAR(11) UNIQUE NOT NULL
                         );
                        
                        CREATE TABLE tb_loans(
                        	id VARCHAR(255) PRIMARY KEY,
                        	client_id BIGSERIAL NOT NULL,
                        	movie_id BIGSERIAL NOT NULL,
                        	created_at TIMESTAMP(6) NOT NULL,
                        	returned BOOLEAN NOT NULL,
                        	FOREIGN KEY(movie_id) REFERENCES tb_movies(id) ON DELETE CASCADE,
                        	FOREIGN KEY(client_id) REFERENCES tb_clients(id) ON DELETE CASCADE
                        );
                        
                        CREATE TABLE tb_employee(
                        	id BIGSERIAL PRIMARY KEY,
                        	name VARCHAR(255) NOT NULL,
                        	cpf VARCHAR(11) NOT NULL UNIQUE,
                        	salary NUMERIC(38, 6) NOT NULL,
                        	hire_date TIMESTAMP(6) NOT NULL
                        );
                        """;
                        PreparedStatement pstmt2 = conn.prepareStatement(sql);
                        pstmt2.executeQuery();
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}