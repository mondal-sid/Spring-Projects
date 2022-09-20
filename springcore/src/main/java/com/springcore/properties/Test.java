package com.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/drivers.xml");
        PropertyTest propertyTest =(PropertyTest)applicationContext.getBean("prop");
        propertyTest.printData();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
