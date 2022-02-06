package com.switchst;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Principle Amount: ");
        int principle = input.nextInt();
        System.out.print("Enter The Time: ");
        int time = input.nextInt();
        System.out.print("Enter The rate of interest(in %): ");
        float rateofinterest = input.nextFloat();
        float simpleInterest = 0;

        rateofinterest = rateofinterest/100;
        simpleInterest = principle*rateofinterest*time;
        System.out.println("Simple Interest = "+simpleInterest);

    }
}
