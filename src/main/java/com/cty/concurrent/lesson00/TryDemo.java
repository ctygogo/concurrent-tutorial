package com.cty.concurrent.lesson00;

/**
 * @author cty
 * @project concurrent-tutorial
 * @description
 * @datetime 2023-05-16 15:39
 */
public class TryDemo {
    public static void main(String[] args) {
        int a = getInt();
        System.out.println(a);
    }

    private static int getInt() {
        try {
            return 1;
        }finally {
            return 2;
        }
    }
}
