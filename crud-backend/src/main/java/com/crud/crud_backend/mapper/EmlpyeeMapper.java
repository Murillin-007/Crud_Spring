package com.crud.crud_backend.mapper;

import com.crud.crud_backend.dto.EmployeeDTO;
import com.crud.crud_backend.entity.Employee;



public class EmlpyeeMapper {

    public static EmployeeDTO mapToEmployeeDto(Employee employee){
        return new EmployeeDTO(
                employee.getId(),
                employee.getFirstName(),
                employee.getLast_name()
        );
    };

    public static Employee mapToEmployee(EmployeeDTO employeeDTO){
        return new Employee(s
                employeeDTO.getId(),
                employeeDTO.getFirstName(),
                employeeDTO.getLastName()
        );
    }
}
