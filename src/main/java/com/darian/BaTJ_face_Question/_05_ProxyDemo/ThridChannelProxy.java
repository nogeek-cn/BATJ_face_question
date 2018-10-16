package com.darian.BaTJ_face_Question._05_ProxyDemo;

/**
 * <br>
 * <br>Darian
 **/
public class ThridChannelProxy implements Payment {

    private Payment payment = new ThridChannelPayment();
    private PaymentLogger paymentLogger = new PaymentLogger();

    @Override
    public String doPay(String uid) {
        paymentLogger.log(uid);
        return payment.doPay(uid);
    }
}
