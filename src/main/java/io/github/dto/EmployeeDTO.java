package io.github.dto;

import io.github.entities.Employee;
import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter @Setter @Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long id;
    private String name;
    private BigDecimal salary;
    private OffsetDateTime hireDate;

    public static EmployeeDTO of(Employee request) {
        return EmployeeDTO.builder()
                .id(request.getId())
                .name(request.getName())
                .salary(request.getSalary())
                .hireDate(request.getHireDate())
                .build();
    }
}
