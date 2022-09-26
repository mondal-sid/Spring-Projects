package com.springcore.StatergyDesignPattern;

public class ZetaCardPayment implements CardPayment {
    public boolean payBill(Double billAmt){
        System.out.println("Paying Bill using Zeta card--"+ billAmt);

        return true;
    }
}
