package com.switchst;

import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter EmpID");
        int empID = input.nextInt();
        String dept = input.next();

        switch (empID) {
            case 1 -> System.out.println("Shafayet");
            case 2 -> System.out.println("Saad");
            case 3 -> {
                System.out.println("Emp no 3");
                switch (dept) {
                    case "it" -> System.out.println("IT");
                    case "cse" -> System.out.println("CSE");
                    default -> System.out.println("Wrong input");
                }
            }
            default -> System.out.println("Wrong input");
        }
    }
}
