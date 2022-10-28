package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("resources/autowire.xml");

        Car c = (Car) ap.getBean("c");
        c.showDetails();
        ((ClassPathXmlApplicationContext) ap).close();
    }
}
