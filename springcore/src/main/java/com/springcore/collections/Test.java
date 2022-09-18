package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/collection_config.xml");

        Emp emp1= (Emp)context.getBean("emp1");

        System.out.println(emp1);
        System.out.println(emp1.getEmpName());
        System.out.println(emp1.getAddress());
        System.out.println(emp1.getPhoneNos());
        System.out.println(emp1.getCourses());

        ((ClassPathXmlApplicationContext) context).close();
        
    }
}
