package io.github.service;

import io.github.dto.EmployeeDTO;

public interface EmployeeService {

    void register(EmployeeDTO request) throws Exception;

    EmployeeDTO getEmployeeByCpf(String cpf) throws Exception;

    void update(EmployeeDTO request) throws Exception;

    void delete(String cpf) throws Exception;
}
