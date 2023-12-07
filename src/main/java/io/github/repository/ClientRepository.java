package io.github.repository;

import io.github.configuration.DatabaseConnection;
import io.github.dto.ClientDTO;
import io.github.entities.Client;
import org.postgresql.util.PSQLException;
import org.postgresql.util.ServerErrorMessage;

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

        try{
            pstmt.executeQuery();
        } catch (Exception e) {
            if (e.getMessage().contains("tb_clients_cpf_key")) throw new Exception("CPF já cadastrado.");
            if (e.getMessage().contains("tb_clients_email_key")) throw new Exception("Email já cadastrado.");
            else throw new PSQLException(new ServerErrorMessage(e.getMessage()));
        }
    }

    public ClientDTO getClientByEmail(String email) throws Exception {
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

    private static ClientDTO getBuild(ResultSet rs) throws SQLException {
        return ClientDTO.builder()
                .id(rs.getLong("id"))
                .name(rs.getString("name"))
                .email(rs.getString("email"))
                .cpf(rs.getString("cpf"))
                .build();
    }
}
