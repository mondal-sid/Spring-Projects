package com.springcore.autowiring;

public class Car {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void showDetails(){
        System.out.println("The car have : "+engine.getName()+" Engine");
    }

}
