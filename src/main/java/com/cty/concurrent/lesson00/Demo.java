package com.cty.concurrent.lesson00;

/**
 * @author cty
 * @project concurrent-tutorial
 * @description
 * @datetime 2023-05-15 16:10
 */
public class Demo {
    public synchronized void doWait() {
        System.out.println("开始等待");
        long s = System.currentTimeMillis();

        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long e = System.currentTimeMillis();
        System.out.println("等待结束:" + (e - s) + "ms");
    }

    public void neverStop() throws InterruptedException {
        while (true) {
            if (Thread.currentThread().isInterrupted()){
                throw new InterruptedException();
            }
        }
    }

    public synchronized void doNotifyAll() {
        notifyAll();
    }
}
