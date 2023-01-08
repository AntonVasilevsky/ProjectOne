package com.streamAPI.task1;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Tom", 35);
        Person p3 = new Person("Bob", 24);
        Person p4 = new Person("Sam", 37);
        Person p5 = new Person("Ivan", 18);
        Person p6 = new Person("Ann", 29);
        Person p2 = new Person();
        p2.name = "Jerry";
        p2.age = 25;
        List<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));

       /* PersonComparator pc = new PersonComparator();
        PersonNameComparator pnc = new PersonNameComparator();
        System.out.println(persons);
        persons.sort(pc);
        persons.sort(pnc);
        Collections.sort(persons, ((o1, o2) -> o1.age- o2.age));
        Collections.sort(persons, ((o1, o2) -> o1.name.compareTo(o2.name)));
        System.out.println(persons);*/
        //Stream.of(persons).forEach(System.out::println);
        persons.stream().forEach(p-> {if(p.age<25)System.out.println(p);});


    }
    public static class Person{
        String name;
        int age;

        public Person() {
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    public static class PersonComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
           if(o1.age==(o2.age)){
               return 0;
           } else if (o1.age<o2.age) {
               return -1;
           }else
               return 1;
        }
    }public static class PersonNameComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
           return o1.name.compareTo(o2.name);
        }
    }
   public static class Book{
        String title;
        String author;
        int pagesCount;

       public Book(String title, String author, int pagesCount) {
           this.title = title;
           this.author = author;
           this.pagesCount = pagesCount;
       }
   }
}
