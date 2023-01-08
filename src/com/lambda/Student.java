package com.lambda;

public class Student {
    private int age;
    private int course;

    public Student(int age, int course) {
        this.age = age;
        this.course = course;
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
                "age=" + age +
                ", course=" + course +
                '}';
    }
}
