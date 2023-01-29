package com.IO.task4;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

// Напиши программу, которая будет считывать с клавиатуры пути к двум директориям и копировать файлы из одной директории
// в другую (только файлы, директории игнорируй).
//Используй соответствующие методы класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), copy().
public class Main {
    public static void main(String[] args) {

        Path source = Path.of("c:\\java\\dir1");
        Path dest = Path.of("c:\\java\\dir2");


        try (DirectoryStream<Path> pathDirectoryStream = Files.newDirectoryStream(source)){

            pathDirectoryStream.forEach(path -> {
                if(Files.isRegularFile(path)){

                    Path copy = Path.of(dest.toAbsolutePath()+"\\newFile.txt");
                    try {
                        Files.copy(path.toAbsolutePath(), copy);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }

}
