package com.darian.BaTJ_face_Question._05_partternDemo.pay_strategy;

/**
 * 根据不同的支付方式，构造并返回一个支付的接口
 **/
public class PaymentMethodFactory {
    public static PaymentMethod getPaymentMethod(String type) {
        switch (type) {
            case "credit":
                return new CreditCard();
            case "debit":
                return new CreditCard();
            default:
                throw new RuntimeException("can't find type");
        }
    }
}
