package com.lambda.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] array1 = {"мама", "мыла", "раму"};
        String[] array2 = {"я", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд", "май"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        /*arrays.sort(new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o2.length - o1.length;
            }
        });*/
        arrays.sort((Comparator.comparingInt(o -> o.length))); // как это работает?
        arrays.sort((o1, o2) -> o2.length- o1.length);
        arrays.forEach(a -> System.out.println(Arrays.toString(a)));

       Inter inter = p-> p%13==0;
        System.out.println(inter.divideBy(13));
        Longer longer = ((s1, s2) -> s1.length()>s2.length()? s1 : s2);
        System.out.println(longer.getLongerString("one", "four"));
        Doubles doubles = ((d1, d2, d3) -> Math.pow(d2, 2)-4*d1*d3);
        Doubles doubles1 = ((d1, d2, d3) -> d1* Math.pow(d2,d3));
        System.out.println( doubles.discriminant(2.0d, 8.0d, 8.0d));
        System.out.println(doubles1.discriminant(3.0d, 2.0d, 3.0d));
    }

    interface  Inter {
        abstract boolean divideBy(int x);
    }
    interface Longer {
        String getLongerString(String s1, String s2);
    }
    interface Doubles {
        Double discriminant(Double d1, Double d2, Double d3);

    }
}
