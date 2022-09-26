package com.springcore.StatergyDesignPattern;

public class PaymentProcessorUsingInterface {
    private CardPayment cardPayment;

    // using setter
    public void setCardPayment(CardPayment cardPayment) {
        this.cardPayment = cardPayment;
    }
    // using constrator
    // public PaymentProcessorUsingInterface(CardPayment cardPayment) {
    //     this.cardPayment = cardPayment;
    // }
    public void doPayment(Double amt){
        cardPayment.payBill(amt);
    }


}
