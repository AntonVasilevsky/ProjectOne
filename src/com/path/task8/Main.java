package com.path.task8;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        String str = "\\test\\test.txt";
        Path path = Path.of(str);
        System.out.println(!path.isAbsolute() ? path.toAbsolutePath() : path);
    }
}
