package com.threads.task3;
// Заданы три целочисленных массива. Записать эти массивы в файл в паралельних потоках.
// Создать класс SaveAsThread для представления потока, который записывает целочисленный массив в файл.

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) {



        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new SaveAsThreadFiles(i)) ;
            thread.start();

        }

    }


}

