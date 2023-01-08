package com.streams.output.task2;

import java.io.*;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {


        String src = "e:\\file1.txt";
        File file = new File("e:\\file3.txt");
        String dest = "e:\\file3.txt";
        file.createNewFile();
        try  (FileReader fis = new FileReader(src);
              FileWriter fos = new FileWriter(file)){

            char[] chars = new char[65536];
            while (fis.ready()){
                int real = fis.read(chars);
                fos.write(chars, 0, real);
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
