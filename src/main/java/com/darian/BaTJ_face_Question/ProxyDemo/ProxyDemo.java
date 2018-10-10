package com.darian.BaTJ_face_Question.ProxyDemo;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * <br>
 * <br>Darian
 **/
public class ProxyDemo {
    public static void main(String[] args) {
//        Payment payment = new ThridChannelProxy();
//        System.out.println(payment.doPay("darian"));
        DynamicProxy dynamicProxy = new DynamicProxy();
        Payment payment = new ThridChannelPayment();
        Payment paymentReturn = (Payment)dynamicProxy.bind(payment);
        System.out.println(paymentReturn.doPay("darian"));

        // 输出动态代理类
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", ThridChannelPayment.class.getInterfaces());
        String path = "PaymentProxy.class";
        try(FileOutputStream fos = new FileOutputStream(path)){
            fos.write(classFile);
            fos.flush();
            System.out.println("sussecc....");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
