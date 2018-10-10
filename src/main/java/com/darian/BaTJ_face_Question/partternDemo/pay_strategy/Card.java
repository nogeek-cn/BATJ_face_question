package com.darian.BaTJ_face_Question.partternDemo.pay_strategy;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <br>
 * <br>Darian
 **/
public abstract class Card implements PaymentMethod {
    // 面向具体对象的方式去编码
    static Map<String, PaymentMethod> paymentMethodMap = new ConcurrentHashMap<>();

    @PostConstruct
    public void init(){
        paymentMethodMap.put(getType(),this);
    }

    @Override
    public void pay(int cents) {
        System.out.println("支付方式：" + getType() + "-->>支付的钱：" + cents);
        // 具体执行支付操作。
        excetuTransation(cents);
    }

    protected abstract String getType();

    protected abstract void excetuTransation(int cents);
}
