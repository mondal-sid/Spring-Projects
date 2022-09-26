package com.springcore.StatergyDesignPattern;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.doPayment("DEBIT_CARD", 123.50);
    }
}
