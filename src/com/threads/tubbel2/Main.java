package com.threads.tubbel2;

import com.threads.tunnel.Tunnel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
       ExecutorService west = Executors.newFixedThreadPool(10);
       ExecutorService east = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            west.submit(new Train()); // how to get thread name?
            east.submit(new Train());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        east.close();
        west.close();


    }

}
