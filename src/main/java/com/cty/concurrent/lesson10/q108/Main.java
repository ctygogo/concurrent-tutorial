package com.cty.concurrent.lesson10.q108;

public class Main {
    public static void main(String[] args) {
        // 创建线程
        Thread t = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        if (interrupted()) {
                            throw new InterruptedException();
                        }
                        System.out.print(".");
                    } catch (InterruptedException e) {
                        System.out.print("*");
                    }
                }
            }
        };

        // 启动线程
        t.start();

        // 等待5秒
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        // 只interrupt线程一次
        t.interrupt();
    }
}
