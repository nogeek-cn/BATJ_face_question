package com.darian.BaTJ_face_Question.partternDemo.pay_strategy;

/**
 * <br>
 * <br>Darian
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
