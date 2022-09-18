package com.springcore.lifecycle;

public class Rice {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Rice() {
    }

    @Override
    public String toString() {
        return "Rice [price=" + price + "]";
    }

    
}
