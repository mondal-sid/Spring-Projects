package com.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testforpropfile {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/driverFormFile.xml");
        PropertyTest1 propertyTest =(PropertyTest1)applicationContext.getBean("prop");
        propertyTest.printData();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}