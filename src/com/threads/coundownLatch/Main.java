package com.threads.coundownLatch;

import java.sql.SQLOutput;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        System.out.println("main starts");
    CountDownLatch countDownLatch = new CountDownLatch(3);
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    for(int i = 0; i < 3; i++){
        executorService.submit(new Processor(i, countDownLatch));
    }


    executorService.shutdown();
        for (int i = 0; i < 3; i++) {
            countDownLatch.countDown();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(countDownLatch.getCount());
        }
        System.out.println("main running");

    }
}
class Processor implements Runnable{
    private int id;
    private CountDownLatch countDownLatch;
    public Processor (int id, CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
        this.id = id;
    }
    @Override
    public void run() {


        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(id + " proceeded");


    }
}