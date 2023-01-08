package com.streams.output.task3;

import com.sun.jdi.request.BreakpointRequest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("e:\\file1.txt");
            byte[] bytes = new byte[fis.available()];
            FileOutputStream fos = new FileOutputStream("e:\\file3.txt");
            while (fis.available()>0){
                int real = fis.read(bytes);
                fos.write(bytes, 0, real);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
