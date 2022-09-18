package com.springcore.premitives;

public class Student {
    private int studentID;
    private String studentName;
    private String studentAddress;
    
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
    public int getStudentID() {
        return studentID;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getStudentAddress() {
        return studentAddress;
    }

    public Student() {

    }
    
    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName
                + ",studentAddress=" + studentAddress + "]";
    }
    
}
