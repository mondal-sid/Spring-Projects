package com.springcore.StatergyDesignPattern;

public class MainUsingInterface {
    public static void main(String[] args) {
        PaymentProcessorUsingInterface payment = new PaymentProcessorUsingInterface();

        // injecting dependent object into target object using setter injection
        payment.setCardPayment(new CreditCardPayment());


        payment.doPayment(1234.56);
    }
}
