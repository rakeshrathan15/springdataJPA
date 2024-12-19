package com.neoteric.JPASpringBootData.singletondesginpattern;

public class Department {


   public String departmentName;

   public  Company company;


    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
