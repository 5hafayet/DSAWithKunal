package com.switchst;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = input.nextInt();

        if(firstNumber>secondNumber)
            System.out.println("First Number is the Largest.");
        else
            System.out.println("Second Number is the largest. ");

    }
}
