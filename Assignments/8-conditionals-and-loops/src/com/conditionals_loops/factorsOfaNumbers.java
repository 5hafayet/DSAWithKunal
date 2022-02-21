package com.conditionals_loops;

import java.util.Scanner;

public class factorsOfaNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        int temp = num;
        for (int i = 1; i < temp; i++) {
            if (num%i == 0 && i < num/i ) {
                System.out.println(i + " " + num/i);
                temp = num/i;
            }

        }
    }

}
