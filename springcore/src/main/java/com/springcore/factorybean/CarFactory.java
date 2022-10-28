package com.springcore.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean{

    private String carname;
    
    public void setCarname(String carname) {
        this.carname = carname;
    }

    public Object getObject() throws Exception {
        Car c = (Car) Class.forName(carname).newInstance();
        return c;
    }

    public Class getObjectType() {
        return Car.class;
    }

    public boolean isSingleton(){
        return true;
    }
    
}
