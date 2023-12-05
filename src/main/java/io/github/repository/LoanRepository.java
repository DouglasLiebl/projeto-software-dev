package io.github.repository;

import io.github.configuration.DatabaseConnection;
import io.github.entities.Loan;

import java.sql.*;
import java.time.OffsetDateTime;

public class LoanRepository {

    public void createLoan(Loan loan) throws Exception {
        String sql = "INSERT INTO tb_loans(client_id, movie_id, created_at, returned) " +
                "VALUES (?, ?, ?, ?)";

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        pstmt.setLong(1, loan.getClientId().getId());
        pstmt.setLong(2, loan.getMovieId().getId());
        pstmt.setString(3, OffsetDateTime.now().toString());
        pstmt.setBoolean(4, false);

        pstmt.executeQuery();
    }


    private static Connection getConnection() {
        return new DatabaseConnection().getConnection();
    }

}
