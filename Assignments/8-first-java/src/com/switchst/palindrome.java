package com.switchst;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type Number to check Armstrong or Not: ");
        int number = input.nextInt();
        int sum = 0;
        int check = number;
        while (number != 0) {
            int temp = number % 10;
            sum = sum + (temp * temp * temp);
            number /= 10;
        }

        if(check == sum)
            System.out.println("Armstrong.");
        else
            System.out.println("Not Armstrong.");



    }
}
