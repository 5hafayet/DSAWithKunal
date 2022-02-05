package com.shafayet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int t = 3;
        while(t!=0) {
            int salary = 0, bonus = 0, total = 0;
            System.out.print("Enter Your Base Salary: ");
            Scanner input = new Scanner(System.in);
            salary = input.nextInt();
            if (salary < 10000)
                bonus = 1000;
            else if(salary == 10000)
                bonus = 1500;
            else
                bonus = 2000;
            total = salary + bonus;
            System.out.println("Your Final Salary is " + total);
            t--;
        }
    }
}
