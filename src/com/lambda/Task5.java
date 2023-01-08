package com.lambda;

public class Task5 {
    static void print (float a, float b, float c, E e){
        System.out.println(e.numbers(a, b, c));
    }
    static void printPow(float a, float b, float c, E e){
        System.out.println(e.numbers(a, b, c));
    }

    public static void main(String[] args) {
        print(1.2f, 7.6f, 0.3f, ((a, b, c) -> (float) Math.pow(b, 2)-4*a*c));
        printPow(4.0f, 2.0f, 3.0f, (a, b, c) -> a*(float) Math.pow(b, c));
    }
    interface E{

        float numbers(float a, float b, float c);
    }
}
