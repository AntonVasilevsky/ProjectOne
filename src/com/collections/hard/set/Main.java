package com.collections.hard.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3));

        int result = countUnique(list);
        System.out.println(result);
    }
    public static int countUnique(ArrayList<Integer> list){


        return new HashSet<>(list).size();



    }
}
