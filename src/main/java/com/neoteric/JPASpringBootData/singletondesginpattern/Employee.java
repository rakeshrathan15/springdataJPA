package com.neoteric.JPASpringBootData.singletondesginpattern;

public class Employee {

    public String employeeName;


    public  Department department;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
