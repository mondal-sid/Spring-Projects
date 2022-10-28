package com.springcore.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    private Course course;

    public void showDetails(){
        System.out.println("he is studying :" + course.getCourseName());
    }
}
