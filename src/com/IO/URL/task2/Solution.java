package com.IO.URL.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Solution {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
            InputStream input = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            while (reader.ready()){
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
/* byte[] buffer = input.readAllBytes();
        String str = new String(buffer);
        System.out.println(str); */
