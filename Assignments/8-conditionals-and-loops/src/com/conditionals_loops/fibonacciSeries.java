package com.conditionals_loops;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many digits to Print: ");
        int digits = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        while (digits != 1){
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;

            digits--;
        }
    }
}
