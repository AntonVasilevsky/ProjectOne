package com.arrays.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuickSort {
    public static void main(String[] args) {
        Integer[] array = {2,3,1,5,9,1,3};
        sortArray(array);
        System.out.println(Arrays.toString(array));

    }
    public static void sortArray(Integer[] array) {
        int counter = 0;
        int min = Integer.MAX_VALUE;
        int index = 0;
        int tmp = 0;
        for (int j = 0; j < array.length; j++) {


            for (int i = counter; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    index = i;
                }


            }
            counter++;
            tmp = array[j];
            array[j] = min;
            array[index] = tmp;
            min = Integer.MAX_VALUE;


        }
    }
}
