package com.streamAPI.task5;

public class Main {
    public static void main(String[] args) {

    }
    static class Book{
        private String name;
        private String author;
        private int pageCount;

        public Book(String name, String author, int pageCount){
            this.name = name;
            this.author = author;
            this.pageCount = pageCount;
        }
        public String getName(){
            return name;
        }
        public String getAuthor(){
            return author;
        }
        public int getPageCount(){
            return pageCount;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", pageCount=" + pageCount +
                    '}';
        }
    }
}
