package com.springcore.staticdi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("resources/static.xml");
        Car c = (Car)ap.getBean("car");
        c.printCar();
    }
}
