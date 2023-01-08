package com.IO.task4;


import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Solution {
            public static void main(String[] args) throws IOException {
                Scanner scanner = new Scanner(System.in);
                Path sourceDirectory = Path.of("e:\\dir1");
                //Path sourceDirectory = Path.of(scanner.nextLine());
                Path targetDirectory = Path.of("e:\\dir2");
                //Path targetDirectory = Path.of(scanner.nextLine());
                DirectoryStream<Path> directoryStream1 = Files.newDirectoryStream(sourceDirectory);
                //DirectoryStream<Path> directoryStream2 = Files.newDirectoryStream(targetDirectory);
                directoryStream1.forEach(path -> {
                    if(Files.isDirectory(path)){
                        try {
                            Files.copy(path, targetDirectory);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                } );
                directoryStream1.close();
            }
        }

