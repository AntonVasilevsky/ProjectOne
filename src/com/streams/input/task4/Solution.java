package com.streams.input.task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Path path = Paths.get(console.nextLine());
        try {
            List<String> strings = Files.readAllLines(path);
            for (int i = 1; i <= strings.size(); i++) {
                if(i%2!=0) {
                    System.out.println(strings.get(i - 1));
                }
                }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
