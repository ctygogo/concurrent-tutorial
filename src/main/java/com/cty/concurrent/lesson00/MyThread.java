package com.cty.concurrent.lesson00;

/**
 * @author cty
 * @project concurrent-tutorial
 * @description
 * @datetime 2023-05-09 14:03
 */
public class MyThread {

    public static void main(String[] args) {
        new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                System.out.print("□");
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                System.out.print("☒");
            }
        }).start();
        for (int i = 0; i < 1000; i++) {
            System.out.print("■");
        }
    }
}
