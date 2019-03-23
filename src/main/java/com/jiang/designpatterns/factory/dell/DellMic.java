package com.jiang.designpatterns.factory.dell;

import com.jiang.designpatterns.factory.common.Mic;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 15:31
 * @Description:
 */
public class DellMic implements Mic {
    @Override
    public void sayHi() {
        System.out.println("Dell hi");
    }

    @Override
    public void sayMic() {
        System.out.println("Dell mic");
    }
}
