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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public Student() {
    }
    @Override
    public String toString() {
        return "Student [course=" + course + ", name=" + name + ", roll=" + roll + "]";
    }

    
}
