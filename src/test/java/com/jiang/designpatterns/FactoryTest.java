package com.jiang.designpatterns;

import com.jiang.designpatterns.factory.common.AbstractPcFactory;
import com.jiang.designpatterns.factory.common.PcAccessories;
import com.jiang.designpatterns.factory.common.PcFactoryProducer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 15:09
 * @Description:
 */
@RunWith(JUnit4.class)
public class FactoryTest {

    @Before
    public void before() {
        System.out.println("准备测试......");
    }

    @Test
    public void testA() {
        AbstractPcFactory factory = PcFactoryProducer.getAbstractPcFactory("dell");
        PcAccessories pcAccessories = factory.getPcAccessories("mouse");
        pcAccessories.sayHi();
    }

    @After
    public void after() {
        System.out.println("测试完成！！！");
    }
}
