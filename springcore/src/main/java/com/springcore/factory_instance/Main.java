package com.springcore.factory_instance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("resources/factory_instance.xml");
        Car c = (Car) ap.getBean("c");
        c.drive();
    }
}
