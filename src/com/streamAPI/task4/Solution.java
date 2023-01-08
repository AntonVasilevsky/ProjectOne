package com.streamAPI.task4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String  test = reverseOrder(scanner.nextLine());



        printSomething(test);



        String result = outputStream.toString();
        System.out.println(result);

    }

    public static void printSomething(String str) {
        stream.print(str);
    }
    public static String  reverseOrder(String test){
        Character[] character = arrayConverter(test);
        ArrayList<Character> list = convertToArrayList(character);
        String reversed = list.stream().sorted((a, b) -> list.indexOf(a) - list.indexOf(b))
                .map(n -> String.valueOf(n)).collect(Collectors.joining());

        return reversed;


    }
    public static ArrayList<Character> convertToArrayList(Character[] character){
        ArrayList<Character> list = new ArrayList<>();
        for (Character character1 : character) {
            list.add(character1);
        }
        return list;
    }
    public static Character[] arrayConverter(String test){
        char[] chars = test.toCharArray();
        //System.out.println(Arrays.toString(chars));
        Character[] character = new Character[chars.length];
        for (int i = 0; i < chars.length; i++) {
            character[i] = chars[i];
        }
        //System.out.println(Arrays.toString(character));
        return character;
    }
}
