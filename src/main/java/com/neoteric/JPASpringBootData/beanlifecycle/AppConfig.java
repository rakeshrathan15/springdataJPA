package com.neoteric.JPASpringBootData.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //  @Bean
    public MyBean myBean() {

        return new MyBean();
    }

    @Bean
    public Samsung getPhone(){
        return new Samsung();
    }

    @Bean
    public MobileProcesserInterface getProcess(){
        return new Snapdargon();
    }
}
