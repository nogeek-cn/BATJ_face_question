package com.darian.BaTJ_face_Question._05_partternDemo.pay_strategy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 **/
public class StragegyDemo {
    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.addItem(new Item("JVM书", 50000));
        bill.addItem(new Item("皮带", 1000));
//        bill.pay(PaymentMethodFactory.getPaymentMethod("credit"));
//        bill.pay(PaymentMethodFactory.getPaymentMethod("debit"));

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();

        bill.pay(Card.paymentMethodMap.get("debit"));
    }
}
