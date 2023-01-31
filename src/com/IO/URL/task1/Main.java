package com.IO.URL.task1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public Main() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        URL url = new URL(line);
        InputStream input = url.openStream();

        Path tempFile = Files.createTempFile(null, null);
        Files.write(tempFile, input.readAllBytes());
    }

    }

// Напиши код, который будет считывать с клавиатуры ссылку на файл в интернете, скачивать его и сохранять
//во временный файл.
//Используй методы createTempFile(null, null) и write(Path, byte[]) класса Files, а также метод openStream()
//класса URL.