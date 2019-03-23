package com.jiang.designpatterns;

import com.jiang.designpatterns.proxy.basis.WangPoStaticProxy;
import com.jiang.designpatterns.proxy.common.JiaShi;
import com.jiang.designpatterns.proxy.common.KindWomen;
import com.jiang.designpatterns.proxy.common.PanJinLian;
import com.jiang.designpatterns.proxy.dynamic_cglib.WangPoDynamicCglibProxy;
import com.jiang.designpatterns.proxy.dynamic_jdk.WangPoDynamicJdkProxy;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.reflect.Proxy;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 17:37
 * @Description:
 */
@RunWith(JUnit4.class)
public class ProxyTest {

    @Before
    public void before() {
        System.out.println("准备测试......");
    }

    @Test
    public void basisTest() {
        WangPoStaticProxy wangPoBasis = new WangPoStaticProxy();
        wangPoBasis.makeEyesWithMan();
        wangPoBasis.happyWithMan();

        WangPoStaticProxy wangPoBasis_2 = new WangPoStaticProxy(new JiaShi());
        wangPoBasis_2.makeEyesWithMan();
        wangPoBasis_2.happyWithMan();
    }

    @Test
    public void dynamicJdkTest() {
        KindWomen panJinLian = new PanJinLian();
        WangPoDynamicJdkProxy<KindWomen> wangPoDynamicProxy = new WangPoDynamicJdkProxy<>(panJinLian);
        KindWomen panJinLianProxy = (KindWomen) Proxy.newProxyInstance(KindWomen.class.getClassLoader(), new Class<?>[]{KindWomen.class}, wangPoDynamicProxy);
        panJinLianProxy.makeEyesWithMan();
        panJinLianProxy.happyWithMan();
    }

    @Test
    public void dynamicCglibTest() {
        KindWomen panJinLian = new PanJinLian();
        WangPoDynamicCglibProxy<KindWomen> wangPoDynamicProxy = new WangPoDynamicCglibProxy<>(panJinLian);
        KindWomen panJinLianProxy = (KindWomen)wangPoDynamicProxy.getProxyInstance(panJinLian);
        panJinLianProxy.makeEyesWithMan();
        panJinLianProxy.happyWithMan();
    }

    @After
    public void after() {
        System.out.println("测试完成！！！");
    }

}
