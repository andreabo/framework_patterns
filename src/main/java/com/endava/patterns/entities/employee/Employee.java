package com.endava.patterns.entities.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
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

    public int getId() {
        return id;
    }

    public int getCc() {
        return cc;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }

    public int getSubDiscipline() {
        return subDiscipline;
    }

    public String getGrade() {
        return grade;
    }

    public String getSeniority() {
        return seniority;
    }

    public Employee(int id, int cc, String name, String lastName, String phone, String address, int salary, int subDiscipline, String grade, String seniority) {
        this.id = id;
        this.cc = cc;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
        this.subDiscipline = subDiscipline;
        this.grade = grade;
        this.seniority = seniority;
    }

    public Employee() {
    }

    public static EmployeeBuilder addName(String name) {
        return new EmployeeBuilder(name);

    }

}
