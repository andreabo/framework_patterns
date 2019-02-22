package com.endava.patterns.entities.factory;

import com.endava.patterns.entities.employee.Employee;
import com.endava.patterns.entities.employee.EmployeeBuilder;

import static com.endava.patterns.utils.Constants.AUTOMATION_SUBDISCIPLINE;
import static com.endava.patterns.utils.Constants.AUTOMATION_TYPE;

public class EmployeeFactory {
    public static Employee getEmployee(String type) {
        return type.equals(AUTOMATION_TYPE)
                ? new EmployeeBuilder().setSubDiscipline(AUTOMATION_SUBDISCIPLINE).build()
                : new Employee();
    }
}
