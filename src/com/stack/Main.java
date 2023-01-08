package com.stack;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String string = "(){}{"; // (){}()

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

     //   (){}[]   ([{}])  ([])/    (){]]}
        // ([]{{()[]}}{})


        Stack<Character> stack = new Stack<>();
        int counter = 0;

        for (int i = 0; i < string.length(); i++) {

            boolean close = map.containsKey(string.charAt(i));
            boolean open = map.containsValue(string.charAt(i));

                if(!close && !open) {
                    continue;
                }
                    if ((stack.size() == 0 && close) ) {
                        System.out.println("Not a correct bracket sequence");
                        break;
                    }
                    if (open) {
                        stack.push(string.charAt(i));
                    } else if (close && map.get(string.charAt(i)) == stack.peek()) {
                        stack.pop();
                    } else {
                        System.out.println("Not a correct bracket sequence");
                        break;
                    }
                    if (i == string.length() - 1&& stack.empty()) {
                        System.out.println("The sequence is correct");
                    }
                    else if(i == string.length() - 1 && !stack.empty()){
                        System.out.println("Not a correct bracket sequence");
                    }



        }







    }
}
