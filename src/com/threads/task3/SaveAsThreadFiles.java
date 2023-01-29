package com.threads.task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveAsThreadFiles implements Runnable {
    private int id;

    int[][] arrays = {{1,2,3}, {3,3,3}, {2,2,2}};
    String[] paths = {"C:/java/1.txt", "C:/java/2.txt", "C:/java/3.txt"};


    public SaveAsThreadFiles(int id){
        this.id = id;
    }



    public void saveToFile(int[] array) {




        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(paths[id], true)))) {
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
