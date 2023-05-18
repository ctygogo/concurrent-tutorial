package com.cty.concurrent.blackhole;

public class Main {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("BEGIN");
        Object obj = new Object();
        Blackhole.enter(obj);
        System.out.println("END");
    }
}
