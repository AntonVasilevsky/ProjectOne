package com.QuickTest;

public class Main {
    public static void main(String[] args) {


        String s = "bread;155;1;20";
        String ss = "milk;131;2";
        int index = ss.lastIndexOf(";");
        String substring = s.substring(index + 1);
        System.out.println();
    }
}
