package com.threads.task1;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            int e = 0;
            for (int i = 0; i <= 20; i++) {

                System.out.println(e);
                e+=5;
            }
        });
        Thread thread2 = new Thread(() -> {
            int e = 0;
            for (int i = 0; i <= 20; i++) {
                System.out.println(e);
                e+=5;
            }
        });
        Thread thread3 = new Thread(() -> {
            int e = 0;
            for (int i = 0; i <= 20; i++) {
                System.out.println(e);
                e+=5;
            }
            System.out.println();
        });
        Thread thread4 = new Thread(() -> {
            int e = 0;
            for (int i = 0; i <= 20; i++) {
                System.out.println(e);
                e+=5;
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
