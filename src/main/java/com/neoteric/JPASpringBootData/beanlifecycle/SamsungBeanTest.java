package com.neoteric.JPASpringBootData.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SamsungBeanTest {


    public static void main(String[] args) {

        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);

        Samsung samsung= context.getBean(Samsung.class);

        samsung.samsungConfig();
    }
}
