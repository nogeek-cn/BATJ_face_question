package com.darian.BaTJ_face_Question._05_ProxyDemo;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * <br>
 * <br>Darian
 **/
public class CglibProxyDemo {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "code");

        ThridChannelPayment thridChannelPayment = new ThridChannelPayment();
        CglibDynamicProxy cglibDynamicProxy = new CglibDynamicProxy();
        ThridChannelPayment tcp = (ThridChannelPayment) cglibDynamicProxy.getInstance(thridChannelPayment);
        System.out.println(tcp.doPay("darian"));
    }
}
