package com.methods;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Student  s1 = new Student(1, "Anton", "Vasilevsky", 8, 3, 1985, 239847, 24, "7");
        Student  s2 = new Student(2, "Ivan", "Ilushenko", 8, 3, 1987, 239847, 24, "8");
        Student  s3 = new Student(3, "Snezha", "Vasilevskaya", 8, 3, 1987, 239847, 24, "9");
        Student  s4 = new Student(4, "Vasya", "Vsilyev", 8, 3, 1988, 239847, 25, "7");
        Student  s5 = new Student(5, "Zulya", "SultanSuleyman", 8, 3, 1986, 239847, 25, "8");
        Student  s6 = new Student(6, "Nastya", "Ilushenko", 8, 3, 1989, 239847, 25, "9");
        Student  s7 = new Student(7, "Math", "Coala", 8, 3, 1985, 239847, 25, "7");
        Student[] students = {s1, s2, s3, s4, s5, s6, s7};
        schoolList(students, 3,6);










    }
    public static void schoolList(Student[] students,int schoolNumber, int num){
        for (Student s: students
             ) {
            if(s.getId()>=schoolNumber&&s.getId()<=num){
                System.out.println(s);
            }
        }
    }







}
