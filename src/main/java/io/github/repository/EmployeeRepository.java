package io.github.repository;

import io.github.configuration.DatabaseConnection;
import io.github.dto.EmployeeDTO;
import io.github.entities.Client;
import io.github.entities.Employee;
import org.postgresql.util.PSQLException;
import org.postgresql.util.ServerErrorMessage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.OffsetDateTime;

public class EmployeeRepository  {

    public void registerEmployee(Employee employee) throws Exception {
        String sql = "INSERT INTO tb_employee(name, cpf, salary, hire_date) " +
                "VALUES (?, ?, ?, ?)";

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        pstmt.setString(1, employee.getName());
        pstmt.setString(2, employee.getCpf());
        pstmt.setBigDecimal(3, employee.getSalary());
        pstmt.setObject(4, OffsetDateTime.now());

        try{
            pstmt.executeQuery();
        } catch (Exception e) {
            if (e.getMessage().contains("tb_clients_cpf_key")) throw new Exception("CPF já cadastrado.");
            else throw new PSQLException(new ServerErrorMessage(e.getMessage()));
        }
    }

    public EmployeeDTO getByCpf(String cpf) throws Exception {
        String sql = "SELECT * FROM tb_employee WHERE cpf = ?";

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, cpf);

        ResultSet rs = pstmt.executeQuery();
        if (!rs.next()) throw new Exception("CPF não encontrado.");

        return EmployeeDTO.builder()
                .id(rs.getLong("id"))
                .name(rs.getString("name"))
                .cpf(rs.getString("cpf"))
                .salary(rs.getBigDecimal("salary")).build();
    }

    public void delete(String cpf) throws Exception {
        String sql = "DELETE FROM tb_employee WHERE cpf = ?";

        Connection conn = getConnection();

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, cpf);
        pstmt.executeQuery();
    }

    public void update(Employee employee) throws Exception {
        String sql = """
                UPDATE tb_employee
                SET name = ?,
                    salary = ?
                WHERE cpf = ?
                """;

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, employee.getName());
        pstmt.setBigDecimal(2, employee.getSalary());
        pstmt.setString(3, employee.getCpf());

        try{
            pstmt.executeQuery();
        } catch (Exception e) {
            throw new PSQLException(new ServerErrorMessage(e.getMessage()));
        }
    }

    private static Connection getConnection() {
        return new DatabaseConnection().getConnection();
    }

}
