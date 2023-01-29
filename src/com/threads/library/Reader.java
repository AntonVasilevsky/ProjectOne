package com.threads.library;

import java.util.ArrayList;
import java.util.Stack;

public class Reader implements Runnable{
    private Stack<Book> books = new Stack<>();
    private Library library;

    private int numberVisits = 10000;


    public Reader(Library library) {
       this.library = library;
    }

    @Override
    public void run() {
        while(numberVisits !=0) {
            if (!library.getLibraryStorage().isEmpty()) {
                takeBook();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (!books.isEmpty()) {
                returnBook();
            }
            numberVisits--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public void takeBook(){
        books.push(library.getLibraryStorage().pop());
        System.out.println("Thread "+ Thread.currentThread().getName()+ " took the book");


    }
    public void returnBook(){
        library.getLibraryStorage().push(books.pop());
        System.out.println("Thread "+ Thread.currentThread().getName()+ " returned the book");
    }
}
