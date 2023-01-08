package com.path.task7;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

   // Scanner scanner = new Scanner(System.in);
    String str = "c:\\";
    String str2 = "c:\\downloads\\file.txt";
    Path path = Path.of(str).normalize();
    Path path2 = Path.of(str2).normalize();
        try {
            System.out.println(path.relativize(path2));
        } catch (Exception ignored) {
        }


    }
}
