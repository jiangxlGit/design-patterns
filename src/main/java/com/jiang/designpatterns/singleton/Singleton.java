package com.jiang.designpatterns.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/19 14:03
 * @Description:
 */
public class Singleton {

    private static volatile Singleton singleton = null;

    private static Lock lock = new ReentrantLock(true);

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (singleton == null) {
            lock.lock();
            if (singleton == null) {
                singleton = new Singleton();
            }
            lock.unlock();
        }

        return singleton;
    }

}
