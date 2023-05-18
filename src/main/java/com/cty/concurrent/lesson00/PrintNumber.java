package com.cty.concurrent.lesson00;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author cty
 * @project concurrent-tutorial
 * @description
 * @datetime 2023-05-18 10:43
 */
public class PrintNumber implements  Runnable{
    private static AtomicInteger count = new AtomicInteger(1);
    private int id;

    public PrintNumber(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (count.get() <= 100) {
            if (count.get() % 2 == id - 1) {
                System.out.println(Thread.currentThread().getName() + ": " + count.getAndIncrement());
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintNumber(1), "Thread-A");
        Thread t2 = new Thread(new PrintNumber(2), "Thread-B");
        t1.start();
        t2.start();
    }
}
