package com.shafayet;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        while ( n!=1 ){
            c = a + b;
            a = b;
            b = c;
            n--;
        }
        System.out.println(c);

    }
}
