package com.conditionals_loops;

import java.util.Arrays;

public class changeArray {
    public static void main(String[] args) {
        int[] arr= {1, 3, 5, 9};
        modifyArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    //it changes the array because it modifies the array rather than creating new object
    //and the arr also changes because array is the reference variable of arr.
    static void modifyArray(int[] array){
        array[0] = 0;
    }
}
