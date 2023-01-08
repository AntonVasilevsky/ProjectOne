package com.threads.volatileExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Scanner sc = new Scanner(System.in);
        myThread.start();
        sc.nextLine();
        myThread.terminate(); // running может быть захвачена потоком меин и не изменится

    }
}
    class MyThread extends Thread{
        private volatile boolean running = true;
        @Override
        public void run() {
            while (running){
                System.out.println("Hello");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        public void terminate(){
            this.running = false;
        }
    }

