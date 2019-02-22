package com.endava.patterns.entities.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
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
}
