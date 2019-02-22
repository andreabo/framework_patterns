package com.endava.patterns.entities.employee;

public class EmployeeBuilder
{
    private int cc;
    private String name;
    private String lastName;
    private String phone;
    private String address;
    private int salary;
    private int subDiscipline;
    private String grade;
    private String seniority;

    public EmployeeBuilder(String name){
        this.name = name;
    }

//    public EmployeeBuilder(int cc, String name, String lastName, String phone, String address, int salary, int subDiscipline, String grade, String seniority) {
//        this.cc = cc;
//        this.name = name;
//        this.lastName = lastName;
//        this.phone = phone;
//        this.address = address;
//        this.salary = salary;
//        this.subDiscipline = subDiscipline;
//        this.grade = grade;
//        this.seniority = seniority;
//    }

    public EmployeeBuilder addCc(int cc) {
        this.cc = cc;
        return this;
    }

    public EmployeeBuilder addLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder addPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public EmployeeBuilder addAddress(String address) {
        this.address = address;
        return this;
    }

    public EmployeeBuilder addSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder addSubDiscipline(int subDiscipline) {
        this.subDiscipline = subDiscipline;
        return this;
    }

    public EmployeeBuilder addGrade(String grade) {
        this.grade = grade;
        return this;
    }

    public EmployeeBuilder addSeniority(String seniority) {
        this.seniority = seniority;
        return this;
    }

    public Employee build() {
        return new Employee(cc, name, lastName, phone, address, salary, subDiscipline, grade, seniority);
    }

}
