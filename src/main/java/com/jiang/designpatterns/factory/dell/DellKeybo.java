package com.jiang.designpatterns.factory.dell;

import com.jiang.designpatterns.factory.common.Keybo;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 14:34
 * @Description:
 */
public class DellKeybo implements Keybo {
    @Override
    public void sayHi() {
        System.out.println("Dell hi!");
    }

    @Override
    public void sayKeybo() {
        System.out.println("Dell keybo!");
    }
}
