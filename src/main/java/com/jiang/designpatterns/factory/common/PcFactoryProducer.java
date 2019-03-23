package com.jiang.designpatterns.factory.common;

import com.jiang.designpatterns.factory.dell.DellFactory;
import com.jiang.designpatterns.factory.hp.HpFactory;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 15:16
 * @Description:
 */
public class PcFactoryProducer {

    public static AbstractPcFactory getAbstractPcFactory(String name) {
        if (CompanyShortNameEnum.DELL.getName_en().equalsIgnoreCase(name)) {
            return new DellFactory();
        } else if (CompanyShortNameEnum.HP.getName_en().equalsIgnoreCase(name)) {
            return new HpFactory();
        }
        return null;
    }

}
