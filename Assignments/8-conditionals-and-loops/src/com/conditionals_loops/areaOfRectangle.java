package com.conditionals_loops;

import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int length = input.nextInt();
        System.out.print("Enter the Width: ");
        int width = input.nextInt();
        int area = length*width;
        System.out.println("Area of Rectangle: "+area);

    }
}
