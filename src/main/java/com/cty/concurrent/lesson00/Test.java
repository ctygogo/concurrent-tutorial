package com.cty.concurrent.lesson00;

/**
 * @author cty
 * @project concurrent-tutorial
 * @description
 * @datetime 2023-05-15 16:30
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        if (1 == 1) {
            throw new InterruptedException();
        }
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
    }
}
