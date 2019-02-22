package com.endava.patterns.entities;

import lombok.Data;

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
