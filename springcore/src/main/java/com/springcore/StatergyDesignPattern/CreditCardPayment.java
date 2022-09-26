package com.springcore.StatergyDesignPattern;

public class CreditCardPayment implements CardPayment{
    public boolean payBill(Double billAmt){
        System.out.println("Paying Bill using Credit card--"+billAmt);

        return true;
    }
}
