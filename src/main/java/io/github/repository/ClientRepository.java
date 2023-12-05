package io.github.repository;

import io.github.configuration.DatabaseConnection;
import io.github.entities.Client;

import java.sql.*;

public class ClientRepository {


    public void registerClient(Client client) throws Exception {
        String sql = "INSERT INTO tb_clients(name, email, cpf) " +
                "VALUES (?, ?, ?)";

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        pstmt.setString(1, client.getName());
        pstmt.setString(2, client.getEmail());
        pstmt.setString(3, client.getCpf());

        pstmt.executeQuery();
    }

    public Client getClientByEmail(String email) throws Exception {
        String sql = "SELECT * FROM tb_clients WHERE email = ?";

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, email);

        ResultSet rs = pstmt.executeQuery();
        if (!rs.next()) throw new Exception("Email não encontrado.");

        return getBuild(rs);
    }


    private static Connection getConnection() {
        return new DatabaseConnection().getConnection();
    }

    private static Client getBuild(ResultSet rs) throws SQLException {
        return Client.builder()
                .id(rs.getLong("id"))
                .name(rs.getString("name"))
                .email(rs.getString("email"))
                .cpf(rs.getString("cpf"))
                .build();
    }
}
