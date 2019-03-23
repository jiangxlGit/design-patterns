package com.jiang.designpatterns.proxy.basis;

import com.jiang.designpatterns.proxy.common.JiaShi;
import com.jiang.designpatterns.proxy.common.KindWomen;
import com.jiang.designpatterns.proxy.common.PanJinLian;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 13:27
 * @Description:
 */
public class WangPoStaticProxy implements KindWomen {

    private KindWomen kindWomen;

    // 默认就是潘金莲的代理
    public WangPoStaticProxy() {
        this.kindWomen = new PanJinLian();
    }

    public WangPoStaticProxy(JiaShi jiaShi) {
        this.kindWomen = jiaShi;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();
    }
}
