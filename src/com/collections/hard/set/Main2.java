package com.collections.hard.set;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,4,5));
        System.out.println(set.size());

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,2,3,4));
        System.out.println(treeSet);

    }
    public static boolean contain(Set<Integer> set, int i){
        return set.contains(i);
    }
    public static void remove(Set<Integer> set, int i){
        set.remove(i);
    }
    public static void clearNotEmpty(Set<Integer> set, int i){
        if(!set.isEmpty()){
            set.clear();
        }else{
            System.out.println("Not empty");
        }
    }
    public static int getMax(TreeSet<Integer> set){
        return set.last();
    }
    public static int getMin(TreeSet<Integer> set){
        return set.first();
    }
    public static void removeMin(TreeSet<Integer> set){
        set.pollFirst();
    }
    public static void removeMax(TreeSet<Integer> set){
         set.pollLast();
    }
}
