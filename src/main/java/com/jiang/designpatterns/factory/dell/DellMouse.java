package com.jiang.designpatterns.factory.dell;

import com.jiang.designpatterns.factory.common.Mouse;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 14:33
 * @Description:
 */
public class DellMouse implements Mouse {
    @Override
    public void sayHi() {
        System.out.println("Dell hi!");
    }

    @Override
    public void sayMouse() {
        System.out.println("Dell mouse");
    }
}
