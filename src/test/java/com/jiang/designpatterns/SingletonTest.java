package com.jiang.designpatterns;

import com.jiang.designpatterns.singleton.Singleton;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/20 14:36
 * @Description:
 */
public class SingletonTest {

    @Before
    public void before() {
        System.out.println("准备测试......");
    }

    @Test
    public void testA() {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executor.submit(new testATask());
            executor.submit(new testATask());
            executor.submit(new testATask());
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }

    @After
    public void after() {
        System.out.println("测试完成！！！");
    }

    class testATask implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("tread id: " + Thread.currentThread().getId() +
                        ", singleton hashcode: " + Singleton.getInstance().hashCode());
            }
        }
    }

}
