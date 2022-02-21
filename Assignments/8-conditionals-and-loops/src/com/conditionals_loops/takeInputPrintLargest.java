package com.conditionals_loops;

import java.util.Scanner;

public class takeInputPrintLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        while (true) {
            System.out.print("Enter a number and (0) to end: ");
            int num = input.nextInt();
            if(num == 0)
                break;
            if (num > largest)
                largest = num;
        }
        System.out.println("Largest Number is: "+largest);
    }
}
