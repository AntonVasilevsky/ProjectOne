package com.threads.task3;

import java.io.*;

public class SaveAsThread implements Runnable{
    private int id;

    int[][] arrays = {{1,2,3}, {3,3,3}, {2,2,2}};


    public SaveAsThread(int id){
        this.id = id;
    }



        public void saveToFile(int[] array) {


            try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/java/1.txt", true)))) {
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
        saveToFile(arrays[id]);
    }
}
