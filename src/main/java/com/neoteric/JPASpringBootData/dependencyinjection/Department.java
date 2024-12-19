package com.neoteric.JPASpringBootData.dependencyinjection;



public class Department {


   public String departmentName;

   public Company company;


    public Department(String departmentName, Company company) {
        this.departmentName = departmentName;
        this.company = company;
    }

    public void adding(){
        company.hi();
    }

    public String getDepartmentName() {

        return departmentName;
    }

    public Company getCompany() {

        return company;
    }


}
