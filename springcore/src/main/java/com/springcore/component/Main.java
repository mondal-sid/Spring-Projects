package com.springcore.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("resources/component.xml");
        Student s1 = ap.getBean(Student.class);
        s1.showDetails();
        ((ClassPathXmlApplicationContext) ap).close();
    }
}
