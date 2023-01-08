package com.path.task1;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Main {
    // newDirectoryStream(), isRegularFile()
    //или isDirectory(), copy().
    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(System.in);
        String source1 = "e:\\test";
        String source2 = "e:\\test2\\text.txt";
        //Path sourceDirectory = Path.of(scanner.nextLine());
        Path sourceDirectory = Path.of(source1);
        //Path targetDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(source2);
        DirectoryStream<Path> directoryStream1 = Files.newDirectoryStream(sourceDirectory);
        //DirectoryStream<Path> directoryStream2 = Files.newDirectoryStream(targetDirectory);
        directoryStream1.forEach(path -> {
            if(Files.isRegularFile(path)){
                try {
                   // Path path1 = Path.of("e:\\test2\\text.txt");
                    Files.copy(path, targetDirectory); // StandardCopyOption.REPLACE_EXISTING
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } /*finally {
                    directoryStream1.close(); // почему не достаточно сигнатуры метода?
                                              // обязательно ли файнали?
                }*/
            }
        } );
        directoryStream1.close();

    }
}
