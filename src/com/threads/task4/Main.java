package com.threads.task4;

import java.util.Arrays;

// Имеется два массива: один - целочисленный, второй - строковый. Необходимо создать поток, который при кратности
// на 2 длины элемента строкового массива создает новый поток, считающий среднее арифметическое среди всех элементов
// целочисленного массива.
public class Main {
    public static void main(String[] args) {
        String[] strings = {"asf", "sfgd", "as", "qwe"};
        int[] ints = {1,2,3,4,5};

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (String s : strings) {
                    if(s.length()%2==0){
                        Thread thread1 = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                System.out.println(Arrays.stream(ints).sum()/ints.length);
                                System.out.println(Arrays.stream(ints).average());
                            }
                        });
                        thread1.start();

                    }
                }
            }
        });
        thread.start();

    }
}
