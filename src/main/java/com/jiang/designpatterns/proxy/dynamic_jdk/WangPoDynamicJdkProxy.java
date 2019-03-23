package com.jiang.designpatterns.proxy.dynamic_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 17:43
 * @Description:
 */
public class WangPoDynamicJdkProxy<T> implements InvocationHandler {

    private T target;

    public WangPoDynamicJdkProxy(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("### dynamic jdk proxy, before invocation");
        Object result = method.invoke(target, args);
        System.out.println("### dynamic jdk proxy, end invocation");
        return result;
    }
}
