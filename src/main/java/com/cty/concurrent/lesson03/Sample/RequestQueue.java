package com.cty.concurrent.lesson03.Sample;

import java.util.LinkedList;
import java.util.Queue;

public class RequestQueue {
    private final Queue<Request> queue = new LinkedList<Request>();
    public synchronized Request getRequest() {
        if (queue.peek() == null) {
            try {
                System.out.println(Thread.currentThread().getName() + " :[守护条件不成立，开始等待]");
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException-----------");
            }
        }
        System.out.println(Thread.currentThread().getName() + " :[守护条件成立，执行目标操作]");
        return queue.remove();
    }
    public synchronized void putRequest(Request request) {
        System.out.println(Thread.currentThread().getName() + " :[更改守护条件，唤醒其他线程]");
        queue.offer(request);
        notifyAll();
    }
}
