package com.threads.task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test implements Runnable {


    private int[] array;
   private String path ;


    public Test(int[] array, String path){
        this.array = array;
        this.path = path;
    }



    public void saveToFile(int[] array) {




        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(path, true)))) {
            for (int i : array
            ) {
                out.println(i);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + " " +Thread.currentThread().getName());
        }
        saveToFile(array);
    }
}
