package com.streams.output.task3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        String sr = "dlsfkgjlsdkfgjsd";
        char[] chars = sr.toCharArray();
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = Files
                .newBufferedWriter(Path.of("e:\\file3.txt"));
        bufferedWriter.write(chars);
        bufferedWriter.close();
    }
}
