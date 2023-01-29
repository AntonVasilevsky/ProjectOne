package com.threads.synchronizedExample;
// два потока синхронизируются на мониторах разных объектов и параллелльно выполняют разные методы, не ждут очереди

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {

        new Worker().main();
    }
}

class Worker {
    Object lock1 = new Object();
    Object lock2 = new Object();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
    Random rng = new Random();

    public void main() {
        long before = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                work();

            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        long after = System.currentTimeMillis();

        System.out.println("Program took: " + (after - before) + " ms to run.");
        System.out.println("List1: " + list1.size());
        System.out.println("List2: " + list2.size());
    }

    public void addToListOne() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            list1.add(rng.nextInt(100));
        }
    }

    public void addToListTwo() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            list2.add(rng.nextInt(100));
        }
    }

    public void work() {
        for (int i = 0; i < 5; i++) {
            addToListOne();
            addToListTwo();
        }

    }
}
