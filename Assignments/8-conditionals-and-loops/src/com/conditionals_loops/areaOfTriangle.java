package com.conditionals_loops;

import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the base: ");
        double base = input.nextDouble();
        System.out.print("What is the height: ");
        double height = input.nextDouble();
        double area = .5*base*height;
        System.out.println("Area of Triangle is: "+area);


    }
}
