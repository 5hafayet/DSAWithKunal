package com.conditionals_loops;

import java.util.Arrays;

public class chagnevalueinternally {
    public static void main(String[] args) {
        String name = "shafayet";
        int[] nums = {1,3,5,6};
        changeName(name);
        changeArr(nums);

        System.out.println(name); //do not changes because it creates a new object with value ahmad
        System.out.println(Arrays.toString(nums)); // changes because it modifies previous objects 0th index
    }

    static void changeName(String naam){
        naam = "Ahmad";
    }
    static void changeArr(int[] nums){
        nums[0] = 99;
    }

}

