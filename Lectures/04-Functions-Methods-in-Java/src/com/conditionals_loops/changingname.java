package com.conditionals_loops;

public class changingname {
    public static void main(String[] args) {
        String name = "shafayet";
        changeName(name);
        System.out.println(name);
    }

    //here it is creating a new object "kunal" rather than changing name
    static void changeName(String naam){
        naam = "kunal";
    }
}
