package com.cty.concurrent.blackhole;

import java.util.concurrent.atomic.AtomicBoolean;

public class Blackhole {
    public static void enter(Object obj) throws InterruptedException {
        System.out.println("Step 1");
        magic(obj);
        Thread.sleep(0);
        System.out.println("Step 2");
        synchronized (obj) {
            System.out.println("Step 3 (never reached here)");  // 不会执行到这里
        }
    }

    private static void magic(Object obj) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                synchronized (this) {
                    synchronized (obj) {
                        this.notifyAll();
                        try {
//                            this.join();
                            this.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        thread.start();
        synchronized (thread) {
            thread.wait();
        }
    }


}
