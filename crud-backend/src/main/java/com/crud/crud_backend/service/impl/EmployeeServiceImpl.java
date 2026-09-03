package com.crud.crud_backend.service.impl;

import com.crud.crud_backend.dto.EmployeeDTO;
import com.crud.crud_backend.entity.Employee;
import com.crud.crud_backend.mapper.EmployeeMapper;
import com.crud.crud_backend.repository.EmployeeRepository;
import com.crud.crud_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
