package com.endava.patterns.entities.factory;

import com.endava.patterns.entities.employee.Employee;
import com.endava.patterns.entities.employee.EmployeeBuilderTest;

import static com.endava.patterns.utils.Constants.AUTOMATION_SUBDISCIPLINE;
import static com.endava.patterns.utils.Constants.AUTOMATION_TYPE;

public class EmployeeFactory {
    public static Employee getEmployee(String type) {
        return type.equals(AUTOMATION_TYPE)
                ? new EmployeeBuilderTest().setSubDiscipline(AUTOMATION_SUBDISCIPLINE).build()
                : new Employee();
    }
}
