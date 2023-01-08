package com.list;

import java.sql.Struct;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> boys = new ArrayList<>(Arrays.asList(new Student("m", "Anton", "Vasilevsky"),
                new Student("m", "Vasily", "Pupkin"), new Student("m", "Ivan", "Ivanov"),
                new Student("m", "Stepan", "Bobikov"),
                new Student("m", "Evgeny", "Onegin")));

        ArrayList<Student> girls = new ArrayList<>();
        girls.add(new Student("f", "Anna", "Karenina"));
        girls.add(new Student("f", "Kleopatra", "Egypt"));
        girls.add(new Student("f", "Ilona", "Davidova"));
        girls.add(new Student("f", "Angelina", "Joly"));
        girls.add(new Student("f", "Julia", "Roberts"));

        ArrayList<Student> group = new ArrayList<>();
        group.addAll(boys);
        group.addAll(girls);
        print(group);

        Collections.sort(group, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        System.out.println("***");
        printNumberBoys(group);
        System.out.println("***");
        System.out.println(group.get(group.size() - 1));


        ArrayList<Student> firstClass = new ArrayList<>(group.subList(0, 5));
        System.out.println(firstClass);

        petr(firstClass);

        System.out.println(firstClass);
        System.out.println("***");
        petr(firstClass);
        System.out.println(firstClass);
        Collections.shuffle(firstClass);
        System.out.println(firstClass);
        sameSurnameLastIndex(firstClass);



    }

    public static int getGirlsNumber(ArrayList<Student> list) {
        int number = 0;
        for (Student s : list
        ) {
            if (s.getId().equalsIgnoreCase("m")) {
                number++;
            }
        }
        return number;
    }

    public static void print(ArrayList<Student> list) {
        for (Student s : list
        ) {
            System.out.println(s);
        }
    }

    public static void printNumberBoys(ArrayList<Student> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getId().equalsIgnoreCase("m") && count < 4) {
                count++;
                System.out.println(list.get(i));

            }

        }
    }

    public static void stud(ArrayList<Student> list) {
        Scanner console = new Scanner(System.in);
        String newStudent = console.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equalsIgnoreCase(newStudent)) {
                System.out.println("pos: " + (i + 1));
            }
        }

    }

    public static void petr(ArrayList<Student> firstClass) {
        boolean isThere = false;
        for (int i = 0; i < firstClass.size(); i++) {
            if (firstClass.get(i).getName().equalsIgnoreCase("Petr")
                    && firstClass.get(i).getSurname().equalsIgnoreCase("petrov")) {
                isThere = true;
            }
        }
        if (!isThere) {
            firstClass.add(firstClass.size() / 2, new Student("m", "Petr", "Petrov"));
        } else {
            firstClass.add(new Student("m", "Fedor", "Onegin"));
        }
    }

    public static void getNumberByName(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type name");
        String name = sc.nextLine();
        System.out.println("type surname");
        String surname = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (student.getName().equalsIgnoreCase(name) && student.getSurname().equalsIgnoreCase(surname)) {
                System.out.println("Sudents  number is " + i);
                break;
            } else {
                System.out.println("There's no such student");
            }

        }
    }

    public static void sameSurnameLastIndex(ArrayList<Student> list) {
        int index = 0;
        int counter = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            Student s1 = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                Student s2 = list.get(j);
                if (s1.getSurname().equalsIgnoreCase(s2.getSurname())) {
                    counter++;
                    if(counter>1){
                        index = j;
                    }
                }
            }


        }
        System.out.println(list.get(index)+" Pos "+index);
    }
    public static void changeClass(ArrayList<Student> oldClass, ArrayList<Student> newClass, int student){
        newClass.add(oldClass.get(student));
        oldClass.remove(student);

    }


}
