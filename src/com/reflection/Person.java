package com.reflection;

public class Person implements Identifiable {
    private String name;
    private Integer age;
    private Integer number;

    public String getUniqueData(){
        return String.format("%s with age %s", name, age);
    }

    public Integer getAge() {
        return age;
    }
    public void print(String name){
        System.out.println("my name is "+name);
    }


}
