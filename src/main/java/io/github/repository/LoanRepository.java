package io.github.repository;

import io.github.configuration.DatabaseConnection;
import io.github.entities.Loan;
import org.postgresql.util.PSQLException;
import org.postgresql.util.ServerErrorMessage;

import java.lang.reflect.Type;
import java.sql.*;
import java.time.OffsetDateTime;
import java.util.Random;
import java.util.UUID;

public class LoanRepository {

    public void createLoan(Loan loan) throws Exception {


            String sql = "INSERT INTO tb_loans(id, client_id, movie_id, created_at, returned) " +
                    "VALUES (?, ?, ?, ?, ?)";

            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstmt.setObject(1, String.valueOf(UUID.randomUUID()));
            pstmt.setLong(2, loan.getClientId().getId());
            pstmt.setLong(3, loan.getMovieId().getId());
            pstmt.setObject(4, loan.getCreatedAt());
            pstmt.setBoolean(5, loan.getReturned());

            try {
                pstmt.executeQuery();
            } catch (Exception e) {
                sql = "SELECT * FROM tb_loans WHERE movie_id = ? AND returned = false";
                pstmt = conn.prepareStatement(sql);
                pstmt.setLong(1, loan.getMovieId().getId());

                String returnedId;

                ResultSet rs = pstmt.executeQuery();
                if (!rs.next()) throw new Exception("EEEEEEE");
                else returnedId = rs.getString("id");

                throw new RuntimeException(String.format("\nCódigo do aluguel: %s. Guarde com cuidado para não ter problemas em realizar a devolução.", returnedId));
            }

    }

    public Long getMovieId(String code) throws Exception {
        String sql = """
                SELECT movie_id FROM tb_loans
                WHERE id = ?
                """;

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, code);

        ResultSet rs = pstmt.executeQuery();
        Long returnedId;

        if (!rs.next()) throw new Exception("Aluguel não encontrado com o código: " + code);
        else returnedId = rs.getLong("movie_id");

        return returnedId;
    }

    public void updateStatus(String code) throws Exception {
        String sql = """
                UPDATE tb_loans 
                SET returned = ?
                WHERE id = ?
                """;

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setBoolean(1, true);
        pstmt.setString(2, code);

        pstmt.executeQuery();

    }


    private static Connection getConnection() {
        return new DatabaseConnection().getConnection();
    }

}
