package com.neoteric.JPASpringBootData.dependencyinjection;



public class Employee {

    public String employeeName;


    public Department department;

    public Employee(String employeeName, Department department) {
        this.employeeName = employeeName;
        this.department = department;
    }

    public void calculateSalary(){
        department.adding();
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public Department getDepartment() {
        return department;
    }
}
