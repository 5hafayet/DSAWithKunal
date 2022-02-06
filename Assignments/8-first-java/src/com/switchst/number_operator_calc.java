package com.switchst;

import java.util.Scanner;

public class number_operator_calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many times program to run: ");
        int t = input.nextInt();
        while(t!=0) {
            System.out.print("Enter First Number: ");
            int firstNumber = input.nextInt();
            System.out.print("Enter Second Number: ");
            int secondNumber = input.nextInt();
            System.out.print("Enter The Operator(+,-,*,/): ");
            char opt = input.next().trim().charAt(0);
            float ans = 0;

            if (opt == '+')
                ans = firstNumber + secondNumber;
            else if (opt == '-')
                ans = firstNumber - secondNumber;
            else if (opt == '*')
                ans = firstNumber * secondNumber;
            else if (opt == '/')
                ans = (float) (firstNumber)/ (float) (secondNumber);
            System.out.println("Ans = " + ans);
            t--;
        }
    }
}
