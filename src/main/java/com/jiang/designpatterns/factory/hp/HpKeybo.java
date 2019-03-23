package com.jiang.designpatterns.factory.hp;

import com.jiang.designpatterns.factory.common.Keybo;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 14:35
 * @Description:
 */
public class HpKeybo implements Keybo {
    @Override
    public void sayHi() {
        System.out.println("Hp hi!");
    }

    @Override
    public void sayKeybo() {
        System.out.println("Hp keybo");
    }
}
