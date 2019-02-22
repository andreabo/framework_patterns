package com.endava.patterns.mapper;

import com.endava.patterns.entities.Employee;
import org.modelmapper.ModelMapper;

public class EmployeeMapper {
    public Employee[] mapObjectToEmployees(Object employees) {
        return new ModelMapper().map(employees, Employee[].class);
    }
}
