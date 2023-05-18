package com.cty.concurrent.lesson00;


import java.util.concurrent.Executors;

/**
 * @author cty
 * @project concurrent-tutorial
 * @description
 * @datetime 2023-05-09 15:40
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = Executors.defaultThreadFactory().newThread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 1000; i++) {
                System.out.print("□");
            }
        });
        thread.start();
        Thread.sleep(2000);
//        thread.interrupt();
    }
}
