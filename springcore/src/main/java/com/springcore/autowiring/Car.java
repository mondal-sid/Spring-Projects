package com.springcore.autowiring;

import javax.annotation.Resource;

public class Car {

    @Resource
    private Engine engine;

    public void printData(){
        System.out.println("Engine name :"+ engine.getName());
    }
}
