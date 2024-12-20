package com.neoteric.JPASpringBootData.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class MyBean {
    public MyBean() {

        System.out.println("1. Bean is created");
    }

    @PostConstruct
    public void init() {

        System.out.println("2. Bean is initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("3. Bean is about to be destroyed");
    }
}
