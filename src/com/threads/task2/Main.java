package com.threads.task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object monitor = new Object();
        Runnable action  = () -> {
            String s = Thread.currentThread().getName();
            System.out.println("я начал "+s);
            synchronized (monitor){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }}
            System.out.println("я закончил "+s);
        };
        Thread thread1 = new Thread(action);
        thread1.join();
        Thread thread2 = new Thread(action);
        Thread thread3 = new Thread(action);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
