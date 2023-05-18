package com.cty.concurrent.lesson02;

import java.util.*;

/**
 * @author cty
 * @project concurrent-tutorial
 * @description
 * @datetime 2023-05-11 17:01
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        for (String s : list) {
            System.out.println(s);
        }
        String a = "1";
        String b = "1";
        System.out.println(a==b);

    }
}
