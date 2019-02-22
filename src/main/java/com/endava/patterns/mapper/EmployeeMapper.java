package com.endava.patterns.mapper;

import com.endava.patterns.entities.employee.Employee;
import org.modelmapper.ModelMapper;

public class EmployeeMapper {
    private static EmployeeMapper instance;

    private EmployeeMapper() {
    }

    public static synchronized EmployeeMapper getInstance() {
        if (instance == null) {
            instance = new EmployeeMapper();
        }
        return instance;
    }

    public Employee[] mapObjectToEmployees(Object employees) {
        return new ModelMapper().map(employees, Employee[].class);
    }
}
