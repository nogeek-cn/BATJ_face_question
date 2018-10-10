package com.darian.BaTJ_face_Question.ProxyDemo;

/**
 * <br>
 * <br>Darian
 **/
public class PaymentLogger   {
    public void log(String uid){
        System.out.println("["+uid+"]:发起了支付行为，记录日志");
    }
}
