package com.cty.concurrent.lesson08.q86;

public class WorkerThread extends Thread {
    private final Channel channel;
//    private volatile boolean terminated = false;

    public WorkerThread(String name, Channel channel) {
        super(name);
        this.channel = channel;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Request request = channel.takeRequest();
                request.execute();
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        System.out.println(Thread.currentThread().getName() + " is terminated.");

    }

    public void stopThread() {
//        terminated = true;
        interrupt();
    }
}
