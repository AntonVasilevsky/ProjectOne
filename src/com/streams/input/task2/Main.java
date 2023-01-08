package com.streams.input.task2;

import java.io.*;
import java.nio.file.Files;

import java.nio.file.Paths;

import java.util.Scanner;

import static java.nio.file.StandardOpenOption.*;

public class Main {
    public static void main(String[] args) throws IOException {


        Scanner console = new Scanner(System.in);
        String path1 = console.nextLine();
        String path2 = console.nextLine();


        InputStream inputStream = Files.newInputStream(Paths.get(path1));
        OutputStream outputStream = Files.newOutputStream(Paths.get(path2));


        {
            try {

                byte[] buffer = inputStream.readAllBytes();
                byte[] buffer2 = new byte[buffer.length];


                for (int i = 0; i + 1 < buffer.length; i += 2) {
                    buffer2[i + 1] = buffer[i];
                    buffer2[i] = buffer[i + 1];
                }


                if (buffer.length % 2 != 0) {
                    buffer2[buffer2.length - 1] = buffer[buffer2.length - 1];
                }


                outputStream.write(buffer2, 0, buffer2.length);


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

}
