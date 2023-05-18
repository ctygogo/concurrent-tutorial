package com.cty.concurrent.lesson01.eat;

public class Tool {
    private final String name;
    public Tool(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "[ " + name + " ]";
    }
}
