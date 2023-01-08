package com.path.task11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// Files: newDirectoryStream(Path), isRegularFile(Path) и isDirectory(Path).
public class Main {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //Path directory = Path.of(scanner.nextLine());
        String s = "e:\\";
        Path directory = Path.of(s);

        Files.newDirectoryStream(directory).forEach(e -> {      // терминальный метод? похоже, что нет
            if (Files.isRegularFile(e)) {
                System.out.println(e+THIS_IS_FILE);

            } else if (Files.isDirectory(e)) {
                System.out.println(e+THIS_IS_DIR);
            }
        });
    }
}
