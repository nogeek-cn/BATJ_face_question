package com.darian.BaTJ_face_Question.ProxyDemo;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <br>
 * <br>Darian
 **/
public class CglibDynamicProxy implements MethodInterceptor {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("___记录日志");
        // 调用业务类的方法，就相当于调用业务类的方法。
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("____记录日志结束");
        return result;
    }
}
