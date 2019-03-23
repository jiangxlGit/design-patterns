/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 13:16
 * @Description:
 */
package com.jiang.designpatterns.proxy.common;

/**
 * Created by jiangxl on 2019/3/19.
 */
public class PanJinLian implements KindWomen{
    @Override
    public void makeEyesWithMan() {
        System.out.println("潘金莲抛媚眼！");
    }

    @Override
    public void happyWithMan() {
        System.out.println("潘金莲和男人在做不可描述的事......");
    }
}
