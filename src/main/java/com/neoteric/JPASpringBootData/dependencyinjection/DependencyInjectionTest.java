package com.neoteric.JPASpringBootData.dependencyinjection;

public class DependencyInjectionTest {

    public static void main(String[] args) {
        Company company= new Company("Neoteric");

        Department department= new Department("Developing",company);

        Employee employee= new Employee("Rakesh",department);


    }
}
