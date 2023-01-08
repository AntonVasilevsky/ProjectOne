package com.streams.input.task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {


        Scanner console = new Scanner(System.in);
    /*String path1 = console.nextLine();
    String path2 = console.nextLine();*/
        String path1 = "e:\\file1.txt";
        String path2 = "e:\\file2.txt";


        InputStream inputStream = Files.newInputStream(Paths.get("e:\\file1.txt"));
        OutputStream outputStream = Files.newOutputStream(Paths.get("e:\\file2.txt"));


        Reader input = null;
        Writer output = null;




            try {

                byte[] buffer = new byte[inputStream.available()];
                byte[] buffer2 = new byte[buffer.length];

                //buffer = inputStream.readAllBytes();



                while (inputStream.available() > 0) {
                    int real = inputStream.read(buffer);

                    outputStream.write(buffer, 0, real);
                }




            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    outputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException();

                }

            }

    }
}
