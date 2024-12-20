package com.neoteric.JPASpringBootData.beanlifecycle;

public class Snapdargon implements MobileProcesserInterface{

    @Override
    public void process() {
        System.out.println("METHOD FROM SNAPDARGON  ");
    }
}
