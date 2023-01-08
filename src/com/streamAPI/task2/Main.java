package com.streamAPI.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("War and peace", "Tolstoy", 3);
        Book book2 = new Book("Shining", "King", 5);
        Book book3 = new Book("Sapiens", "Harari", 4);
        Book book4 = new Book("Sapiens", "Harari", 9);
        ArrayList<Book> books = new ArrayList<>(Arrays.asList(book1, book2, book3, book4));
        Predicate<ArrayList<Book>> predicate = b -> {
            boolean abc = true;
            for (Book book:b
                 ) {
              if(book.pagesCount<500)
                abc = false;

            }
            return abc;
        };

     /*   System.out.println(predicate.test(books));
        System.out.println(Stream.of(books).allMatch(predicate));
        boolean allMatch = books.stream().allMatch(b -> b.pagesCount>500);
        boolean anyMatch = books.stream().anyMatch(book -> book.pagesCount>500);*/
        //Comparator<? super Book> BookComparator = new BookComparator();
       // System.out.println(books.stream().max((Book b1, Book b2)-> b1.pagesCount > b2.pagesCount ? 1 : -1));
        books.stream().sorted((Book b1, Book b2)-> b1.pagesCount > b2.pagesCount ? 1 : -1)
                .forEach(System.out::println);
        System.out.println("dddddddd");https://www.facebook.com/groups/1386117278420846/permalink/1806889323010304/?app=fbl
        System.out.println(books.stream()
                .min((Book b1, Book b2)-> b1.pagesCount > b2.pagesCount ? 1 : -1)); // почему такой вывод?

       /* List<String> authors = books.stream().map(b -> b.author).toList();
        List<String> authors1 = books.stream().map(b -> b.author).collect(Collectors.toList());
        List<String> authors3 = books.stream().map(Book::getAuthor).collect(Collectors.toList());*/



       // books.stream().map(b -> b.author).forEach(System.out::println);
        System.out.println("***");

        books.stream().map(Book::getAuthor).distinct().forEach(System.out::println);
        Author a1 = new Author("Anton", 37);
        Author a2 = new Author("Ivan", 34);
        Author a3 = new Author("Snezha", 32);
        Author a4 = new Author("Nastya", 30);

        List<Author> authors = new ArrayList<>(Arrays.asList(a1, a2, a3, a4));

        authors.stream().filter(p-> p.getAge()>32).forEach(System.out::println);
        System.out.println(authors.stream().mapToInt(p-> p.getAge()).sum());



    }
   /* public static class BookComparator implements Comparator<Book>{

        @Override
        public int compare(Book o1, Book o2) {
            if(o1.pagesCount> o2.pagesCount) {
                return 1;
            } else if (o2.pagesCount>o1.pagesCount) {
                return -1;
            }else return 0;
        }
    }*/
    public static class Book{
        String title;
        String author;
        int pagesCount;

       public String getTitle() {
           return title;
       }

       public String getAuthor() {
           return author;
       }

       public int getPagesCount() {
           return pagesCount;
       }

       public Book(String title, String author, int pagesCount) {
            this.title = title;
            this.author = author;
            this.pagesCount = pagesCount;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", pagesCount=" + pagesCount +
                    '}';
        }
    }
    public static class Author{
        private String name;
        private int age;

        public Author(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Author{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
