package com.springcore.StatergyDesignPattern;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainUsingInterface {
    public static void main(String[] args) {

    // injecting dependent object into target object using setter injection
    
    // PaymentProcessorUsingInterface payment = new PaymentProcessorUsingInterface();
       // payment.setCardPayment(new CreditCardPayment());

    // injecting dependent object into target object using constractor injection
    // PaymentProcessorUsingInterface payment = new PaymentProcessorUsingInterface(new ZetaCardPayment());

    //     payment.doPayment(1234.56);

        Resource resource = new ClassPathResource("resources/payment.xml");

        BeanFactory factory = new XmlBeanFactory(resource);

        PaymentProcessorUsingInterface bean= factory.getBean("payment", PaymentProcessorUsingInterface.class);

        bean.doPayment(1234.50);


    }
}
