package com.cty.concurrent.lesson00;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author cty
 * @project concurrent-tutorial
 * @description
 * @datetime 2023-05-17 11:31
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        List<String> link = new LinkedList<>();
        for (String s : arr) {
            System.out.println(s);
        }
        for (String s : link) {
            System.out.println(s);
        }

    }
}
