package com.cty.concurrent.lesson03.talk;

public class TalkThread extends Thread {
    private final RequestQueue input;
    private final RequestQueue output;
    public TalkThread(RequestQueue input, RequestQueue output, String name) {
        super(name);
        this.input = input;
        this.output = output;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":BEGIN");
        for (int i = 0; i < 20; i++) {
            if (i == 0 ) {
                Request request2 = new Request("hello i am " + Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName() + " puts  " + request2);
                output.putRequest(request2);
            }else {
            // 接收对方的请求
            Request request1 = input.getRequest();
            System.out.println(Thread.currentThread().getName() + " gets  " + request1);

            // 加上一个(!)再返给对方
            Request request2 = new Request(request1.getName() + "!");
            System.out.println(Thread.currentThread().getName() + " puts  " + request2);
            output.putRequest(request2);
            }
        }
        System.out.println(Thread.currentThread().getName() + ":END");
    }
}
