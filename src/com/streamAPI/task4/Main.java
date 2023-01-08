package com.streamAPI.task4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String test = "it's a testing string";
        printSomething(test);
        //printSomething(scanner.nextLine());
        byte[] bytes = outputStream.toByteArray();
        outputStream.reset();
        for (int i = bytes.length-1; i >=0 ; i--) {
            outputStream.write(bytes[i]);
        }
        String result = outputStream.toString();

        System.out.println(result);


    }

    public static void printSomething(String str) {

            stream.print(str);


    }
}
