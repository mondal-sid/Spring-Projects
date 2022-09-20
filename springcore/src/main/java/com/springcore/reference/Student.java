package com.springcore.reference;

public class Student {
    private int roll;
    private String name;    
    private Course course;
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCourse(Course course) {
        this.course = course;
    }

    public void getDetails(){
        System.out.println("name : "+ name + " roll no : "+ roll + " course id: "+ course.getCid() + " course name : "+course.getcName());
    }
}
