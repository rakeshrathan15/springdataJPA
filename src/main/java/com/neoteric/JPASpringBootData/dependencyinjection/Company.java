package com.neoteric.JPASpringBootData.dependencyinjection;

public class Company {

    public String  companyName;


    public Company(String companyName) {

        this.companyName = companyName;
    }

    public void hi(){
        System.out.println("Hello world");
    }

    public String getCompanyName() {

        return companyName;
    }
}
