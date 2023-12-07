package io.github.service;

import io.github.dto.EmployeeDTO;

public interface EmployeeService {

    void register(EmployeeDTO request) throws Exception;
}
