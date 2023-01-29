package com.threads.tunnel;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Object l1 = new Object();
        Object l2 = new Object();

        Operator op = new Operator();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
              
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        t2.start();

        t1.start();






    }
}
