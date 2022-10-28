package com.springcore.anno_autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

    @Qualifier(value ="c1")
    @Autowired
    private Course course;

    public void showDetails(){
        System.out.println("he is studying :" + course.getCourseName());
    }
}
