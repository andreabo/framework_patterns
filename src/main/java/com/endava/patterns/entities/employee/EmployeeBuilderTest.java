package com.endava.patterns.entities.employee;

import java.util.Random;

public class EmployeeBuilderTest {
    private int id;
    private int cc;
    private String name;
    private String lastName;
    private String phone;
    private String address;
    private int salary;
    private int subDiscipline;
    private String grade;
    private String seniority;

    public EmployeeBuilderTest setSubDiscipline(int subDiscipline) {
        this.subDiscipline = subDiscipline;
        return this;
    }

    public Employee build() {
        id = new Random().nextInt() % 999 + 900;
        cc = new Random().nextInt() % 10000 + 1000;
        name = "";
        lastName = "";
        phone = "";
        address = "";
        grade = "";
        seniority = "";
        return new Employee(id, cc, name, lastName, phone, address, salary, subDiscipline, grade, seniority);
    }
}
