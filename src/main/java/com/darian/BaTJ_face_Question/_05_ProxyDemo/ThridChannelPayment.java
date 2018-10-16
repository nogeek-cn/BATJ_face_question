package com.darian.BaTJ_face_Question._05_ProxyDemo;

/**
 * <br>
 * <br>Darian
 **/
public class ThridChannelPayment implements Payment {

    @Override
    public String doPay(String uid) {
        System.out.println("uid【" + uid+"】:发起了支付操作");
        return "sucess";
    }
}
