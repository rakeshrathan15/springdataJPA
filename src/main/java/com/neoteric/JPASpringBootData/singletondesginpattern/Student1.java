package com.neoteric.JPASpringBootData.singletondesginpattern;

public class Student1 {

    private static  Student1 student1;

    private Student1(){
        System.out.println("Student one duplicate");

    }


    public static  Student1 getInstance(){

        student1= new Student1();
        return student1;
    }
}
