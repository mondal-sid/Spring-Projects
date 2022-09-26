package com.springcore.StatergyDesignPattern;



// define payment processor using concret class 



public class PaymentProcessor {
    public void doPayment(String cardType, Double amt){
        if("CREDIT_CARD".equals(cardType)){
            CreditCardPayment cardPayment = new CreditCardPayment();
            cardPayment.payBill(amt);
        }else if("DEBIT_CARD".equals(cardType)){
            DebitCardPayment debitCardPayment = new DebitCardPayment();
            debitCardPayment.payBill(amt);
        }
    }
}
