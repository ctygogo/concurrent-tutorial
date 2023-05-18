package com.cty.concurrent.lesson10.q104;

/**
 * @author cty
 * @project concurrent-tutorial
 * @description
 * @datetime 2023-05-18 13:50
 */
public class CountThread extends GracefulThread {
    // 计数值
    private long counter = 0;

    @Override
    public void doWork() throws InterruptedException {
        counter++;
        System.out.println("doWork: counter = " + counter);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.interrupted();
        }
    }

    // 终止处理
    @Override
    public void doShutdown() {
        System.out.println("doShutdown: counter = " + counter);
    }
}
