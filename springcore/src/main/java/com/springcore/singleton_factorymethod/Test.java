package com.springcore.singleton_factorymethod;

public class Test {

    private static Test t;

    private Test() {
        System.out.println("Test object");
    }

    public static Test getInstance(){
        if(t==null){
            t= new Test();
            return t;
        }else{
            return t;
        }
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    
}
