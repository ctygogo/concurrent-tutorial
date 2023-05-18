package com.cty.concurrent.lesson10.q102;

public class CountupThread extends Thread {
    // 计数值
    private long counter = 0;

    // 终止请求
    public void shutdownRequest() {
        interrupt();
        System.out.println("interrupt()==========" + isInterrupted());
    }

    // 线程体
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("run=============" + isInterrupted());
                doWork();
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException=============" + isInterrupted());
        } finally {
            doShutdown();
        }
    }

    // 操作
    private void doWork() throws InterruptedException {
        counter++;
        System.out.println("doWork: counter = " + counter);

        Thread.sleep(500);

    }

    // 终止处理
    private void doShutdown() {
        System.out.println("doShutdown: counter = " + counter);
    }
}
