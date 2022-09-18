package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/ref_config.xml");
        Student student1 = (Student) context.getBean("StudentRef");
        System.out.println(student1);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
