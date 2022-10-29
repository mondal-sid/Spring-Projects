package com.springcore.LookupMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("resources/lookup.xml");
        Car c = (Car) ap.getBean("c");
        System.out.println("--------------- Car ----------------");
        System.out.println(c.myCarEngine().getName());
        Bus b = (Bus) ap.getBean("b");
        System.out.println("--------------- Bus ----------------");
        System.out.println(b.myBusEngine().getName());
        Truck t = (Truck) ap.getBean("t");
        System.out.println("--------------- Truck ----------------");
        System.out.println(t.myTruckEngine().getName());
    }
}
