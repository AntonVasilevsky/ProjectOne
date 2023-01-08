package com.lambda;

public class Test {
    static void print(I i){
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        print((String s)-> s.length());
    }
    interface I{
        int abc(String s);
    }
}
