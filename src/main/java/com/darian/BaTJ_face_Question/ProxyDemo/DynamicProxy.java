package com.darian.BaTJ_face_Question.ProxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <br>
 * <br>Darian
 **/
public class DynamicProxy implements InvocationHandler {
    private Object target; // 被代理的对象

    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("记录日志");
        Object result = method.invoke(target, args);
        System.out.println("记录日志结束");
        return result;
    }
}
