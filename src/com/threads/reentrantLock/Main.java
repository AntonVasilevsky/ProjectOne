package com.threads.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {


    Task task = new Task();
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {

            task.threadOne();
        }
    });
    Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            task.threadTwo();
        }
    });
    thread1.start();
    thread2.start();
    thread2.join();
    thread1.join();
    task.printCounter();


    }


}

class Task{
    private int counter;
    private ReentrantLock lock = new ReentrantLock();

    private void increment(){
        for (int i = 0; i < 10000; i++) {
            counter++;
        }
    }
    public void threadOne(){
        lock.lock();
        try {
            increment();
        }finally {
            lock.unlock();    // always finally
        }

    }
    public void threadTwo(){
        lock.lock();
        try {
            increment();
        }finally {
            lock.unlock();
        }
    }
    public void printCounter(){
        System.out.println(counter);
    }
}