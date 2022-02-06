package com.switchst;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a String to check if it's Palindrome: ");
        String hello = input.next();
        int i = 0, j = hello.length()-1;
        while(i > j ){
            if(hello.charAt(i) == hello.charAt(j))
                continue;
            else {
                System.out.println("Not Palindrome");
            }
            i++;
            j--;
        }



    }
}
