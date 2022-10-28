package com.springcore.anno_autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("resources/anno_auto.xml");
        Student s1 = (Student)ap.getBean("s");
        s1.showDetails();
        ((ClassPathXmlApplicationContext) ap).close();
    }
}
