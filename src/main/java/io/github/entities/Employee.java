package io.github.entities;

import io.github.dto.EmployeeDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter @Setter @SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Person{

    private String cpf;
    private BigDecimal salary;
    private OffsetDateTime hireDate;

    public static Employee of(EmployeeDTO request) {
        return Employee.builder()
                .name(request.getName())
                .cpf(request.getCpf())
                .salary(request.getSalary())
                .hireDate(OffsetDateTime.now())
                .build();
    }
}
