package com.jiang.designpatterns.factory.hp;

import com.jiang.designpatterns.factory.common.AbstractPcFactory;
import com.jiang.designpatterns.factory.common.PcAccessories;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 15:06
 * @Description:
 */
public class HpFactory extends AbstractPcFactory {

    @Override
    public PcAccessories getPcAccessories(String name) {
        if ("mouse".equalsIgnoreCase(name)) {
            return new HpMouse();
        } else if ("keybo".equalsIgnoreCase(name)) {
            return new HpKeybo();
        }
        return null;
    }

}
