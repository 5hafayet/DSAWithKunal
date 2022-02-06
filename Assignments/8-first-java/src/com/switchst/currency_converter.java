package com.switchst;

import java.util.Scanner;

public class currency_converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("For USD to BDT type 1 \nFor BDT to USD type 2: ");
        int choise = input.nextInt();
        if(choise == 1){
            System.out.print("Enter Amount in USD: ");
            float inUsd = input.nextFloat();
            float inBdt = inUsd * 85.94f;
            System.out.println(inUsd+" USD in BDT is "+inBdt);
        }
        else if(choise == 2){
            System.out.print("Enter Amount in USD: ");
            float inBdt = input.nextFloat();
            float inUsd = inBdt / 85.94f;
            System.out.println(inBdt+" BDT in USD is "+inUsd);
        }
    }
}
