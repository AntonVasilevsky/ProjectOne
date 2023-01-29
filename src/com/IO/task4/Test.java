package com.IO.task4;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Test {
    public static void main(String[] args) throws IOException {
        Path source = Path.of("c:\\java\\dir1");
        Path dest = Path.of("c:\\java\\dir2");

        try (DirectoryStream<Path> files = Files.newDirectoryStream(source)) {
            for (Path path : files) {
                if (Files.isRegularFile(path)) {
                    Path resolve = dest.resolve(path.getFileName());
                    System.out.println(resolve.toAbsolutePath());
                }
            }
        }
    }
}
