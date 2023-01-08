package com.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        String[] array1 = {"a"};
        String[] array2 = {"a", "b"};
        String[] array3 = {"a", "b", "c"};
        int[] array4 = {array1.length, array3.length, array2.length, 26, 32, 11, 758};
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array4));
        Arrays.sort(array4);
        for (int i = 0; i < array4.length/2; i++) {
            int tmp = array4[array4.length-1-i];
            array4[array4.length-1-i] = array4[i];
            array4[i] = tmp;
        }
        // если сумма кратна 2, то 50%, если 3 то 30, 1. sum, 2. true false, 3. discount
        System.out.println(Arrays.toString(array4));

        Summ summ;

        summ = (a,b)->a+b;

        int result = summ.calculate(10, 20);


        System.out.println(result); //30



    }
    public static void calc (int a, int b){
        System.out.println(a+b);
    }
    interface Summ{

        int calculate(int a, int b);

    }

}
