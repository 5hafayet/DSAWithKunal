package com.array_and_array_list;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nameList = new String[5];

        for (int i = 0; i < nameList.length; i++) {
            nameList[i] = in.next();
        }

        for (int i = 0; i < nameList.length; i++) {
            System.out.print(nameList[i]+" ");
        }
    }
}
