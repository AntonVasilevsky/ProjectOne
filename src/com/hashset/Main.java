package com.hashset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,4,5));
        System.out.println("There are "+ countUnique(list)+" unique numbers in list");
        HashSet<Integer> elements = new HashSet<>();
        for (int i = 1; i < 11; i++) {
            elements.add(i);
        }
        for (int i = 1; i < 4; i++) {
            elements.add(i);
        }
        System.out.println(elements);

        System.out.println(checkElement(elements, 11));
        deleteElement(elements, 11);
        System.out.println(elements);
        System.out.println(clearIfNotEmpty(elements));
        System.out.println(elements);*/

        HashMap<Integer, String> testHashMap = new HashMap<>();
        testHashMap.put(13, "John");
        testHashMap.put(12, "John");


        System.out.println(testHashMap.put(13, "Stan"));
        System.out.println(testHashMap);
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");





    }
    public static int countUnique(ArrayList<Integer> list){
        HashSet<Integer> set = new HashSet<>();
        for (Integer i :list
        ) {
            set.add(i);
        }
        return set.size();
    }
    public static boolean checkElement(HashSet<Integer> set, int element){
        return set.contains(element);
    }
    public static void deleteElement(HashSet<Integer> set, int element){
        set.remove(element);
    }
    public static boolean clearIfNotEmpty(HashSet<Integer> set){
        boolean q = set.isEmpty();
        if(!set.isEmpty()){
            set.clear();
        }
        return q;

    }
    public static void minMaxValues(TreeSet<Integer> treeSet){
        System.out.println("Min value is "+ treeSet.first()+"\n"+
                "max value is "+ treeSet.last());
    }
    public static void deleteMinMaxValues(TreeSet<Integer> treeSet){

        treeSet.remove(treeSet.first());
        treeSet.remove(treeSet.last());
    }
}
