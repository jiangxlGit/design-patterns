package com.jiang.designpatterns.proxy.common;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 13:44
 * @Description:
 */
public class JiaShi implements KindWomen{
    @Override
    public void makeEyesWithMan() {
        System.out.println("贾氏在抛媚眼！");
    }

    @Override
    public void happyWithMan() {
        System.out.println("贾氏在和男的在做不可描述的事......");
    }
}
