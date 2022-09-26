package com.springcore.StatergyDesignPattern;

public class MainUsingInterface {
    public static void main(String[] args) {

    // injecting dependent object into target object using setter injection
    
    // PaymentProcessorUsingInterface payment = new PaymentProcessorUsingInterface();
       // payment.setCardPayment(new CreditCardPayment());

    // injecting dependent object into target object using constractor injection

    PaymentProcessorUsingInterface payment = new PaymentProcessorUsingInterface(new ZetaCardPayment());

        payment.doPayment(1234.56);
    }
}