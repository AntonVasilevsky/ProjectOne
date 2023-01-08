package com.IO.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Reader reader = null;
        int b = 0;
        String st = null;
        BufferedReader bufferedReader = null;

        try {
            reader = new FileReader("e:\\testFileRead.txt");
            bufferedReader = new BufferedReader(reader);

            while ((st = bufferedReader.readLine()) != null)


               System.out.println(st);

        }  catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



    }

}
