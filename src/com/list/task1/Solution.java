package com.list.task1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class Solution {


    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        long alAddBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            al.add(al.size()/2, i);

        }
        long alAddAfter = System.currentTimeMillis();
        long alAddResult = alAddAfter - alAddBefore;

        long alRemoveBefore = System.currentTimeMillis();

       for (int i = 0; i < 10000; i++) {
            al.remove(al.size()/2);

        }
        long alRemoveAfter = System.currentTimeMillis();
        long alRemoveResult = alRemoveAfter - alRemoveBefore;

        long llAddBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            ll.add(ll.size()/2, i);

        }
        long llAddAfter = System.currentTimeMillis();
        long llAddResult = llAddAfter - llAddBefore;

        long llRemoveBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {

            ll.remove(ll.size()/2);

        }
        long llRemoveAfter = System.currentTimeMillis();
        long llRemoveResult = llRemoveAfter - llRemoveBefore;
        System.out.println("ArrayList add time:    "+ alAddResult + "ms. LinkedList add time: " + llAddResult+" ms.");
        System.out.println("ArrayList remove time: "+ alRemoveResult +
                "ms. LinkedList remove time: " + llRemoveResult+" ms.");


    }


}
