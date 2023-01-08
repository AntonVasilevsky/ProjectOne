package com.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array1 = {-1,2,-3};
        int a = 1;
        int b = -1;
        Arrays.sort(array);


        System.out.println(Arrays.compareUnsigned(array, array1));

    }
}
