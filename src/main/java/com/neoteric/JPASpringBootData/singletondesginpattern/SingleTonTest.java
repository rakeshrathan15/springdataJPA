package com.neoteric.JPASpringBootData.singletondesginpattern;

public class SingleTonTest {

    public static void main(String[] args) {
        Student student= Student.getInstance();
        Student student1= Student.getInstance();

        Student1 student11= Student1.getInstance();
        Student1 student12= Student1.getInstance();
    }
}
