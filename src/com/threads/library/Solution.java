package com.threads.library;

public class Solution {
    public static void main(String[] args) {
        Library library = new Library();
        Reader reader = new Reader(library);
        library.addBooksToStorage(3);

        for (int i = 0; i<5; i++){
            Thread thread = new Thread(new Reader(library));
            thread.start();
        }
    }
}
