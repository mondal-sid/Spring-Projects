package com.springcore.StatergyDesignPattern;

public class DebitCardPayment implements CardPayment{
    public boolean payBill(Double billAmt){
        System.out.println("Paying Bill using Debit card--"+ billAmt);

        return true;
    }
}
