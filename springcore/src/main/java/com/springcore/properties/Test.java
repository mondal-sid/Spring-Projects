package com.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("C:/Users/SIDDHARTHA/Documents/Spring Projects/springcore/src/main/java/resources/driver-details.xml");
        PropertyTest propertyTest =(PropertyTest)applicationContext.getBean("pt");
        propertyTest.printData();
    }
}
