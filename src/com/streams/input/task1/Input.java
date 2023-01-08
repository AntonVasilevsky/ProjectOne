package com.streams.input.task1;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Input {
    public static void main(String[] args) {


        FileInputStream fis = null;

        int read = 0;


        InputStreamReader isr = null;

        System.out.println();

        {
            try {
                fis = new FileInputStream("e://1.txt");

               // isr = new InputStreamReader(fis,"UTF-8");// почему не меняется кодировка?
                while((read = isr.read())!=-1){
                    System.out.println((char) read);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e){
                e.printStackTrace();
            }finally {
                try {
                    fis.close(); // почему нужно закрывать в отдельном блоке try?

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    isr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
