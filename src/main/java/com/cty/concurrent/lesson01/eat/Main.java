package com.cty.concurrent.lesson01.eat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing EaterThread, hit CTRL+C to exit.");
        Tool spoon = new Tool("Spoon");
        Tool fork = new Tool("Fork");
        Pair pair = new Pair(spoon, fork);
        new com.cty.concurrent.lesson01.eat.EaterThread("Alice", pair).start();
        new com.cty.concurrent.lesson01.eat.EaterThread("Bobby", pair).start();
    }
}
