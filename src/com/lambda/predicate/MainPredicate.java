package com.lambda.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainPredicate {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Anton", 37, 1));
        students.add(new Student("Ivan", 27, 2));
        students.add(new Student("Zaur", 36, 3));
        students.add(new Student("Lion", 32, 4));
        ArrayList<Student> age = new ArrayList<>();
        for (Student s : students
             ) {

            if(s.getAge()>31)
                age.add(s);
        }
        System.out.println(age);
        Predicate<Student> predicate = student -> student.getAge()>31;

        List<Student> age1 = students.stream().filter(s -> s.getAge()>31).collect(Collectors.toList());
        boolean bool = predicate.test(students.get(1));
        System.out.println(bool);

    }
}
class Student{
    private String name;
    private int age;
    private int course;

    public Student(String name, int age, int course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}
