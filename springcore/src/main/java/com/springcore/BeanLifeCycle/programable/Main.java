package com.springcore.BeanLifeCycle.programable;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("resources/beanlifecycle.xml");
        // Test t = (Test) ap.getBean("t");
        // t.afterPropertiesSet();
        while(true){
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for save 2 for close");
            int i = sc.nextInt();
            switch (i) {
                case 1: Test t = ap.getBean("t", Test.class);
                        System.out.print("Enter emp_id : ");
                        int Emp_id = sc.nextInt();
                        System.out.print("Enter name : ");
                        String Emp_name = sc.next();
                        System.out.print("Enter mobile no : ");
                        String Mob_no = sc.next();
                        System.out.print("Enter salary : ");
                        int salary = sc.nextInt();

                        t.save(Emp_id, Emp_name, Mob_no, salary);
                    break;
            
                default: ap.close();
                    break;
            }
        }
    }
}
