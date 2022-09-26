package com.springcore.StatergyDesignPattern;



// define payment processor using concret class 



public class PaymentProcessor {
    public Boolean doPayment(String cardType, Double amt){
        if("CREDIT_CARD".equals(cardType)){
            CreditCardPayment cardPayment = new CreditCardPayment();
            return cardPayment.payBill(amt);
        }else if("DEBIT_CARD".equals(cardType)){
            DebitCardPayment debitCardPayment = new DebitCardPayment();
            return debitCardPayment.payBill(amt);
        }else if("ZETA_CARD".equals(cardType)){
            ZetaCardPayment zetaCardPayment = new ZetaCardPayment();
            return zetaCardPayment.payBill(amt);
        }else{
            return false;
        }
    }
}
