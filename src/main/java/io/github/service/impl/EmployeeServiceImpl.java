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

    @Override
    public EmployeeDTO getEmployeeByCpf(String cpf) throws Exception {
        return repository.getByCpf(cpf);
    }

    @Override
    public void update(EmployeeDTO request) throws Exception {
        repository.update(Employee.of(request));
    }

    @Override
    public void delete(String cpf) throws Exception {
        repository.delete(cpf);
    }
}
