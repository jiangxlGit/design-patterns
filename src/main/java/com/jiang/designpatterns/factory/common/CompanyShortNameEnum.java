package com.jiang.designpatterns.factory.common;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 16:53
 * @Description:
 */
public enum CompanyShortNameEnum {

    DELL("DELL", "戴尔"),
    HP("HP", "惠普");

    private String name_en;
    private String name_cn;

    CompanyShortNameEnum(String name_en, String name_cn) {
        this.name_en = name_en;
        this.name_cn = name_cn;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getName_cn() {
        return name_cn;
    }

    public void setName_cn(String name_cn) {
        this.name_cn = name_cn;
    }}
