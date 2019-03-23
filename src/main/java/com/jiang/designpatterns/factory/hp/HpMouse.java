package com.jiang.designpatterns.factory.hp;

import com.jiang.designpatterns.factory.common.Mouse;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 14:34
 * @Description:
 */
public class HpMouse implements Mouse {
    @Override
    public void sayHi() {
        System.out.println("Hp hi!");
    }

    @Override
    public void sayMouse() {
        System.out.println("Hp mouse");
    }
}
