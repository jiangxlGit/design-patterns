package com.jiang.designpatterns.factory.dell;

import com.jiang.designpatterns.factory.common.AbstractPcFactory;
import com.jiang.designpatterns.factory.common.PcAccessories;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 14:36
 * @Description:
 */
public class DellFactory extends AbstractPcFactory {

    @Override
    public PcAccessories getPcAccessories(String name) {
        if ("mouse".equalsIgnoreCase(name)) {
            return new DellMouse();
        } else if ("keybo".equalsIgnoreCase(name)) {
            return new DellKeybo();
        } else if ("mic".equalsIgnoreCase(name)) {
            return new DellMic();
        }
        return null;
    }
}
