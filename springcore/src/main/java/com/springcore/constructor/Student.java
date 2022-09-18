package com.springcore.constructor;

import java.util.List;

public class Student {

    private String name;
    private int roll;
    private float percentageOfMarks;
    private Certificate certi;
    private List<String> address;

    public Student(String name, int roll, float percentageOfMarks,Certificate certi, List<String> address) {
        this.name = name;
        this.roll = roll;
        this.percentageOfMarks = percentageOfMarks;
        this.certi=certi;
        this.address=address;
    }

    @Override
    public String toString() {
        return this.name+" : "+ this.roll+" : "+ this.percentageOfMarks+" { "+this.certi.getName()+" }" +" : "+ this.address;
    }
}
