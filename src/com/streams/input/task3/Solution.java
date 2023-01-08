package com.streams.input.task3;

import javax.security.auth.callback.CallbackHandler;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String p = sc.nextLine();
        Path path = Paths.get("e:\\file1.txt");
        //Path path = Paths.get(p);
        try {
            List<String> s = Files.readAllLines(path);

            s.forEach(str-> {
                char[] chars = str.toCharArray();
                for (char c : chars
                ) {
                    if (c!='.' && c!=',' && c!=' '){
                        System.out.print(c);
                    }
                }

            });

           /* char[] chars = s.toString().toCharArray();
            char[] chars1 = new char[chars.length-2];
            for (int i = 1; i < chars.length-1; i++) {
                chars1[i-1] = chars[i];
            }

            for (char c : chars1
                 ) {
                if (c!='.' && c!=',' && c!=' '){
                    System.out.print(c);
                }
            }*/

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
