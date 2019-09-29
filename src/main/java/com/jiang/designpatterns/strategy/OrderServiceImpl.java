package com.jiang.designpatterns.strategy;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements IOrderService {

    @Autowired
    private HandlerContext handleContext;

    @Override
    public String handle(OrderDto dto) {
        return null;
    }
}
