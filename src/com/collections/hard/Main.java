package com.collections.hard;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("e:\\IDEA\\projects\\ProjectOne\\src\\com\\collections\\hard\\in.csv");

        Scanner sc = new Scanner(file);

        LinkedHashMap<Purchase, String> map = new LinkedHashMap<>();
        String milk = null; // это для того, чтобы потом найти милк и не создавать еще один цикл
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.contains("milk")) {
                milk = s;
            }
            Purchase p = PurchaseFactory.getPurchaseFromFactory(s);
            String q = sc.nextLine();
            map.put(p, q);
        }

        for (Map.Entry<Purchase, String> pair : map.entrySet()
        ) {
            System.out.println(pair);
        }


        ArrayList<String> days = new ArrayList<>();
        for (Purchase key : map.keySet()) {
            if (key.getName().equalsIgnoreCase("bread") && key.getPrice() == 155) {

                days.add(map.get(key));
            }
        }

        //*********************
        LinkedHashMap<Purchase, String> map1 = new LinkedHashMap<>();
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String t = scan.nextLine();
            Purchase o = PurchaseFactory.getPurchaseFromFactory(t);
            String l = scan.nextLine();
            map1.put(o, l);
        }
        System.out.println("printing map1");
        for (Map.Entry<Purchase, String> pair : map1.entrySet()
        ) {
            System.out.println(pair);
        }


        System.out.println("первый день:" + days.get(0) + " последний день:" + days.get(days.size() - 1));

        // удалить все покупки хлеб из первой коллекции
        System.out.println("removing purchase milk...");
        int count = 0; // какой есть ещё вариант кроме счетчика?
        for (Purchase key : map.keySet()
        ) {
            if (key.getName().equalsIgnoreCase("bread")) {
                count++;

            }
        }
        for (int i = 0; i < count; i++) {

            Purchase milky = null;

            for (Purchase key : map.keySet()
            ) {
                if (key.getName().equalsIgnoreCase("bread")) {
                    milky = key;
                }
            }
            map.remove(milky);
        }


        for (Map.Entry<Purchase, String> pair : map.entrySet()) {
            System.out.println(pair);
        }

        System.out.println("removing friday purchase...");
        count = 0;
        for (String value : map.values()
        ) {
            if (value.equalsIgnoreCase("friday")) {
                count++;

            }
        }
        for (int i = 0; i < count; i++) {

            Purchase milky = null;

            for (Purchase key : map.keySet()
            ) {

                if (map.get(key).equalsIgnoreCase("friday")) {
                    milky = key;
                }
            }
            map.remove(milky);
        }
        for (Map.Entry<Purchase, String> pair : map.entrySet()
        ) {
            System.out.println(pair);
        }
        System.out.println("printing map1");

        for (Map.Entry<Purchase, String> pair : map1.entrySet()
        ) {
            System.out.println(pair);
        }


    }


}
