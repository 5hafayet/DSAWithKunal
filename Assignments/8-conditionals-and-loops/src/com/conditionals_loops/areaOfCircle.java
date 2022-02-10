package com.conditionals_loops;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        double area = 3.1416*radius*radius;
        System.out.println("Area of Circle: "+area);

    }
}
