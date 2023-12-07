package io.github.service.impl;

import io.github.dto.EmployeeDTO;
import io.github.entities.Employee;
import io.github.repository.EmployeeRepository;
import io.github.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository = new EmployeeRepository();

    @Override
    public void register(EmployeeDTO request) throws Exception {
        repository.registerEmployee(Employee.of(request));
    }
}
