package com.array_and_array_list;

import java.util.Scanner;

public class rollStoreandPrint {
    public static void main(String[] args) {
        int[] roll = new int[5];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < roll.length; i++) {
            roll[i] = in.nextInt();
        }

        for (int i = 0; i < roll.length; i++) {
            System.out.println(roll[i]);
        }
    }
}
