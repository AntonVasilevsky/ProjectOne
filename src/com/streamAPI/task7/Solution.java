package com.streamAPI.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
       ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3));
        List<Integer> list  = ints.stream().distinct().toList();
        System.out.println(list);



    }
}
