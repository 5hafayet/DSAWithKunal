package com.shafayet;

import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int reverse = 0;
        while(number > 0){
            int temp = number % 10;
            reverse = reverse * 10 + temp;
        }
        System.out.println(reverse);
    }
}
