package com.springcore.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("resources/factorybean.xml");
        Car c = (Car) ap.getBean("cf");
        c.drive();
    }
}
