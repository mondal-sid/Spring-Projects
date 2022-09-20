package com.springcore.pcnamespaces;

public class Car {
    private String name;
    private Engine engine;

    public void setName(String name) {
        this.name = name;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void getInfo(){
        System.out.println("Name : "+ name +" Engine name : " + engine.getName());
    }
    
}
