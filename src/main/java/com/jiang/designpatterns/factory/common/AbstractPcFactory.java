package com.jiang.designpatterns.factory.common;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 14:40
 * @Description:
 */
public abstract class AbstractPcFactory {

    abstract public PcAccessories getPcAccessories(String name);

}
