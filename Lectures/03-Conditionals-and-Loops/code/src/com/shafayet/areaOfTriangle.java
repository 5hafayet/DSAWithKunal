package com.conditionals_loops;

import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of base: ");
        int base = input.nextInt();
        System.out.print("Enter Value of height: ");
        int height = input.nextInt();
        double area = .5 * base * height;
        System.out.println("Area of the triangle: "+area);
    }
}
