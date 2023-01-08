package com.list;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(list);
        list.add(4, 66);
        System.out.println(list);


    }
}
