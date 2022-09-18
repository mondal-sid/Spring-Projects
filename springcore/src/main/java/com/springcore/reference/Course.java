package com.springcore.reference;

public class Course {
    private int cid;
    private String cName;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course [cName=" + cName + ", cid=" + cid + "]";
    }
    
}
