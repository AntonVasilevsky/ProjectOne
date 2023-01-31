package com.IO.URL.task3;
// save google logo

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) {
        String image = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png";
        try {
            URL url = new URL(image);
            InputStream input = url.openStream();
            Path path = Path.of("e:\\Google.png");
            Files.copy(input, path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
