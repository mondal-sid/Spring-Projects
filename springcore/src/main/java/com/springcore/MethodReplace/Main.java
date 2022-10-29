package com.springcore.MethodReplace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("resources/methodreplace.xml");
        Bank b = (Bank) ap.getBean("b");
        b.calculateInt();
        b.deposite();
        b.withdraw();
    }
}
