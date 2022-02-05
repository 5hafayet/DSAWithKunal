package com.shafayet;

import java.util.Scanner;

public class countingOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Whole Number: ");
        int number = input.nextInt();

        System.out.print("Enter the Digit to Check: ");
        int digit = input.nextInt();

        int count = 0;
        while(number > 0) {
            int temp = number % 10;
            if (temp == digit)
                count++;
            number /= 10;
        }
        System.out.println(count);
    }
}
