package com.neoteric.JPASpringBootData.singletondesginpattern;

public class Student {

  private static Student instance;

  private Student(){
      System.out.println("Single ton instance is created");
  }

  public  static Student getInstance(){
      if(instance==null){
          instance= new Student();
      }
      return instance;
  }


}
