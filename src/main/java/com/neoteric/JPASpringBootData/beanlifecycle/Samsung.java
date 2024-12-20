package com.neoteric.JPASpringBootData.beanlifecycle;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {


    @Autowired
  MobileProcesserInterface mobileProcesserInterface;




    public void samsungConfig(){
        System.out.println("Samsung phone Samsung class");
        mobileProcesserInterface.process();
    }
}
