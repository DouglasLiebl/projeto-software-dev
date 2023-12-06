package io.github.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.OffsetDateTime;

@Getter @Setter @SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Person{

    private Double salary;
    private OffsetDateTime hireDate;
}
