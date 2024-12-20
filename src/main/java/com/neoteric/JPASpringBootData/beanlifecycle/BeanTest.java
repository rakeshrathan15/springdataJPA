package com.neoteric.JPASpringBootData.beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
    public static void main(String[] args) {
       // AnnotationConfigApplicationContext context =
          //      new AnnotationConfigApplicationContext(AppConfig.class);

        // Use the bean
      //  MyBean myBean = context.getBean(MyBean.class);

        // Close the context (triggers @PreDestroy)
       // context.close();
    }
}
