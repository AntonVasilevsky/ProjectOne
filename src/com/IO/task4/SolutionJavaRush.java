package com.IO.task4;
// Напиши программу, которая будет считывать с клавиатуры пути к двум директориям и копировать файлы из одной директории
// в другую (только файлы, директории игнорируй).
//Используй соответствующие методы класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), copy().


import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class SolutionJavaRush {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path : files) {
                if (Files.isRegularFile(path)) {
                    Path resolve = targetDirectory.resolve(path.getFileName());
                    Files.copy(path, resolve);
                }
            }
        }
    }
}

