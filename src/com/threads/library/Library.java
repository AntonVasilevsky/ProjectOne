package com.threads.library;

import java.util.ArrayList;
import java.util.Stack;

public class Library {
    private Stack<Book> libraryStorage = new Stack<>();
    public void addBooksToStorage(int number){
        for (int i = 1; i<=number; i++){
            libraryStorage.push(new Book(i));
        }
    }

    public Stack<Book> getLibraryStorage() {
        return libraryStorage;
    }
}
