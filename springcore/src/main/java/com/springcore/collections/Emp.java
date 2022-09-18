package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String empName;
    private List<String> phoneNos;
    private Set<String> address;
    private Map<String, String> courses;

    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public List<String> getPhoneNos() {
        return phoneNos;
    }
    public void setPhoneNos(List<String> phoneNos) {
        this.phoneNos = phoneNos;
    }
    public Set<String> getAddress() {
        return address;
    }
    public void setAddress(Set<String> address) {
        this.address = address;
    }
    public Map<String, String> getCourses() {
        return courses;
    }
    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Emp() {
    }
    @Override
    public String toString() {
        return "Emp [address=" + address + ", courses=" + courses + ", empName=" + empName + ", phoneNos=" + phoneNos
                + "]";
    }

    
    
    
}
