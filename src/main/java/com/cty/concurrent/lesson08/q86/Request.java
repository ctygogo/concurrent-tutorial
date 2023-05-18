package com.cty.concurrent.lesson08.q86;

import java.util.Random;

public class Request {
    private final String name; // 委托者
    private final int number;  // 请求的编号
    private static final Random random = new Random();
    public Request(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public void execute() throws InterruptedException{
        System.out.println(Thread.currentThread().getName() + " executes " + this);
            Thread.sleep(random.nextInt(1000));
    }
    @Override
    public String toString() {
        return "[ Request from " + name + " No." + number + " ]";
    }
}
