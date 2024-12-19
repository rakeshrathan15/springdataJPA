package com.neoteric.JPASpringBootData.dependencyinjection;



public class Pan {

    public String panNumber;

    public Employee employee;

    public Pan(String panNumber, Employee employee) {
        this.panNumber = panNumber;
        this.employee = employee;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public Employee getEmployee() {
        return employee;
    }
}
