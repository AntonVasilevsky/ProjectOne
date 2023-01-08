package com.lambda;

public class Task4 {
    static void print (I i){
        System.out.println(i.twoStrings("hello", "newwwwwww"));
    }

    public static void main(String[] args) {
        print((s1, s2) -> s1.length()>s2.length()? s1 : s2);
    }

interface I{
    String twoStrings (String s1, String s2);
}
}
