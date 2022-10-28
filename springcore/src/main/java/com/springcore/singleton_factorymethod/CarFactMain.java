package com.springcore.singleton_factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarFactMain {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("resources/carfactory.xml");
        Car c = (Car) ap.getBean("cf");
        c.drive();
    }
}
