package com.jiang.designpatterns.factory.hp;

import com.jiang.designpatterns.factory.common.Mic;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 16:47
 * @Description:
 */
public class HpMic implements Mic {
    @Override
    public void sayHi() {
        System.out.println("Hp hi");
    }

    @Override
    public void sayMic() {
        System.out.println("Hp mic");
    }
}
