package com.hashmap.stdents;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> pplList = new HashMap<>();
        pplList.put(1, "Ivan Ivanov");
        pplList.put(2, "Petr Petrov");
        pplList.put(3, "Brad Pitt");
        pplList.put(4, "Shawn Connery");
        pplList.put(5, "Martha Stewart");
        pplList.put(6, "Silvester Stallone");
        pplList.put(7, "Ray Charles");
        pplList.put(8, "Bob Dylan");
        pplList.put(9, "Anna Karenina");
        pplList.put(10, "Sergey Dovlatov");
        System.out.println(searchByKey(pplList, 3));
        System.out.println(searchByValue(pplList, "Shawn Connery"));
        System.out.println(pplList);
        removeByKey(pplList, 1);
        System.out.println(pplList);
        System.out.println(invert(pplList));
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
        HashMap hashMap = listToMap(list);
        System.out.println(hashMap);

    }
    public static String searchByKey(HashMap<Integer, String> map, int n){
        return map.get(n);

    }
    public static int searchByValue(HashMap<Integer, String> map, String n){
        for (var pair:map.entrySet()
             ) {
            String s = pair.getValue();
            int i = pair.getKey();
            if(s.equals(n)){
                return i;
            }

        }
        return -1;
    }
    public static void removeByKey(HashMap<Integer, String> map, int n) {

        map.remove(n);
    }
    public static boolean containsValueByKey(HashMap<Integer, String> map, int n){
        return map.containsKey(n);
    }
    public static boolean containsName(HashMap<Integer, String> map, String n){
        for (var pair:map.entrySet()
             ) {
            String value = pair.getValue();
            String[] values = value.split(" ");
            for (String s: values
                 ) {
                if(s.equals(n)){
                    return true;
                }
            }
        }
        return false;
    }
    public static HashMap<String, Integer> invert(HashMap<Integer, String> map){
        HashMap<String, Integer> newMap = new HashMap<>();
        for (var pair: map.entrySet()
             ) {
            String key = pair.getValue();
            Integer value = pair.getKey();
            newMap.put(key, value);
        }
        return newMap;
    }
    public static HashMap<String, Integer> listToMap(List<String> list){
        HashMap<String, Integer> hashMap = new HashMap<>();
        int counter = 1;
        for (String s: list
             ) {
            hashMap.put(s,counter);
            counter++;
        }
        return hashMap;
    }
}
