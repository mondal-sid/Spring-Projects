package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("resources/cons_conf.xml");
        Certificate cer1 = (Certificate)ac.getBean("cref");
        System.out.println(cer1);
        Student student = (Student)ac.getBean("student");
        System.out.println(student);
    ((ClassPathXmlApplicationContext) ac).close();
    }
}
