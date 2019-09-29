package com.jiang.designpatterns.strategy;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.BeanFactory;

import java.util.Map;

public class HandlerContext {

    private Map<String, Class>  handlerMap;

    public HandlerContext(Map<String, Class> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public AbstractHandler getInstance(String type) {
        Class clazz = handlerMap.get("type");
        if (clazz == null) {
            throw new IllegalArgumentException("not found handler for type: " + type);
        }
        return new BeanFactory().getBean(clazz);
    }
}
