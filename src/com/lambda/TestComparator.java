package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args) {
        Student st1 = new Student(23, 4);
        Student st2 = new Student(20, 1);
        Student st3 = new Student(21, 2);
        Student st4 = new Student(22, 3);
        ArrayList<Student> list = new ArrayList<>(Arrays.asList(st1, st2, st3,st4));
       /* Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge()-o1.getAge();
            }
        });*/
        Collections.sort(list, (o1, o2) -> o2.getAge()- o1.getAge());
        System.out.println(list);

    }

}
