package com.java.basic;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
        int a = 2;
        int b = 5;
        int c = a + b;
        System.out.println("c:" + c);

        List<Integer> lister = new ArrayList();
        lister.add(1);
        lister.add(2);
        lister.add(3);

        System.out.println(lister + "everything in thte list ");
    }


}
