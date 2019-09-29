package com.jiang.designpatterns.strategy;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderDto {

    private String code;
    private BigDecimal price;
    private String type;

}
