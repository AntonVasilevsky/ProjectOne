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
                op.operate();
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                op.trainGenerator();
            }
        });
        t3.start();

        t1.start();







    }
}
