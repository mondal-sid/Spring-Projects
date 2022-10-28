package com.springcore.singleton_factorymethod;

//import java.util.Calendar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap =new ClassPathXmlApplicationContext("resources/factory_test.xml");
        Test t1 = (Test) ap.getBean("t");
        Test t2 = (Test) ap.getBean("t");
        System.out.println(t1==t2);
        //Calendar c = ap.getBean("c",Calendar.class);
        //System.out.println(c.getCalendarType());

        
    }
}
