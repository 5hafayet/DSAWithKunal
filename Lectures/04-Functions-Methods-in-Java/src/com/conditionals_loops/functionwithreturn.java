package com.conditionals_loops;

import java.util.Scanner;

public class functionwithreturn {
    public static void main(String[] args) {
        System.out.println(sum());
    }

    static int sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
