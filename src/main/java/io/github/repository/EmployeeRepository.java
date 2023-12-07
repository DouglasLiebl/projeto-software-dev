package io.github.repository;

import io.github.configuration.DatabaseConnection;
import io.github.entities.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.OffsetDateTime;

public class EmployeeRepository  {

    public void registerEmployee(Employee employee) throws Exception {
        String sql = "INSERT INTO tb_employee(name, salary, hire_date) " +
                "VALUES (?, ?, ?)";

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        pstmt.setString(1, employee.getName());
        pstmt.setBigDecimal(2, employee.getSalary());
        pstmt.setObject(3, OffsetDateTime.now());

        pstmt.executeQuery();
    }

    private static Connection getConnection() {
        return new DatabaseConnection().getConnection();
    }

}
