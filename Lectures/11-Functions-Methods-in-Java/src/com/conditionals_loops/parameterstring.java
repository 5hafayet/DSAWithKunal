package com.conditionals_loops;

import java.util.Scanner;

public class parameterstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String greeting = greet(name);
        System.out.println(greeting);
    }
    static String greet(String name){
        String message = "hello " + name;
        return message;
    }
}
