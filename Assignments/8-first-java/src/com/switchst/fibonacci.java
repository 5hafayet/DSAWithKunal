package com.switchst;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Count: ");
        int count = input.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < count; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.print(c);


    }
}
