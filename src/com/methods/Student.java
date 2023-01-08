package com.methods;

public class Student {
   private int id;
   private String name;
   private String surname;
   public DateBirth dateBirth;
   private int phoneNumber;
   private int school;
   private String classId;
   public class DateBirth{
       private int day;
       private int month;
       private int year;
       public DateBirth(int day, int month, int year){
           this.day = day;
           this.month = month;
           this.year = year;
       }

       public int getYear() {
           return year;
       }

       @Override
       public String toString() {
           return "DateBirth{" +
                   "day=" + day +
                   ", month=" + month +
                   ", year=" + year +
                   '}';
       }
   }

    public Student() {
    }

    public Student(int id, String name, String surname, int day, int month, int year, int phoneNumber, int school, String classId) {
        DateBirth dateBirth = new DateBirth(day, month, year);
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
        this.school = school;
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", school=" + school +
                ", classId=" + classId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }





    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSchool() {
        return school;
    }

    public void setSchool(int school) {
        this.school = school;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }
}
