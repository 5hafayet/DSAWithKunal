package com.conditionals_loops;

public class functionwitharg {
    public static void main(String[] args) {
        int ans = sum3(5, 10);
        System.out.println(ans);
    }

    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
}
