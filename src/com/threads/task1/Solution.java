package com.threads.task1;

public class Solution {
    public static void main(String[] args) throws InterruptedException {

        Thread thread0 = new Thread(action);
        Thread thread1 = new Thread(action);

        thread0.start();
        thread0.sleep(3000);


        thread1.start();




    }
    static Runnable action = () -> {
        String s = Thread.currentThread().getName();
        System.out.println(s+ ": i started " );
        if(s.equalsIgnoreCase("thread-0")){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("#"+i+" "+s );
        }
        System.out.println(s+ ": i finished " );
    };
    static class ThreadImp implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 4; i++) {
                String s = Thread.currentThread().getName();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i + " " + s);
            }
        }}

        static class MyThread extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    String s = Thread.currentThread().getName();
                    try {
                        this.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i + " " + s);

                }
            }
        }

}
