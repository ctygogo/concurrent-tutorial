package com.cty.concurrent.lesson00;

/**
 * @author cty
 * @project concurrent-tutorial
 * @description
 * @datetime 2023-05-15 16:12
 */
public class DemoMain {
    public static void main1(String[] args) throws InterruptedException {
        Demo d = new Demo();
        Thread t = new Thread(() -> {
            d.doWait();
        });
        t.start();
        Thread.sleep(2000);
        d.doNotifyAll();
        t.interrupt();
    }

    public static void main(String[] args) throws InterruptedException {
        Demo d = new Demo();
        Thread t = new Thread(() -> {
            try {
                d.neverStop();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
        });
        t.start();
        Thread.sleep(2000);
        System.out.println("interrupt");
        t.interrupt();
        System.out.println(t.isInterrupted());
    }
}
