package com.array_and_array_list;

import java.util.Scanner;

public class buildArrayPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Size of given array: ");
        int n = in.nextInt();
        int sum = 0;

        int[] nums = new int[n];
        int[] runningSum = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {

            runningSum[i] = sum+nums[i];
            sum = runningSum[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(runningSum[i]+" ");

        }


    }

}
