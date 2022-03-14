package com.conditionals_loops;

import java.util.Scanner;

public class area_of_a_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The radius of the Circle: ");
        float radius = input.nextInt();
        double area = 3.1416*radius*radius;
        System.out.println("Area is "+area);
    }
}
