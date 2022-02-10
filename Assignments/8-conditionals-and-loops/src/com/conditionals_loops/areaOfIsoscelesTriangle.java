package com.conditionals_loops;

import java.util.Scanner;

public class areaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length for Equale sides: ");
        int equal = input.nextInt();
        System.out.print("Enterlength for base: ");
        int base = input.nextInt();
        float halfPerimeter = (equal+equal+base)/2;

        double area = Math.sqrt(((double)(halfPerimeter*(halfPerimeter-equal)*(halfPerimeter-equal)*(halfPerimeter-base))));
        System.out.println("Area is: "+area);
    }


}
