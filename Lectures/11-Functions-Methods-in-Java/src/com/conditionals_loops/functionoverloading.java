package com.conditionals_loops;

public class functionoverloading {
    public static void main(String[] args) {
        fun(1);
        fun("hello");
    }

    static void fun(int i) {
        System.out.println(i);
    }

    static void fun(String i){
        System.out.println(i);
    }
}
