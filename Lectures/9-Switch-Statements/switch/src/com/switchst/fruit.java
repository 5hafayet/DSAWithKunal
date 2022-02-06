package com.switchst;

import java.util.Objects;
import java.util.Scanner;

public class fruit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a fruit name: ");
        String fruit = input.next();

        switch (fruit) {
            case "apple":
                System.out.println("sweet fruit.");
                break;
            case "mango":
                System.out.println("King of all fruit");
                break;
            default:
                System.out.println("Wrong input.");
                break;
        }



        }
    }

