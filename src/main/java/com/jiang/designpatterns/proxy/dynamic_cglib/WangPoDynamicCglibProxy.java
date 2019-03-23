package com.jiang.designpatterns.proxy.dynamic_cglib;

import com.jiang.designpatterns.proxy.common.KindWomen;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 17:43
 * @Description:
 */
public class WangPoDynamicCglibProxy<T> implements MethodInterceptor {

    private T target;

    public WangPoDynamicCglibProxy(T target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("### dynamic cglib proxy, before invocation");
        Object result = method.invoke(target, objects);
        System.out.println("### dynamic cglib proxy, end invocation");
        return result;
    }

    public Object getProxyInstance(Object target) {
        //创建加强器，用来创建动态代理类
        Enhancer enhancer = new Enhancer();

        //为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
        enhancer.setSuperclass(this.target.getClass());

        //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦截
        enhancer.setCallback(this);

        // 创建动态代理类对象并返回
        return enhancer.create();
    }

}
