package com.springcore.factorybean;

public class Skoda implements Car{

    @Override
    public void drive() {
        System.out.println("Driving Skoda");
    }
}
